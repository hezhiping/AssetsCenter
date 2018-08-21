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
import com.assets.mapper.FundChangeMapper;
import com.assets.pojo.FundChange;
import com.assets.pojo.InsertUpdateDataPojo;
import com.assets.service.FundChangeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class FundChangeServiceImpl extends BaseServiceImpl implements
		FundChangeService {

	@Autowired
	private FundChangeMapper fundChangeMapper;

	/**
	 * 分页获取资金变动项
	 */
	@Override
	public EasyUIDataGridResult getFundChangeList(HttpServletRequest request,
			Integer page, Integer rows) {
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		try {
			// TODO 资金变动表添加缓存查询 
			// 获取登入人员的PSN_CODE
			ResponseResult responseResult = getUserPsnCodeByRequest(request);
			if (responseResult.getStatus() == 200) {

				// 在你需要进行分页的 MyBatis 查询方法前调用 PageHelper.startPage
				// 静态方法即可，紧跟在这个方法后的第一个MyBatis 查询方法会被进行分页。
				PageHelper.startPage(page, rows);
				Map<String, Object> map = new HashMap<String, Object>();
				// 查询
				map.put("psnCode", (Integer) responseResult.getData()); // 设置查询条件当前人
				map.put("currentYear", DateUtilHelp.getNowYearStr());// 设置查询条件当前年
				map.put("currentMonth", DateUtilHelp.getNowMonthStr()); // 设置查询条件当前月
				List<FundChange> list = fundChangeMapper
						.selectFundChangeList(map); // 查询
				// 获取到分页后的信息
				PageInfo<FundChange> pageInfo = new PageInfo<FundChange>(list);
				result.setTotal(pageInfo.getTotal());
				result.setRows(list);				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}

	/**
	 * 添加资金变动项
	 */
	@Override
	public ResponseResult addFundChange(final HttpServletRequest request,
			List<InsertUpdateDataPojo> list) {
		try {
			// 获取登入人员的PSN_CODE
			ResponseResult responseResult = getUserPsnCodeByRequest(request);
			if (responseResult.getStatus() == 200) {
				// 判断是新增的记录还是修改的记录
				for (InsertUpdateDataPojo fundCahnge : list) {
					// insert的数据
					if (fundCahnge.getType().equals("insert")) {
						//将泛型getInsertUpdateData转json再转FundChange对象
						// 强制转换出现错误：java.util.LinkedHashMap cannot be cast to com.assets.pojo.FundChange;
						List<FundChange> insertRecord = JsonUtils.jsonToList(JsonUtils.objectToJson(fundCahnge.getInsertUpdateData()), FundChange.class) ;
						for (FundChange fcInsert : insertRecord) {
							fcInsert.setPsnCode((Integer) responseResult
									.getData());
							fcInsert.setCurrentYear(DateUtilHelp
									.getNowYearStr(fcInsert.getConsumeDate()));
							fcInsert.setCurrentMonth(DateUtilHelp
									.getNowMonthStr(fcInsert.getConsumeDate()));
							fcInsert.setCreateDate(new Date());
							int sumInsert = fundChangeMapper.insert(fcInsert);
							if (sumInsert <= 0) {
								return ResponseResult.build(500, "添加失败");
							}
						}
					} else if (fundCahnge.getType().equals("update")) {// update的数据
						//将泛型getInsertUpdateData转json再转FundChange对象
						// 强制转换出现错误：java.util.LinkedHashMap cannot be cast to com.assets.pojo.FundChange;
						List<FundChange> updateRecord = JsonUtils.jsonToList(JsonUtils.objectToJson(fundCahnge.getInsertUpdateData()), FundChange.class);
						for (FundChange fcUpdate : updateRecord) {
							fcUpdate.setCurrentYear(DateUtilHelp
									.getNowYearStr(fcUpdate.getConsumeDate()));
							fcUpdate.setCurrentMonth(DateUtilHelp
									.getNowMonthStr(fcUpdate.getConsumeDate()));
							int sumUpdate = fundChangeMapper
									.updateByPrimaryKeySelective(fcUpdate);
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
