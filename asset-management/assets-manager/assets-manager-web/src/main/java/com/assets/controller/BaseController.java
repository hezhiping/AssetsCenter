package com.assets.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assets.common.pojo.KeyValueHelp;
import com.assets.common.utils.DateUtilHelp;

@Controller
@RequestMapping("assets")
public class BaseController {
	
	/**
	 * 获取年份
	 * @return
	 */
	@RequestMapping("/Base/getYear")
	@ResponseBody
	public List<KeyValueHelp> getYear(){
		List<KeyValueHelp> list = DateUtilHelp.getYearLength();
		return list;
	}
	/**
	 * 获取月份
	 * @return
	 */
	@RequestMapping("/Base/getMonth")
	@ResponseBody
	public List<KeyValueHelp> getMonth(){
		List<KeyValueHelp> list = DateUtilHelp.getMonth();
		return list;
	}
}
