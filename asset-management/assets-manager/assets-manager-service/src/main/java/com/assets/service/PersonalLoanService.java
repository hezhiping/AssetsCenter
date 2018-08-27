package com.assets.service;

import javax.servlet.http.HttpServletRequest;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.PersonalLoan;

public interface PersonalLoanService extends BaseService {

	EasyUIDataGridResult getPersonalLoanList(HttpServletRequest request,Integer page, Integer rows);

	ResponseResult addPersonalLoan(PersonalLoan personalLoan,
			HttpServletRequest request);

	ResponseResult modifyPersonalLoan(PersonalLoan personalLoan);

	ResponseResult deletePersonalLoan(String ids);
	

}
