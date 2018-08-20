package com.assets.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assets.common.utils.ResponseResult;


public interface LoginService extends BaseService {

	ResponseResult login(String userName,String password,String checkcode,HttpServletRequest request,HttpServletResponse response);
	
	//ResponseResult getUserByToken(String token);
	// TODO 接收token，删除token对应的数据。返回ok。
}
