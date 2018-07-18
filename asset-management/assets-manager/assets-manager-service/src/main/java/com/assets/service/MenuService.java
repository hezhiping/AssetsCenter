package com.assets.service;

import java.util.List;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.pojo.ZtreeJsonResult;


public interface MenuService {

	List<ZtreeJsonResult> getMenu(String resourceType);
	EasyUIDataGridResult getAllMenu(int page, int rows);
}
