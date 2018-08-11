package com.assets.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.pojo.FundChange;

public interface FundChangeService extends BaseService {

	/**
	 * 分页获取资金变动项
	 * @param page
	 * @param rows
	 * @return
	 */
	EasyUIDataGridResult getFundChangeList(HttpServletRequest request, Integer page, Integer rows);

}
