package com.assets.service;

import javax.servlet.http.HttpServletRequest;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.FixedAsset;

public interface FixedAssetsService extends BaseService {

	EasyUIDataGridResult getfixedAssetsList(Integer page, Integer rows);

	ResponseResult addFixedAssets(FixedAsset fixedAsets, HttpServletRequest request);

	ResponseResult modifyFixedAssets(FixedAsset fixedAssets);

}
