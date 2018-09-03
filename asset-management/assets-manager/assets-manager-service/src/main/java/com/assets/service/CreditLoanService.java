package com.assets.service;

import javax.servlet.http.HttpServletRequest;

import com.assets.common.pojo.EasyUIDataGridResult;

public interface CreditLoanService extends BaseService {

	/**
	 * 获取信用借款表格的信息	
	 * @param request
	 * @return
	 */
	EasyUIDataGridResult getCreditLoan(HttpServletRequest request);

	/**
	 *  获取信用借款项额度的信息	
	 */
	EasyUIDataGridResult getCreditLoanAmount(HttpServletRequest request);

}
