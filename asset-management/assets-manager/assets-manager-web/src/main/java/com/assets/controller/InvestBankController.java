package com.assets.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.JsonUtils;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.InsertUpdateDataPojo;
import com.assets.service.InvestBankService;

@Controller
@RequestMapping("assets")
public class InvestBankController {
	@Autowired
	private InvestBankService investBankService;
	
	
	/**
	 * 分页查询数据
	 * @param request
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/InvestBank/investBankList")
	@ResponseBody
	public EasyUIDataGridResult getInvestBankList(
			HttpServletRequest request,
			@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "100") Integer rows) {
		EasyUIDataGridResult result = investBankService
				.getInvestBankList(request, page, rows);
		return result;
	}
	

	/**
	 * 添加资金变动项
	 * @requestBody注解常用来处理content-type不是默认的application/x-www-form-urlcoded编码的内容，
	 * 比如说：application/json或者是application/xml等。一般情况下来说常用其来处理application/json类型。
	 * @return
	 */	
	@RequestMapping(value="/InvestBank/addInvestBank",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult addInvestBank(HttpServletRequest request,@RequestBody String requestJson) {			
		List<InsertUpdateDataPojo> list = JsonUtils.jsonToList(requestJson, InsertUpdateDataPojo.class);		
		ResponseResult result = investBankService.addInvestBank(request,list);
		return result;
	}

}
