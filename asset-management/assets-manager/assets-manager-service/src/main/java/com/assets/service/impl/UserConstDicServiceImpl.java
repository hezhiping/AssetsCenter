package com.assets.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import com.assets.common.utils.ExceptionUtil;
import com.assets.common.utils.JsonUtils;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.ConstDictionaryMapper;
import com.assets.mapper.UserConstDicMapper;
import com.assets.pojo.ConstDictionary;
import com.assets.pojo.UserConstDic;
import com.assets.pojo.UserConstDicExample;
import com.assets.pojo.UserConstDicExample.Criteria;
import com.assets.service.UserConstDicService;

@Service
public class UserConstDicServiceImpl extends BaseServiceImpl implements
		UserConstDicService {

	@Autowired
	private UserConstDicMapper userConstDicMapper;
	@Autowired
	private ConstDictionaryMapper constDicMapper;
	
	@Value("${EHCACHE_U_CONST_DIC_KEY}")
	private String EHCACHE_U_CONST_DIC_KEY;
	
	@Autowired
	private CacheManager cacheManager;
	
	/**
	 * 添加用户配置的项
	 */
	@Override
	public ResponseResult AddUserSetDic(String ids, HttpServletRequest request,String itemKey) {
		try {
			ResponseResult result = getUserPsnCodeByRequest(request);
			// 获取登录的人员信息
			if (result.getStatus() == 200) {
				Long psn_code = Long.valueOf(result.getData().toString());
				// 1、先删除数据
				UserConstDicExample example = new UserConstDicExample();
				Criteria criteria = example.createCriteria();
				criteria.andCategoryEqualTo(itemKey);
				criteria.andPsnCodeEqualTo(psn_code);
				userConstDicMapper.deleteByExample(example);				
				
				// 再插入数据
				UserConstDic userConstDic = new UserConstDic();
				userConstDic.setCategory(itemKey);
				userConstDic.setPsnCode(psn_code);
				userConstDic.setCostCode(ids);
				int insertCount = userConstDicMapper.insert(userConstDic);
				if(insertCount <= 0){
					return ResponseResult.build(500, "添加失败!");
				}else {
					Cache uDicCache = cacheManager.getCache(EHCACHE_U_CONST_DIC_KEY); // 获取缓存配置中的缓存容器
					uDicCache.clear(); // 清空用户配置的常数缓存，清空容器
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return ResponseResult.ok();
	}

	
	/**
	 * 获取用户配置的项
	 */
	@Override
	public List<UserConstDic> getUserSetDic(HttpServletRequest request,Map<String, Object> map) {
		
		List<UserConstDic> list = new ArrayList<UserConstDic>();
		try {
			// 获取登录的人员信息
			ResponseResult result = getUserPsnCodeByRequest(request);
			// 判断缓存中是否存在
			if (result.getStatus() == 200) {
				// 创建map 存取mapper中查询条件的值				
				map.put("psnCode", result.getData());
				// 查找用户设置的参数
				UserConstDic constDic = userConstDicMapper.selectUserSetDic(map);
				//得到配置的参数
				if (constDic == null) {
					return list;
				}
				// 根据用户配置的常数id,获取常熟字典的信息
				getConstDicById(list, constDic);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return list;
		}
		return list;
	}

	/**
	 * 根据用户配置的常数id,拆分，获取常熟字典的信息
	 * @param list
	 * @param constDic
	 */
	private void getConstDicById(List<UserConstDic> list,
			UserConstDic constDic) {
		// 获取到配置的参数主键，形式为：4,5,6,7,8,9,15
		String constCodes = constDic.getCostCode();
		//分割参数，获取名称
		String[] constCodeArray = constCodes.split(",");
		// 循环根据每个constCode，获取到名称
		for (String constCode : constCodeArray) {
			// new 一个 POJO 来存储取到的数据
			UserConstDic userConstDic = new UserConstDic();
			// 从参数表中获取数据
			ConstDictionary constDictionary = constDicMapper.selectByPrimaryKey(Integer.valueOf(constCode));
			// 设置取到的id,和名称
			userConstDic.setCostCode(constCode);
			userConstDic.setCostName(constDictionary.getZhCnCaption());
			// 添加进集合
			list.add(userConstDic);
		}
	}

	/**
	 * 获取用户配置损益、分类
	 */
	@Override
	public List<UserConstDic> getProfitLossPayIncomType(HttpServletRequest request,
			Map<String, Object> map) {
		List<UserConstDic> list = new ArrayList<UserConstDic>();
		try {
			// 获取登录的人员信息
			ResponseResult result = getUserPsnCodeByRequest(request);
			// 判断缓存中是否存在
			if (result.getStatus() == 200) {
				String psnCode = result.getData().toString(); //人员编号
				String cacheType = map.get("cacheType").toString(); // 是哪种形式的缓存： 损益  还是 收入支出
				String cacheKey = EHCACHE_U_CONST_DIC_KEY +":"+ psnCode +"_" + cacheType; // 定义缓存的健
				Cache uDicCache = cacheManager.getCache(EHCACHE_U_CONST_DIC_KEY); // 获取缓存配置中的缓存容器
				ValueWrapper valueWrapper = uDicCache.get(cacheKey);  // 通过健去获取缓存中的值
				if (valueWrapper == null) {
					// 第一次加载，从数据库取;
					// 创建map 存取mapper中查询条件的值				
					map.put("psnCode", psnCode);
					// 查找用户设置的参数
					UserConstDic constDic = userConstDicMapper.selectProfitLossPayIncomType(map);
					//得到配置的参数
					if (constDic == null) {
						return list;
					}
					// 根据用户配置的常数id,获取常熟字典的信息
					getConstDicById(list, constDic);
					// 加入缓存
					uDicCache.put(cacheKey, JsonUtils.objectToJson(list));
				}else {
					// 后面加载，从缓存中取
					// 把json转换成list对象
					list = JsonUtils.jsonToList(valueWrapper.get().toString(),UserConstDic.class );					
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return list;
		}
		return list;
	}
	
	


}
