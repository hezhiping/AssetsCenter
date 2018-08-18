package com.assets.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.PayCollectionMapper;
import com.assets.pojo.InsertUpdateDataPojo;
import com.assets.pojo.PayCollection;
import com.assets.pojo.PayCollectionExample;
import com.assets.service.PayCollectionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class PayCollectionServiceImpl extends BaseServiceImpl implements PayCollectionService {

	@Autowired
	private PayCollectionMapper payCollectionMapper;

	/**
	 * 分页获取数据
	 */
	@Override
	public EasyUIDataGridResult getPayCollectionList(HttpServletRequest request, Integer page, Integer rows) {
		
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		try {
			//获取psnCode
			ResponseResult responseResult = getUserPsnCodeByRequest(request);
			if(responseResult.getStatus() == 200){
				// 后面的第一个查询方法执行分页
				PageHelper.startPage(page, rows);
				PayCollectionExample example = new PayCollectionExample();
				List<PayCollection> list = payCollectionMapper.selectByExample(example );
				// new 一个分页信息
				PageInfo<PayCollection> pageInfo = new PageInfo<PayCollection>(list);
				// 补全 EasyUIDataGridResult 需要的信息
				result.setTotal(pageInfo.getTotal());
				result.setRows(list);
			}			
		} catch (Exception e) {
			e.printStackTrace();
			return  result;
		}
		return result;								
	}

	@Override
	public ResponseResult addPayCollection(HttpServletRequest request,
			List<InsertUpdateDataPojo> list) {
		// 待收款项添加
		return null;
	}
}
