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
import com.assets.mapper.InvestBankMapper;
import com.assets.pojo.InsertUpdateDataPojo;
import com.assets.pojo.InvestBank;
import com.assets.pojo.InvestBankExample;
import com.assets.pojo.InvestBankExample.Criteria;
import com.assets.service.InvestBankService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class InvestBankServiceImpl extends BaseServiceImpl implements
		InvestBankService {

	@Autowired
	private InvestBankMapper investBankMapper;

	/**
	 * 分页获取数据
	 */
	@Override
	public EasyUIDataGridResult getInvestBankList(HttpServletRequest request,
			Integer page, Integer rows) {

		EasyUIDataGridResult result = new EasyUIDataGridResult();
		try {
			// 获取psnCode
			ResponseResult responseResult = getUserPsnCodeByRequest(request);
			if (responseResult.getStatus() == 200) {
				// 后面的第一个查询方法执行分页
				PageHelper.startPage(page, rows);

				InvestBankExample example = new InvestBankExample();
				Criteria criteria = example.createCriteria();
				criteria.andPsnCodeEqualTo((Integer) responseResult.getData());
				criteria.andCurrentMonthEqualTo(DateUtilHelp.getNowMonthStr());
				criteria.andCurrentYearEqualTo(DateUtilHelp.getNowYearStr());
				List<InvestBank> list = investBankMapper
						.selectByExample(example);

				// 获取统计金额总数
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("startRow", (page - 1) * rows);
				map.put("Rows", rows);
				List<InvestBank> footList = investBankMapper.selectInvestSum(map);

				// new 一个分页信息
				PageInfo<InvestBank> pageInfo = new PageInfo<InvestBank>(list);
				// 补全 EasyUIDataGridResult 需要的信息
				result.setTotal(pageInfo.getTotal());
				result.setRows(list);
				result.setFooter(footList);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}

	@Override
	public ResponseResult addInvestBank(HttpServletRequest request,
			List<InsertUpdateDataPojo> list) {
		// 待收款项添加
		try {
			// 获取登入人员的PSN_CODE
			ResponseResult responseResult = getUserPsnCodeByRequest(request);
			if (responseResult.getStatus() == 200) {
				// 判断是新增的记录还是修改的记录
				for (InsertUpdateDataPojo investBank : list) {
					// insert的数据
					if (investBank.getType().equals("insert")) {
						// 将泛型getInsertUpdateData转json再转PayCollection对象
						// 强制转换出现错误：java.util.LinkedHashMap cannot be cast to
						// com.assets.pojo.PayCollection;
						List<InvestBank> insertRecord = JsonUtils.jsonToList(
								JsonUtils.objectToJson(investBank
										.getInsertUpdateData()),
								InvestBank.class);
						for (InvestBank ibInsert : insertRecord) {
							ibInsert.setPsnCode((Integer) responseResult
									.getData());
							ibInsert.setCurrentYear(DateUtilHelp
									.getNowYearStr(ibInsert.getInvestDate()));
							ibInsert.setCurrentMonth(DateUtilHelp
									.getNowMonthStr(ibInsert.getInvestDate()));
							ibInsert.setCreateDate(new Date());
							int sumInsert = investBankMapper.insert(ibInsert);
							if (sumInsert <= 0) {
								return ResponseResult.build(500, "添加失败");
							}
						}
					} else if (investBank.getType().equals("update")) {// update的数据
						// 将泛型getInsertUpdateData转json再转PayCollection对象
						// 强制转换出现错误：java.util.LinkedHashMap cannot be cast to
						// com.assets.pojo.PayCollection;
						List<InvestBank> updateRecord = JsonUtils.jsonToList(
								JsonUtils.objectToJson(investBank
										.getInsertUpdateData()),
								InvestBank.class);
						for (InvestBank ibUpdate : updateRecord) {
							ibUpdate.setCurrentYear(DateUtilHelp
									.getNowYearStr(ibUpdate.getInvestDate()));
							ibUpdate.setCurrentMonth(DateUtilHelp
									.getNowMonthStr(ibUpdate.getInvestDate()));
							int sumUpdate = investBankMapper
									.updateByPrimaryKey(ibUpdate);
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
