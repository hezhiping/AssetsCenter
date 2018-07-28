package com.assets.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.pojo.ZtreeJsonResult;
import com.assets.common.utils.ExceptionUtil;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.ConstDictionaryMapper;
import com.assets.mapper.SysResourceMapper;
import com.assets.pojo.ConstDictionary;
import com.assets.pojo.SysResource;
import com.assets.pojo.SysResourceExample;
import com.assets.pojo.SysResourceExample.Criteria;
import com.assets.service.MenuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private SysResourceMapper menueMapper;
	@Autowired
	private  ConstDictionaryMapper consDicMapper;

	/**
	 * @功能 获取菜单
	 * @参数 传入菜单类型
	 * @返回值 返回菜单列表
	 */
	@Override
	public List<ZtreeJsonResult> getMenu(String resourceType) {
		if (StringUtils.isNotBlank(resourceType)) {
			SysResourceExample example = new SysResourceExample();
			Criteria criteria = example.createCriteria();
			criteria.andResourceTypeEqualTo(resourceType);
			List<SysResource> resourceList = menueMapper
					.selectByExample(example);
			List<ZtreeJsonResult> ztreeList = new ArrayList<ZtreeJsonResult>();
			if (resourceList != null && resourceList.size() > 0) {
				for (SysResource resource : resourceList) {
					ZtreeJsonResult ztreePojo = new ZtreeJsonResult();
					ztreePojo.setId(resource.getResourceId().toString());
					ztreePojo.setName(resource.getZhCnName());
					ztreePojo.setpId(resource.getParentId().toString());
					ztreePojo.setPage(resource.getValue());
					ztreeList.add(ztreePojo);
				}
			}
			return ztreeList;
		}
		return null;
	}

	/**
	 * 获取所有的菜单列表
	 */
	@Override
	public EasyUIDataGridResult getAllMenu(int page, int rows) {
		// 分页处理
		PageHelper.startPage(page, rows);

		//SysResourceExample example = new SysResourceExample();
		////获取数据库中的菜单表数据
		//List<SysResource> list = menueMapper.selectByExample(example);		
		List<SysResource> list = menueMapper.selectListAndDic();
		PageInfo<SysResource> pageInfo = new PageInfo<SysResource>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	/**
	 * 添加菜单
	 */
	@Override
	public ResponseResult addMenu(SysResource menuResuorce) {
		try {
			short navEnabled =0;
			menuResuorce.setNavEnabled(navEnabled);
			menueMapper.insert(menuResuorce);	
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return ResponseResult.ok();		
		
	}

	/**
	 * 修改菜单
	 */
	@Override
	public ResponseResult modifyMenu(SysResource menuResuorce) {
		try {
			short navEnabled =0;
			menuResuorce.setNavEnabled(navEnabled);
			int resultCount = menueMapper.updateByPrimaryKey(menuResuorce);
			if(resultCount > 0){
				return ResponseResult.ok();		
			}else {
				return ResponseResult.build(500,"修改失败");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}			
	}

	/**
	 * 删除菜单
	 */
	@Override
	public ResponseResult deleteMenu(String ids) {
		try {
			String[] resIds = ids.split(",");
			for (String resourceId : resIds) {	
				
				int resultCount = menueMapper.deleteByPrimaryKey(Long.valueOf(resourceId));
				if(resultCount <= 0){					
					return ResponseResult.build(500,"删除失败");
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}			
		return ResponseResult.ok();
	}

}
