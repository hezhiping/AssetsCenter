package com.assets.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.PersonalLoan;
import com.assets.service.PersonalLoanService;

@Controller
@RequestMapping("assets")
public class PersonalLoanController {

	@Autowired
	private PersonalLoanService personalLoanService;
	
	/**
	 * 格式化前台页面传过来的字符串日期格式
	 * @param dataBinder
	 */
	@InitBinder	
	 public void intDate(WebDataBinder dataBinder){
		dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
    }
	/**
	 * 分页获取数据
	 * /assets/PersonalLoan/personalLoanList
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/PersonalLoan/personalLoanList")
	@ResponseBody
	public EasyUIDataGridResult getPersonalLoanList(HttpServletRequest request,@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "100") Integer rows) {
		EasyUIDataGridResult result =  personalLoanService.getPersonalLoanList(request,page,rows);
		
		return result;
	}

	/**
	 * 添加个人借款
	 * @param /PersonalLoan/addPersonalLoan
	 * @return
	 */
	@RequestMapping(value = "/PersonalLoan/addPersonalLoan",method = RequestMethod.POST)
	@ResponseBody
	public  ResponseResult addPersonalLoan(PersonalLoan personalLoan,HttpServletRequest request){		
		ResponseResult result = personalLoanService.addPersonalLoan(personalLoan,request);		
		return result;
	}
	/**
	 * 修改个人借款
	 * @param PersonalLoan
	 * @return
	 */
	@RequestMapping(value = "/PersonalLoan/modifyPersonalLoan")
	@ResponseBody
	public ResponseResult modifyPersonalLoan(PersonalLoan personalLoan){		
		ResponseResult result = personalLoanService.modifyPersonalLoan(personalLoan);		
		return result;
	}
	
	/**
	 * 删除个人借款
	 * assets/PersonalLoan/deletePersonalLoan/" + ids 
	 */
	@RequestMapping("/PersonalLoan/deletePersonalLoan/{ids}")
	@ResponseBody
	public ResponseResult deletePersonalLoan(@PathVariable String ids) {
		ResponseResult result = personalLoanService.deletePersonalLoan(ids);
		return result;		
	}
	
}
