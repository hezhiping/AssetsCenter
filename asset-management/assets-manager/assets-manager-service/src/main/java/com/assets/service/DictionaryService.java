package com.assets.service;

import java.util.List;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.ConstDictionary;

public interface DictionaryService {
	/**
	 * 分页获取数据
	 * @param 
	 * @param 
	 * @return easyUI分页数据
	 */
	EasyUIDataGridResult getDcitionaryList(int page, int rows);

	/**
	 *  添加数据字典
	 * @param 
	 * @return ResponseResult
	 */
	ResponseResult addDictionary(ConstDictionary constDictionary);

	/**
	 * 修改数据字典
	 * @param consDictionary
	 * @return ResponseResult
	 */
	ResponseResult modifyDictionary(ConstDictionary consDictionary);

	/**
	 * 删除数据字典
	 * @param ids
	 * @return
	 */
	ResponseResult deleteDictionary(String ids);

	/**
	 * 获取菜单类别下拉数据源
	 * @param dicMenuType
	 * @return
	 */
	List<ConstDictionary> getDicMenuType(String dicMenuType);

}
