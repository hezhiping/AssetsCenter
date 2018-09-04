package com.assets.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.druid.sql.visitor.functions.Ucase;
import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.DateUtilHelp;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.ConstDictionaryMapper;
import com.assets.mapper.CreditLoanMapper;
import com.assets.mapper.FundChangeMapper;
import com.assets.mapper.UserConstDicMapper;
import com.assets.pojo.ConstDictionary;
import com.assets.pojo.CreditLoan;
import com.assets.pojo.CreditLoanExample;
import com.assets.pojo.UserConstDic;
import com.assets.service.CreditLoanService;

@Service
public class CreditLoanServiceImpl extends BaseServiceImpl implements
		CreditLoanService {

	// 信用借款项
	@Autowired
	private CreditLoanMapper creditLoanMapper;
	
	// 用户个人配置项
	@Autowired
	private UserConstDicMapper userConstMapper;
	
	// 资金变动项
	@Autowired
	private FundChangeMapper fundChangeMapper;
	
	// 数据字典表
	@Autowired
	private ConstDictionaryMapper dictionaryMapper;
	
	@Value("${CREDIT_LOAN_KEY}")
	private String CREDIT_LOAN_KEY;
	
	/**
	 * 获取信用借款表格的信息
	 */
	@Override
	public EasyUIDataGridResult getCreditLoan(HttpServletRequest request) {
		ResponseResult responseResult = getUserPsnCodeByRequest(request);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		// 定义汇总变量
		BigDecimal beginTotal = new BigDecimal(0.00);
		BigDecimal payTotal = new BigDecimal(0.00);
		BigDecimal repayTotal = new BigDecimal(0.00);
		BigDecimal endTotal = new BigDecimal(0.00);
		try {		
			if (responseResult.getStatus() == 200) {
				//1.获取到psnCode
				String psnCode = responseResult.getData().toString(); 
				
				//2. 获取到当前年和当前月份
				String curYear = DateUtilHelp.getNowYearStr();
				String curMonth = DateUtilHelp.getNowMonthStr();
				
				//3.通过当前psnCode 获取到用户配置的信用借款项
				// 创建map 存取mapper中查询条件的值
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("category", CREDIT_LOAN_KEY); // 当前用户配置的信用借款项
				map.put("psnCode", psnCode); // 当前用户
				map.put("currentYear", curYear); // 当前年
				map.put("currentMonth", curMonth); // 当前月
				// TODO 上个月的记录  这个要判断是否是年初  ，是的话要取上一年的 和月份都得改
				//UserConstDic userSetDic = userConstMapper.selectUserSetDic(map);
				List<UserConstDic> dicList = userConstMapper.selectUserSetDic(map);
				
				// 4. 将数据以，分割
				//String[] arrConst = userSetDic.getCostCode().split(",");
				
				// 5. 创建 creditLoan List
				List<CreditLoan> list = new ArrayList<CreditLoan>();	
				// 6. 循环取数据
				for (UserConstDic ucDic : dicList) {
					CreditLoan creditLoan = new CreditLoan();
					// 根据key 查找 名称name
					//String constName = dictionaryMapper.selectNameByPrimaryKey(Integer.valueOf(consId));
					String constName = ucDic.getCostName();
					// 6.1 拿到配置项去fundChange表中获取 
					// TODO  6.1.0 当前借款项的期初
					BigDecimal beginBalance = new BigDecimal(0.00) ;
					beginTotal = beginTotal.add(beginBalance);
					// 6.1.1 当前借款项的支出总和
					map.put("payConsCode", ucDic.getCostCode());
					BigDecimal paySum = new BigDecimal(0.00) ;
					Map<String, Object> paySumInfo = fundChangeMapper.selectPaySumByConsCode(map);
					if (paySumInfo != null) {
						if (paySumInfo.containsKey("totalSum")) {
							paySum = (BigDecimal) paySumInfo.get("totalSum");
							payTotal = payTotal.add(paySum);
						}
					}			
					// 6.1.2 当前借款项的偿还总和
					map.put("repayConsCode", ucDic.getCostCode());
					BigDecimal repaySum = new BigDecimal(0.00) ;
					Map<String, Object> repaySumInfo = fundChangeMapper.selectRepaySumByConsCode(map);
					if (repaySumInfo != null) {
						if (repaySumInfo.containsKey("totalSum")) {
							repaySum = (BigDecimal) repaySumInfo.get("totalSum");
							repayTotal = repayTotal.add(repaySum);
						}
					}	
					// 6.1.3 当前借款项的期末总和-- 期末余额 : 期初 + 使用 - 偿还
					BigDecimal endBalance = beginBalance.add(paySum).subtract(repaySum);
					endTotal = endTotal.add(endBalance);
					// 7. 加入POJO 对象
					creditLoan.setConstName(constName);
					creditLoan.setOpeningBalance(beginBalance);
					creditLoan.setCurrentUse(paySum);
					creditLoan.setCurrentRepay(repaySum);
					creditLoan.setEndingBalance(endBalance);
					// 8.添加进list集合 
					list.add(creditLoan);
				}
				// 设置表格中的数据
				result.setRows(list);
				
				// 创建汇总栏的list
				List<CreditLoan> footList = new ArrayList<CreditLoan>();
				// 创建汇总对象
				CreditLoan footCredicLoan = new CreditLoan();
				// 写入数据
				footCredicLoan.setConstName("合  计");
				footCredicLoan.setOpeningBalance(beginTotal);
				footCredicLoan.setCurrentUse(payTotal);
				footCredicLoan.setCurrentRepay(repayTotal);
				footCredicLoan.setEndingBalance(endTotal);
				footList.add(footCredicLoan);
				// 将汇总信息写入EasyUIDataGridResult 中
				result.setFooter(footList);
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}

	/**
	 *  获取信用借款项额度的信息	
	 */
	@Override
	public EasyUIDataGridResult getCreditLoanAmount(HttpServletRequest request) {
		ResponseResult responseResult = getUserPsnCodeByRequest(request);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		// 定义汇总变量		
		BigDecimal beginTotal = new BigDecimal(0.00);
		BigDecimal payTotal = new BigDecimal(0.00);
		BigDecimal repayTotal = new BigDecimal(0.00);
		BigDecimal endTotal = new BigDecimal(0.00);
		BigDecimal creditAmtTotal = new BigDecimal(0.00);
		BigDecimal creditExpoTotal = new BigDecimal(0.00);	
		try {		
			if (responseResult.getStatus() == 200) {
				//1.获取到psnCode
				String psnCode = responseResult.getData().toString(); 
				
				//2. 获取到当前年和当前月份
				String curYear = DateUtilHelp.getNowYearStr();
				String curMonth = DateUtilHelp.getNowMonthStr();
				
				//3.通过当前psnCode 获取到用户配置的信用借款项
				// 创建map 存取mapper中查询条件的值
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("category", CREDIT_LOAN_KEY); // 当前用户配置的信用借款项
				map.put("psnCode", psnCode); // 当前用户
				map.put("currentYear", curYear); // 当前年
				map.put("currentMonth", curMonth); // 当前月
				// TODO 上个月的记录  这个要判断是否是年初  ，是的话要取上一年的 和月份都得改
				//UserConstDic userSetDic = userConstMapper.selectUserSetDic(map);
				List<UserConstDic> dicList = userConstMapper.selectUserSetDic(map);
				// 4. 将数据以，分割
				//String[] arrConst = userSetDic.getCostCode().split(",");
				// 5. 创建 creditLoan List
				List<CreditLoan> list = new ArrayList<CreditLoan>();	
				// 6. 循环取数据
				for (UserConstDic ucDic : dicList) {
					CreditLoan creditLoan = new CreditLoan();
					// 根据key 查找 名称name
					//String constName = dictionaryMapper.selectNameByPrimaryKey(Integer.valueOf(consId));
					String constName = ucDic.getCostName();
							
					// 6.1 拿到配置项去fundChange表中获取 
					// TODO  6.1.0 当前借款项的期初
					BigDecimal beginBalance = new BigDecimal(0.00) ;
					beginTotal = beginTotal.add(beginBalance);
					// 信用额度
					BigDecimal creditAmount = ucDic.getBeginMoney();					
					creditAmtTotal = creditAmtTotal.add(creditAmount);
					// 6.1.1 当前借款项的支出总和
					map.put("payConsCode", ucDic.getCostCode());
					BigDecimal paySum = new BigDecimal(0.00) ;
					Map<String, Object> paySumInfo = fundChangeMapper.selectPaySumByConsCode(map);
					if (paySumInfo != null) {
						if (paySumInfo.containsKey("totalSum")) {
							paySum = (BigDecimal) paySumInfo.get("totalSum");
							payTotal = payTotal.add(paySum);
						}
					}			
					// 6.1.2 当前借款项的偿还总和
					map.put("repayConsCode", ucDic.getCostCode());
					BigDecimal repaySum = new BigDecimal(0.00) ;
					Map<String, Object> repaySumInfo = fundChangeMapper.selectRepaySumByConsCode(map);
					if (repaySumInfo != null) {
						if (repaySumInfo.containsKey("totalSum")) {
							repaySum = (BigDecimal) repaySumInfo.get("totalSum");
							repayTotal = repayTotal.add(repaySum);
						}
					}	
					// 6.1.3 当前借款项的期末总和-- 期末余额 : 期初 + 使用 - 偿还
					BigDecimal endBalance = beginBalance.add(paySum).subtract(repaySum);
					endTotal = endTotal.add(endBalance);
					
					// 计算信用敞口
					BigDecimal creditExposure = creditAmount.subtract(endBalance);
					//计算额度总计
					creditExpoTotal =creditExpoTotal.add(creditExposure);
					
					// 7. 加入POJO 对象
					creditLoan.setConstName(constName);
					creditLoan.setOpeningBalance(beginBalance);
					creditLoan.setCurrentUse(paySum);
					creditLoan.setCurrentRepay(repaySum);
					creditLoan.setEndingBalance(endBalance);
					creditLoan.setCreditExposure(creditExposure); //信用额度
					creditLoan.setCreditAmount(creditAmount); // 信用敞口
					// 8.添加进list集合 
					
					list.add(creditLoan);
				}
				
				result.setRows(list);
				
				// 创建汇总栏的list
				List<CreditLoan> footList = new ArrayList<CreditLoan>();
				// 创建汇总对象
				CreditLoan footCredicLoan = new CreditLoan();
				// 写入数据
				footCredicLoan.setConstName("合  计");
				footCredicLoan.setCreditAmount(creditAmtTotal);
				footCredicLoan.setCreditExposure(creditExpoTotal);				
				footList.add(footCredicLoan);
				// 将汇总信息写入EasyUIDataGridResult 中
				result.setFooter(footList);
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	
	/**
	 * BigDecimal用法详解

		一、简介
		Java在java.math包中提供的API类BigDecimal，用来对超过16位有效位的数进行精确的运算。双精度浮点型变量double可以处理16位有效数。在实际应用中，需要对更大或者更小的数进行运算和处理。float和double只能用来做科学计算或者是工程计算，在商业计算中要用java.math.BigDecimal。BigDecimal所创建的是对象，我们不能使用传统的+、-、*、/等算术运算符直接对其对象进行数学运算，而必须调用其相对应的方法。方法中的参数也必须是BigDecimal的对象。构造器是类的特殊方法，专门用来创建对象，特别是带有参数的对象。
		
		
		二、构造器描述
		BigDecimal(int)       创建一个具有参数所指定整数值的对象。
		BigDecimal(double) 创建一个具有参数所指定双精度值的对象。
		BigDecimal(long)    创建一个具有参数所指定长整数值的对象。
		BigDecimal(String) 创建一个具有参数所指定以字符串表示的数值的对象。
		
		三、方法描述
		add(BigDecimal)        BigDecimal对象中的值相加，然后返回这个对象。
		subtract(BigDecimal) BigDecimal对象中的值相减，然后返回这个对象。
		multiply(BigDecimal)  BigDecimal对象中的值相乘，然后返回这个对象。
		divide(BigDecimal)     BigDecimal对象中的值相除，然后返回这个对象。
		toString()                将BigDecimal对象的数值转换成字符串。
		doubleValue()          将BigDecimal对象中的值以双精度数返回。
		floatValue()             将BigDecimal对象中的值以单精度数返回。
		longValue()             将BigDecimal对象中的值以长整数返回。
		intValue()               将BigDecimal对象中的值以整数返回。 
	 */
	
}


