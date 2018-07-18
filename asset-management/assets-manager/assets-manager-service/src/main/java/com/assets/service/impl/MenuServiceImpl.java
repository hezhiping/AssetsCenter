package com.assets.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.pojo.ZtreeJsonResult;
import com.assets.mapper.SysResourceMapper;
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

		SysResourceExample example = new SysResourceExample();		
		 List<SysResource> list = menueMapper.selectByExample(example);

		PageInfo<SysResource> pageInfo = new PageInfo<SysResource>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

}
