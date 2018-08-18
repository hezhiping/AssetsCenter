package com.assets.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONUtils;
import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.JsonUtils;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.SaveFundCahngePojo;
import com.assets.pojo.FundChange;
import com.assets.service.FundChangeService;

@Controller
@RequestMapping("assets")
public class FundChangeController {

	@Autowired
	private FundChangeService fundChangeService;

	/**
	 * 分页获取资金变动项
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/FundChange/fundChangeList")
	@ResponseBody
	public EasyUIDataGridResult getFundChangeList(HttpServletRequest request,
			@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "100") Integer rows) {
		EasyUIDataGridResult result = fundChangeService.getFundChangeList(request,page,	rows);
		return result;
	}
	
	/**
	 * 添加资金变动项
	 * @requestBody注解常用来处理content-type不是默认的application/x-www-form-urlcoded编码的内容，
	 * 比如说：application/json或者是application/xml等。一般情况下来说常用其来处理application/json类型。
	 * @return
	 */
	
	@RequestMapping(value="/FundChange/addFundChange",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult addFundChange(HttpServletRequest request,@RequestBody String requestJson) {			
		List<SaveFundCahngePojo> list = JsonUtils.jsonToList(requestJson, SaveFundCahngePojo.class);		
		ResponseResult result = fundChangeService.addFundChange(request,list);
		return result;
	}

}
