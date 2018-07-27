package com.assets.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ExceptionUtil;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.ConstCategoryMapper;
import com.assets.pojo.ConstCategory;
import com.assets.pojo.ConstCategoryExample;
import com.assets.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private ConstCategoryMapper categoryMaaper;

	/**
	 * 分页获取所有的数据字典
	 */
	@Override
	public EasyUIDataGridResult getCategoryList(Integer page, Integer rows) {
		// 分页处理
		PageHelper.startPage(page, rows);
		ConstCategoryExample example = new ConstCategoryExample();
		List<ConstCategory> list = categoryMaaper.selectByExample(example);
		// 转化为分页对象
		PageInfo<ConstCategory> pageInfo = new PageInfo<ConstCategory>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	/**
	 * 添加数据字典
	 */
	@Override
	public ResponseResult addCategory(ConstCategory constCategory) {
		try {
			int count = categoryMaaper.insert(constCategory);
			if (count <= 0) {
				return ResponseResult.build(500, "添加数据失败");
			}			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}		
		return ResponseResult.ok();
	}

	/**
	 * 修改数据字典
	 */
	@Override
	public ResponseResult modifyCategory(ConstCategory constCategory) {
		try {
			int count = categoryMaaper.updateByPrimaryKey(constCategory);
			if (count <= 0) {
				return ResponseResult.build(500, "修改失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return ResponseResult.ok();
	}

	/**
	 * 删除数据字典
	 */
	@Override
	public ResponseResult deleteCategory(String ids) {
		try {
			String[] categoryIds = ids.split(",");
			for (String categoryId : categoryIds) {
				int count = categoryMaaper.deleteByPrimaryKey(categoryId);
				if (count <= 0 ) {
					return ResponseResult.build(500, "删除失败");
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return ResponseResult.ok();
	}

	/**
	 * 获取所有菜单类别
	 */
	@Override
	public List<ConstCategory> getCategoryCombox() {
		ConstCategoryExample example = new ConstCategoryExample();		
		List<ConstCategory> list = categoryMaaper.selectByExample(example );
		return list;
	}

}
