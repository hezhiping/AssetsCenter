package com.assets.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assets.common.pojo.EasyUIDataGridResult;
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

}
