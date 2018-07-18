package com.assets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @Title: 展示首页
* @Description: 
* @author hzp
* @date 2018年3月28日
*/
@Controller
public class PageController {
	/*
	 *展示登入页面 
	 */
	@RequestMapping("/")
	public String showIndex(){
		return "login";
	}
	
	@RequestMapping("/assets/{page}")
	public String showPage(@PathVariable String page ){
		return page;
	}
	/*
	 *展示注册页面 
	 */
	@RequestMapping("/assets/register")
	private String showRegister() {
		return "register";

	}		
}
