package com.assets.service;

import javax.servlet.http.HttpServletRequest;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.FixedAsset;

public interface FixedAssetsService extends BaseService {

	/**
	 * 分页获取数据
	 * @param page
	 * @param rows
	 * @return
	 */
	EasyUIDataGridResult getfixedAssetsList(Integer page, Integer rows);

	/**
	 * 添加固定资产项
	 * @param fixedAsets
	 * @param request
	 * @return
	 */
	ResponseResult addFixedAssets(FixedAsset fixedAsets, HttpServletRequest request);

	/**
	 * 修改固定资产项
	 * @param fixedAssets
	 * @return
	 */
	ResponseResult modifyFixedAssets(FixedAsset fixedAssets);

	/**
	 * 删除固定资产项
	 * @param ids
	 * @return
	 */
	ResponseResult deleteFixedAssets(String ids);

}
