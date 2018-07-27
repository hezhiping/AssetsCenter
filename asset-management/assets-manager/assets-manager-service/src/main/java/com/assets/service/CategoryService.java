package com.assets.service;

import java.util.List;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.ConstCategory;

public interface CategoryService {

	/**
	 * 分页获取数据
	 * @param 
	 * @param 
	 * @return easyUI分页数据
	 */
	EasyUIDataGridResult getCategoryList(Integer page, Integer rows);

	/**
	 *  添加数据字典
	 * @param 
	 * @return ResponseResult
	 */
	ResponseResult addCategory(ConstCategory constCategory);

	/**
	 * 修改数据字典
	 * @param consDictionary
	 * @return ResponseResult
	 */
	ResponseResult modifyCategory(ConstCategory constCategory);

	/**
	 * 删除数据字典
	 * @param ids
	 * @return
	 */
	ResponseResult deleteCategory(String ids);

	/**
	 * 获取所有的菜单类别
	 * @return
	 */
	List<ConstCategory> getCategoryCombox();


}
