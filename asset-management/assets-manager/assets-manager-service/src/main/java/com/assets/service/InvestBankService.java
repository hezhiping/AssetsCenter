package com.assets.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.InsertUpdateDataPojo;

public interface InvestBankService extends BaseService {

	/**
	 * 获取分页数据
	 * @param request
	 * @param page
	 * @param rows
	 * @return
	 */
	EasyUIDataGridResult getInvestBankList(HttpServletRequest request,Integer page, Integer rows);

	/**
	 * 添加数据
	 * @param request
	 * @param list
	 * @return
	 */
	ResponseResult addInvestBank(HttpServletRequest request,
			List<InsertUpdateDataPojo> list);
}
