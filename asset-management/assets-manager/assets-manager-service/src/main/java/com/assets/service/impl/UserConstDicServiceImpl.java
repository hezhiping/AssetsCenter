package com.assets.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.assets.common.utils.ExceptionUtil;
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

	// 用户配置的支付项类别名称
	@Value("${PAY_ITEM_KEY}")
	private String PAY_ITEM_KEY;

	/**
	 * 获取用户配置的支出项
	 */
	@Override
	public List<UserConstDic> getUserSetDic(HttpServletRequest request,Map<String, Object> map) {
		// 
		List<UserConstDic> list = new ArrayList<UserConstDic>();
		try {
			// 获取登录的人员信息
			ResponseResult result = getUserPsnCodeByRequest(request);
			// 
			if (result.getStatus() == 200) {
				// 创建map 存取mapper中查询条件的值				
				map.put("psnCode", result.getData());
				UserConstDic constDic = userConstDicMapper.selectUserSetDic(map);
				//得到配置的参数
				if (constDic == null) {
					return list;
				}
				String constCodes = constDic.getCostCode();
				//分割参数，获取名称
				String[] constCodeArray = constCodes.split(",");
				for (String constCode : constCodeArray) {
					UserConstDic userConstDic = new UserConstDic();
					ConstDictionary constDictionary = constDicMapper.selectByPrimaryKey(Integer.valueOf(constCode));
					userConstDic.setCostName(constDictionary.getZhCnCaption());
					list.add(userConstDic);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return list;
		}
		return list;
	}

	/**
	 * 添加用户配置的支出项
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
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return ResponseResult.ok();
	}

}
