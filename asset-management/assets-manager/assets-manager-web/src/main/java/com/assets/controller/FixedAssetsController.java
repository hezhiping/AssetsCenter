package com.assets.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.pojo.KeyValueHelp;
import com.assets.common.utils.DateUtilHelp;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.FixedAsset;
import com.assets.service.FixedAssetsService;

@Controller
@RequestMapping("assets")
public class FixedAssetsController {
	
	@Autowired
	private FixedAssetsService fixedAssetsService;
	
	/**
	 * 分页获取数据
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/FixedAssets/fixedAssetsList")
	@ResponseBody
	public EasyUIDataGridResult getfixedAssetsList(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "30") Integer rows) {
		EasyUIDataGridResult result =  fixedAssetsService.getfixedAssetsList(page,rows);
		return result;
	}

	/**
	 * 添加固定资产
	 * @param fixedAsets
	 * @return
	 */
	@RequestMapping(value = "/FixedAssets/addFixedAssets",method = RequestMethod.POST)
	@ResponseBody
	public  ResponseResult addFixedAssets(FixedAsset fixedAsets,HttpServletRequest request){		
		ResponseResult result = fixedAssetsService.addFixedAssets(fixedAsets,request);		
		return result;
	}
	/**
	 * 修改固定资产
	 * @param fixedAssets
	 * @return
	 */
	@RequestMapping(value = "/FixedAssets/modifyFixedAssets")
	@ResponseBody
	public ResponseResult modifyFixedAssets(FixedAsset fixedAssets){		
		ResponseResult result = fixedAssetsService.modifyFixedAssets(fixedAssets);		
		return result;
	}
	
	/**
	 * 获取年份
	 * @return
	 */
	@RequestMapping("/FixedAssets/getYear")
	@ResponseBody
	public List<KeyValueHelp> getYear(){
		List<KeyValueHelp> list = DateUtilHelp.getYearLength();
		return list;
	}
	/**
	 * 获取月份
	 * @return
	 */
	@RequestMapping("/FixedAssets/getMonth")
	@ResponseBody
	public List<KeyValueHelp> getMonth(){
		List<KeyValueHelp> list = DateUtilHelp.getMonth();
		return list;
	}
}
