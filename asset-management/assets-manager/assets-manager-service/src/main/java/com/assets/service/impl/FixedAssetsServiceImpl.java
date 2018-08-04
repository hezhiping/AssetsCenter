package com.assets.service.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.CookieUtils;
import com.assets.common.utils.ExceptionUtil;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.FixedAssetMapper;
import com.assets.pojo.FixedAsset;
import com.assets.pojo.FixedAssetExample;
import com.assets.pojo.SysUser;
import com.assets.service.FixedAssetsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class FixedAssetsServiceImpl extends BaseServiceImpl implements FixedAssetsService {

	@Autowired
	private FixedAssetMapper fixAssetsMapper;

	/**
	 * 固定资产分页数据获取方法
	 */
	@Override
	public EasyUIDataGridResult getfixedAssetsList(Integer page, Integer rows) {
		//设置分页当前页和显示行数
		PageHelper.startPage(page,rows);
		// 查询数据
		FixedAssetExample example = new FixedAssetExample();
		List<FixedAsset> list = fixAssetsMapper.selectByExampleWithBLOBs(example );
		
		// 转为分页数据
		PageInfo<FixedAsset> pageInfo = new PageInfo<FixedAsset>(list);
		// 转为easyui的分页数据
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);	
		return result;
	}

	/**
	 * 添加固定资产
	 */
	@Override
	public ResponseResult addFixedAssets(FixedAsset fixedAsets,HttpServletRequest request) {
		try {
			// 补充日期
			fixedAsets.setCreateDate(new Date());
			// 获取cookie中的token值
			String token = CookieUtils.getCookieValue(request, "TT_TOKEN");
			// 通过token值调用公用service 中的获取缓存中的人员信息
			ResponseResult result = getUserByToken(token);
			// 判断是否取到了登录人员
			if(result.getStatus() == 200){
				// 获取 user,将 psn_code 数据补充
				SysUser user = (SysUser) result.getData();
				fixedAsets.setPsnCode(user.getUserid());				
				int count = fixAssetsMapper.insert(fixedAsets);
				if (count <= 0) {
					return ResponseResult.build(500, "添加失败");
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return ResponseResult.ok();
	}

	/**
	 * 修改固定资产
	 */
	@Override
	public ResponseResult modifyFixedAssets(FixedAsset fixedAssets) {
		try {
			int count = fixAssetsMapper.updateByPrimaryKeySelective(fixedAssets);
			if (count <= 0) {
				return ResponseResult.build(500, "修改失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return ResponseResult.ok();
	}
	
	
	
	
}
