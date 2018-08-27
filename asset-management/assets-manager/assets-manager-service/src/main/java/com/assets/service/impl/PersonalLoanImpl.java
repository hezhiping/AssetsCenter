package com.assets.service.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.DateUtilHelp;
import com.assets.common.utils.ExceptionUtil;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.PersonalLoanMapper;
import com.assets.pojo.PersonalLoan;
import com.assets.pojo.PersonalLoanExample;
import com.assets.pojo.PersonalLoanExample.Criteria;
import com.assets.service.PersonalLoanService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class PersonalLoanImpl extends BaseServiceImpl implements
		PersonalLoanService {

	@Autowired
	private PersonalLoanMapper personalLoanMapper;

	@Override
	public EasyUIDataGridResult getPersonalLoanList(HttpServletRequest request,Integer page, Integer rows) {
		
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		try {
			// TODO 资金变动表添加缓存查询 
			// 获取登入人员的PSN_CODE
			ResponseResult responseResult = getUserPsnCodeByRequest(request);
			if (responseResult.getStatus() == 200) {

				// 在你需要进行分页的 MyBatis 查询方法前调用 PageHelper.startPage
				// 静态方法即可，紧跟在这个方法后的第一个MyBatis 查询方法会被进行分页。
				PageHelper.startPage(page, rows);				
				// 查询
				PersonalLoanExample example = new PersonalLoanExample();
				Criteria criteria = example.createCriteria();
				criteria.andPsnCodeEqualTo((Integer) responseResult.getData());// 设置查询条件当前人
				criteria.andCurrentMonthEqualTo(DateUtilHelp.getNowMonthStr());// 设置查询条件当前年
				criteria.andCurrentYearEqualTo(DateUtilHelp.getNowYearStr());// 设置查询条件当前月
				List<PersonalLoan> list = personalLoanMapper.selectByExampleWithBLOBs(example);// 查询
				
				// 获取到分页后的信息
				PageInfo<PersonalLoan> pageInfo = new PageInfo<PersonalLoan>(list);
				result.setTotal(pageInfo.getTotal());
				result.setRows(list);				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
		
	}

	@Override
	public ResponseResult addPersonalLoan(PersonalLoan personalLoan,
			HttpServletRequest request) {
		try {
			// 补充日期
			personalLoan.setCreateDate(new Date());
			
			ResponseResult result = getUserPsnCodeByRequest(request);
			// 判断是否取到了登录人员
			if(result.getStatus() == 200){
				// 获取 user,将 psn_code 数据补充				
				personalLoan.setPsnCode((Integer)result.getData());				
				int count = personalLoanMapper.insert(personalLoan);
				if (count <= 0) {
					return ResponseResult.build(500, "添加失败");
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return ResponseResult.ok();
	}


	@Override
	public ResponseResult modifyPersonalLoan(PersonalLoan personalLoan) {
		try {
			int count = personalLoanMapper.updateByPrimaryKeySelective(personalLoan);
			if (count <= 0) {
				return ResponseResult.build(500, "修改失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return ResponseResult.ok();
	}

	@Override
	public ResponseResult deletePersonalLoan(String ids) {
		try {
			String[] plIds = ids.split(",");
			for (String plId : plIds) {
				int count = personalLoanMapper.deleteByPrimaryKey(Integer.valueOf(plId));
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

	

	
	
	
	
	
}
