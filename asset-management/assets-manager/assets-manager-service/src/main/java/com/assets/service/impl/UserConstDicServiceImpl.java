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
	
	//缓存的类型为损益分类
	@Value("${PROFIT_LOSS_CACHETYPE}")
	private String PROFIT_LOSS_CACHETYPE;	
	
	/**
	 * 添加用户配置的项
	 */
/*	@Override
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
*/
	/**
	 * 添加用户配置的项
	 */
	@Override
	public ResponseResult AddUserSetDic(String ids, HttpServletRequest request,String itemKey) {
		try {
			ResponseResult result = getUserPsnCodeByRequest(request);
			int insertSuccessTag = 0;
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
				String[] constCodes = ids.split(",");
				for (String cosCode : constCodes) {
					UserConstDic userConstDic = new UserConstDic();
					userConstDic.setCategory(itemKey);
					userConstDic.setPsnCode(psn_code);
					userConstDic.setCostCode(cosCode);
					int insertCount = userConstDicMapper.insert(userConstDic);
					if(insertCount <= 0){
						return ResponseResult.build(500, "添加失败!");
					}else {
						insertSuccessTag ++;					
					}					
				}
				// 只要大于0就清空缓存
				if(insertSuccessTag>0){
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
	/*@Override
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
	}*/
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
				list = userConstDicMapper.selectUserSetDic(map);						
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
	/*private void getConstDicById(List<UserConstDic> list,
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
	}*/
	/**
	 * comboBox添加请选择一栏
	 * @param list
	 */
	/*private void addComboxValue(List<UserConstDic> list) {
		UserConstDic constDic = new UserConstDic();
		// 添加请选择项
		constDic.setCostCode("0");
		constDic.setCostName("请选择");
		list.add(constDic);
	}*/

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
				//人员编号
				String psnCode = result.getData().toString(); 
				// 是哪种形式的缓存： 损益  还是 收入支出
				String cacheType = map.get("cacheType").toString(); 
				// 定义缓存的健
				String cacheKey = EHCACHE_U_CONST_DIC_KEY +":"+ psnCode +"_" + cacheType; 
				// 获取缓存配置中的缓存容器
				Cache uDicCache = cacheManager.getCache(EHCACHE_U_CONST_DIC_KEY); 
				// 通过健去获取缓存中的值
				ValueWrapper valueWrapper = uDicCache.get(cacheKey);  
				if (valueWrapper == null) {
					// 损益分类这个不需要请选择项,用 ==去判断会出现不等情况，用字符串比较方法equals		
					// 第一次加载，从数据库取;								
					map.put("psnCode", psnCode);
					if(!cacheType.equals(PROFIT_LOSS_CACHETYPE)){	
						// comboBox添加请选择一栏						
						list = userConstDicMapper.selectPayIncomType(map);
					}else {
						// 查找用户设置的参数 拼接
						list = userConstDicMapper.selectProfitLossType(map);
					}					
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
	
	/**
	 * 添加用户配置项中的期初金额
	 */


	@Override
	public ResponseResult saveBeginMoney(List<UserConstDic> list,
			HttpServletRequest request, String itemKey) {
		try {
			for (UserConstDic userConstDic : list) {
				UserConstDicExample example = new UserConstDicExample();
				Criteria criteria = example.createCriteria();
				criteria.andIdEqualTo(userConstDic.getId());
				userConstDicMapper.updateByExampleSelective(userConstDic, example);
			}			
		} catch (Exception e) {
			e.printStackTrace();
			ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return ResponseResult.ok();
	}
	
	


}
