package com.assets.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ExceptionUtil;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.ConstDictionaryMapper;
import com.assets.pojo.ConstDictionary;
import com.assets.pojo.ConstDictionaryExample;
import com.assets.pojo.SysResource;
import com.assets.pojo.SysResourceExample;
import com.assets.service.DictionaryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class DictionaryServiceImpl implements DictionaryService {
	@Autowired
	private ConstDictionaryMapper dictionaryMapper;

	/**
	 * 分页获取所有的数据字典
	 */
	@Override
	public EasyUIDataGridResult getDcitionaryList(int page, int rows) {
		// 分页处理
		PageHelper.startPage(page, rows);
		ConstDictionaryExample example = new ConstDictionaryExample();
		List<ConstDictionary> list = dictionaryMapper.selectByExample(example);
		// 转化为分页对象
		PageInfo<ConstDictionary> pageInfo = new PageInfo<ConstDictionary>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	/**
	 * 添加数据字典
	 */
	@Override
	public ResponseResult addDictionary(ConstDictionary constDictionary) {
		try {
			int count = dictionaryMapper.insert(constDictionary);
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
	public ResponseResult modifyDictionary(ConstDictionary consDictionary) {
		try {
			int count = dictionaryMapper.updateByPrimaryKey(consDictionary);
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
	public ResponseResult deleteDictionary(String ids) {
		String[] id = ids.split(",");
		// TODO 删除数据字典，category 和 costCode两个为主键
		return null;
	}

}
