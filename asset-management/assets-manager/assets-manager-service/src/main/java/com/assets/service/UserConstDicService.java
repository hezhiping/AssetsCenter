package com.assets.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.assets.common.utils.ResponseResult;
import com.assets.pojo.UserConstDic;

public interface UserConstDicService extends BaseService {

	/**
	 * 获取用户配置的项
	 * @param request
	 * @param response
	 * @return
	 */
	List<UserConstDic> getUserSetDic(HttpServletRequest request,Map<String, Object> map);

	/**
	 * 添加用户配置的项
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseResult AddUserSetDic(String ids, HttpServletRequest request,String itemKey);

	/**
	 * 获取用户配置损益分类
	 * @param request
	 * @param response
	 * @return
	 */
	List<UserConstDic> getProfitLossPayIncomType(HttpServletRequest request,Map<String, Object> map);

	/**
	 * 添加用户配置项中的期初金额
	 * @param list
	 * @param request
	 * @param cREDIT_LOAN_KEY
	 * @return
	 */
	ResponseResult saveBeginMoney(List<UserConstDic> list,
			HttpServletRequest request, String itemKey);
	
	

}
