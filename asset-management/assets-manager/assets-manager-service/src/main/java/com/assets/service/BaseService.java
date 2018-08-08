package com.assets.service;

import javax.servlet.http.HttpServletRequest;

import com.assets.common.utils.ResponseResult;
/**
 * 公用方法接口实现类
 * @author Administrator
 *
 */
public interface BaseService {

	/**
	 * 获取ECache缓存的登录人员信息
	 */
	ResponseResult getUserByToken(String token);

	/**
	 * 获取ECache缓存的登录人员psn_code
	 */
	ResponseResult getUserPsnCodeByRequest(HttpServletRequest request);
}
