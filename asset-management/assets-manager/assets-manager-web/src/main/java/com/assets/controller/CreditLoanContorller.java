package com.assets.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.pojo.CreditLoan;
import com.assets.service.CreditLoanService;

@Controller
@RequestMapping("assets")
public class CreditLoanContorller {

	@Autowired
	private CreditLoanService creditLoanService;

	/**
	 * 获取信用借款项的信息
	 */
	@RequestMapping("/CreditLoan/getCreditLoan")
	@ResponseBody
	public EasyUIDataGridResult getCreditLoan(HttpServletRequest request) {
		EasyUIDataGridResult result = creditLoanService.getCreditLoan(request);
		return result;
	}

	/**
	 * 获取信用借款项额度的信息
	 */
	@RequestMapping("/CreditLoan/getCreditLoanAmount")
	@ResponseBody
	public EasyUIDataGridResult getCreditLoanAmount(HttpServletRequest request) {
		EasyUIDataGridResult result = creditLoanService.getCreditLoanAmount(request);
		return result;
	}
}
