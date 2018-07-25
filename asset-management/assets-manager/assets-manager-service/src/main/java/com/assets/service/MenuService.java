package com.assets.service;

import java.util.List;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.pojo.ZtreeJsonResult;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.SysResource;


public interface MenuService {

	List<ZtreeJsonResult> getMenu(String resourceType);
	EasyUIDataGridResult getAllMenu(int page, int rows);
	ResponseResult addMenu(SysResource menuResuorce);
}
