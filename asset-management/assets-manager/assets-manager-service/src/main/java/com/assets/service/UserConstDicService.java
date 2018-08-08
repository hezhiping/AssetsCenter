package com.assets.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.assets.common.utils.ResponseResult;
import com.assets.pojo.UserConstDic;

public interface UserConstDicService extends BaseService {

	/**
	 * 获取用户配置的支出项
	 * @param request
	 * @param response
	 * @return
	 */
	List<UserConstDic> getUserSetDic(HttpServletRequest request,Map<String, Object> map);

	/**
	 * 添加用户配置的支出项
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseResult AddUserSetDic(String ids, HttpServletRequest request,String itemKey);
	

}
