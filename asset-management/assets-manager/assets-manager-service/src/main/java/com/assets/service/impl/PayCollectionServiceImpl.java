package com.assets.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.DateUtilHelp;
import com.assets.common.utils.ExceptionUtil;
import com.assets.common.utils.JsonUtils;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.PayCollectionMapper;
import com.assets.pojo.InsertUpdateDataPojo;
import com.assets.pojo.PayCollection;
import com.assets.pojo.PayCollectionExample;
import com.assets.pojo.PayCollectionExample.Criteria;
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
				Criteria criteria = example.createCriteria();
				criteria.andPsnCodeEqualTo((Integer)responseResult.getData());
				criteria.andCurrentMonthEqualTo(DateUtilHelp.getNowMonthStr());
				criteria.andCurrentYearEqualTo(DateUtilHelp.getNowYearStr());
				List<PayCollection> list = payCollectionMapper.selectByExample(example);
				
				//获取统计金额总数
				Map<String, Object> map =new HashMap<String, Object>();
				map.put("startRow", (page-1)*rows);
				map.put("Rows", rows);				
				List<PayCollection> footList = payCollectionMapper.selectPaySum(map);
				
				// new 一个分页信息
				PageInfo<PayCollection> pageInfo = new PageInfo<PayCollection>(list);
				// 补全 EasyUIDataGridResult 需要的信息				
				result.setTotal(pageInfo.getTotal());
				result.setRows(list);
				result.setFooter(footList);
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
		try {
			// 获取登入人员的PSN_CODE
			ResponseResult responseResult = getUserPsnCodeByRequest(request);
			if (responseResult.getStatus() == 200) {
				// 判断是新增的记录还是修改的记录
				for (InsertUpdateDataPojo payCollection : list) {
					// insert的数据
					if (payCollection.getType().equals("insert")) {
						//将泛型getInsertUpdateData转json再转PayCollection对象
						// 强制转换出现错误：java.util.LinkedHashMap cannot be cast to com.assets.pojo.PayCollection;
						List<PayCollection> insertRecord = JsonUtils.jsonToList(JsonUtils.objectToJson(payCollection.getInsertUpdateData()), PayCollection.class) ;
						for (PayCollection pcInsert : insertRecord) {
							pcInsert.setPsnCode((Integer) responseResult.getData());
							pcInsert.setCurrentYear(DateUtilHelp.getNowYearStr(pcInsert.getReceiptDate()));
							pcInsert.setCurrentMonth(DateUtilHelp.getNowMonthStr(pcInsert.getReceiptDate()));
							pcInsert.setCreateDate(new Date());
							int sumInsert = payCollectionMapper.insert(pcInsert);
							if (sumInsert <= 0) {
								return ResponseResult.build(500, "添加失败");
							}
						}
					} else if (payCollection.getType().equals("update")) {// update的数据
						//将泛型getInsertUpdateData转json再转PayCollection对象
						// 强制转换出现错误：java.util.LinkedHashMap cannot be cast to com.assets.pojo.PayCollection;
						List<PayCollection> updateRecord = JsonUtils.jsonToList(JsonUtils.objectToJson(payCollection.getInsertUpdateData()), PayCollection.class);
						for (PayCollection pcUpdate : updateRecord) {
							pcUpdate.setCurrentYear(DateUtilHelp.getNowYearStr(pcUpdate.getReceiptDate()));
							pcUpdate.setCurrentMonth(DateUtilHelp.getNowMonthStr(pcUpdate.getReceiptDate()));
							int sumUpdate = payCollectionMapper.updateByPrimaryKeySelective(pcUpdate);
							if (sumUpdate <= 0) {
								return ResponseResult.build(500, "添加失败");
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		return ResponseResult.ok();
	}
}
