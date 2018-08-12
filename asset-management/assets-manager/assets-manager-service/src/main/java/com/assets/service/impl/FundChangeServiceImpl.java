package com.assets.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.DateUtilHelp;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.FundChangeMapper;
import com.assets.pojo.FundChange;
import com.assets.pojo.FundChangeExample;
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
			// 获取登入人员的PSN_CODE
			ResponseResult responseResult = getUserPsnCodeByRequest(request);
			if (responseResult.getStatus() == 200) {

				// 在你需要进行分页的 MyBatis 查询方法前调用 PageHelper.startPage
				// 静态方法即可，紧跟在这个方法后的第一个MyBatis 查询方法会被进行分页。
				PageHelper.startPage(page, rows);
				FundChangeExample example = new FundChangeExample();
				Map<String, Object> map = new HashMap<String, Object>();
				//查询
				map.put("psnCode", Integer.valueOf(responseResult.getData().toString())); // 设置查询条件当前人
				map.put("currentYear", DateUtilHelp.getNowYearStr());// 设置查询条件当前年
				map.put("currentMonth", DateUtilHelp.getNowMonthStr()); // 设置查询条件当前月				
				List<FundChange> list = fundChangeMapper.selectFundChangeList(map); //查询 
				// 获取到分页后的信息
				PageInfo<FundChange> pageInfo = new PageInfo<FundChange>(list);				
				result.setTotal(pageInfo.getTotal());
				result.setRows(list);
				return result;
				}
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}

	}
}
