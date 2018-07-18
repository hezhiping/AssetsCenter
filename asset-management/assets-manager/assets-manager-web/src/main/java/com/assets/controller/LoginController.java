package com.assets.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assets.common.utils.ExceptionUtil;
import com.assets.common.utils.ResponseResult;
import com.assets.remote.service.ServiceFactory;
import com.assets.service.IUser;
import com.assets.service.LoginService;

/**
* @Title: 登录controller
* @Description: 用户调度登入等操作
* @author hzp
* @date 2018年6月10日
*/
@Controller
@RequestMapping("assets")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	/**
	 * @return 跳转到生成验证码页面，并且返回验证
	 */
	@RequestMapping("/ex/validatecode")
	public String getValidateCode() {		
		return "validatecode";
	}
	
	/**
	 * @return 登录方法
	 */
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult login(String username,String password,String checkcode, HttpServletRequest request,HttpServletResponse response) {
		try {
			ResponseResult result = loginService.login(username, password, checkcode, request, response);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}		
	}
	
	@RequestMapping("/token/{token}")
	@ResponseBody
	public Object login(@PathVariable String token,String callback){
		try {
			ResponseResult result = loginService.getUserByToken(token);
			if (!StringUtils.isBlank(callback)) {
				MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
				mappingJacksonValue.setJsonpFunction(callback);
				return mappingJacksonValue;
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
}
