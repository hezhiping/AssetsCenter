package com.assets.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assets.common.utils.JsonUtils;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.UserConstDic;
import com.assets.service.UserConstDicService;

@Controller
@RequestMapping("assets")
public class UserConstDicController {
	@Autowired
	private UserConstDicService userConstDicService;

	// 用户配置的支付项类别名称
	@Value("${PAY_ITEM_KEY}")
	private String PAY_ITEM_KEY;

	// 用户配置的收入项类别名称
	@Value("${INCOM_ITEM_KEY}")
	private String INCOM_ITEM_KEY;

	// 用户配置的银行卡名称
	@Value("${BANK_CARD_KEY}")
	private String BANK_CARD_KEY;

	// 个人配置的线上银行方式
	@Value("${ONLINE_BANK_KEY}")
	private String ONLINE_BANK_KEY;
	// 个人配置的不计损益项
	@Value("${NOLOSS_ITEM_KEY}")
	private String NOLOSS_ITEM_KEY;

	// 个人配置的信用借款项
	@Value("${CREDIT_LOAN_KEY}")
	private String CREDIT_LOAN_KEY;
	
	//缓存的类型为收支类型
	@Value("${PAY_INCOM_CACHETYPE}")
	private String PAY_INCOM_CACHETYPE;	
	
	//缓存的类型为损益分类
	@Value("${PROFIT_LOSS_CACHETYPE}")
	private String PROFIT_LOSS_CACHETYPE;	
	

	/**
	 * 获取用户配置的支出项 /assets/UserConstDic/getUserPayDic
	 */
	@RequestMapping("UserConstDic/getUserPayDic")
	@ResponseBody
	public List<UserConstDic> getUserPayDic(HttpServletRequest request) {
		// 创建map 存取mapper中查询条件的值
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("category", PAY_ITEM_KEY);
		List<UserConstDic> list = userConstDicService.getUserSetDic(request,
				map);
		return list;
	}

	/**
	 * 添加用户配置的支出项 /assets/UserConstDic/AddUserPayDic/" + ids
	 */
	@RequestMapping(value = "/UserConstDic/AddUserPayDic/{ids}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult AddUserPayDic(@PathVariable String ids,
			HttpServletRequest request) {
		// 传入为支出项的类型 PAY_ITEM_KEY
		ResponseResult result = userConstDicService.AddUserSetDic(ids, request,
				PAY_ITEM_KEY);
		return result;
	}

	
	/**
	 * 获取用户配置的收入项 /assets/UserConstDic/getUserPayDic
	 */
	@RequestMapping("UserConstDic/getUserIncomDic")
	@ResponseBody
	public List<UserConstDic> getUserIncomDic(HttpServletRequest request) {
		// 创建map 存取mapper中查询条件的值
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("category", INCOM_ITEM_KEY);
		List<UserConstDic> list = userConstDicService.getUserSetDic(request,
				map);
		return list;
	}

	/**
	 * 添加用户配置的收入项 /assets/UserConstDic/AddUserIncomDic/" + ids
	 */
	@RequestMapping(value = "/UserConstDic/AddUserIncomDic/{ids}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult AddUserIncomDic(@PathVariable String ids,
			HttpServletRequest request) {
		// 传入为收入项的类型 INCOM_ITEM_KEY
		ResponseResult result = userConstDicService.AddUserSetDic(ids, request,
				INCOM_ITEM_KEY);
		return result;
	}
	
	
	/**
	 * 获取用户配置的银行卡 /assets/UserConstDic/getUserBankCardDic
	 */
	@RequestMapping("UserConstDic/getUserBankCardDic")
	@ResponseBody
	public List<UserConstDic> getUserBankCardDic(HttpServletRequest request) {
		// 创建map 存取mapper中查询条件的值
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("category", BANK_CARD_KEY);
		List<UserConstDic> list = userConstDicService.getUserSetDic(request,
				map);
		return list;
	}

	/**
	 * 添加用户配置的银行卡 /assets/UserConstDic/AddUserBankCardDic/" + ids
	 */
	@RequestMapping(value = "/UserConstDic/AddUserBankCardDic/{ids}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult AddUserBankCardDic(@PathVariable String ids,
			HttpServletRequest request) {
		// 传入为支出项的类型 PAY_ITEM_KEY
		ResponseResult result = userConstDicService.AddUserSetDic(ids, request,
				BANK_CARD_KEY);
		return result;
	}
	
	/**
	 * 保存用户配置的银行卡期初金额   /assets/UserConstDic/saveBankCardBeginMoney
	 */	
	@RequestMapping(value = "/UserConstDic/saveBankCardBeginMoney", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult saveBankCardBeginMoney(@RequestBody String json,
			HttpServletRequest request) {
		List<UserConstDic> list = JsonUtils.jsonToList(json, UserConstDic.class);
		// 传入为支出项的类型 PAY_ITEM_KEY
		ResponseResult result = userConstDicService.saveBeginMoney(list, request,
				CREDIT_LOAN_KEY);
		return result;
	}
	
	/**
	 * 获取用户配置的线上支付方式 /assets/UserConstDic/getUserOlineBankDic
	 */
	@RequestMapping("UserConstDic/getUserOlineBankDic")
	@ResponseBody
	public List<UserConstDic> getUserOlineBankDic(HttpServletRequest request) {
		// 创建map 存取mapper中查询条件的值
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("category", ONLINE_BANK_KEY);
		List<UserConstDic> list = userConstDicService.getUserSetDic(request,
				map);
		return list;
	}

	/**
	 * 添加用户配置的线上支付方式 /assets/UserConstDic/AddUserOlineBankDic/" + ids
	 */
	@RequestMapping(value = "/UserConstDic/AddUserOlineBankDic/{ids}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult AddUserOlineBankDic(@PathVariable String ids,
			HttpServletRequest request) {
		// 传入为支出项的类型 PAY_ITEM_KEY
		ResponseResult result = userConstDicService.AddUserSetDic(ids, request,
				ONLINE_BANK_KEY);
		return result;
	}

	/**
	 * 保存用户配置的线上支付方式期初金额  /assets/UserConstDic/saveOlineBankBeginMoney
	 */	
	@RequestMapping(value = "/UserConstDic/saveOlineBankBeginMoney", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult saveOlineBankBeginMoney(@RequestBody String json,
			HttpServletRequest request) {
		List<UserConstDic> list = JsonUtils.jsonToList(json, UserConstDic.class);
		// 传入为支出项的类型 PAY_ITEM_KEY
		ResponseResult result = userConstDicService.saveBeginMoney(list, request,
				CREDIT_LOAN_KEY);
		return result;
	}
	
	/**
	 * 获取用户配置的不计损益项 /assets/UserConstDic/getUserNoLossDic
	 */
	@RequestMapping("UserConstDic/getUserNoLossDic")
	@ResponseBody
	public List<UserConstDic> getUserNoLossDic(HttpServletRequest request) {
		// 创建map 存取mapper中查询条件的值
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("category", NOLOSS_ITEM_KEY);
		List<UserConstDic> list = userConstDicService.getUserSetDic(request,
				map);
		return list;
	}
	
	/**
	 * 添加用户配置的不计损益项 /assets/UserConstDic/AddUserNoLossDic/" + ids
	 */
	@RequestMapping(value = "/UserConstDic/AddUserNoLossDic/{ids}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult AddUserNoLossDic(@PathVariable String ids,
			HttpServletRequest request) {
		// 传入为支出项的类型 PAY_ITEM_KEY
		ResponseResult result = userConstDicService.AddUserSetDic(ids, request,
				NOLOSS_ITEM_KEY);
		return result;
	}


	/**
	 * 获取用户配置的信用借款项 /assets/UserConstDic/getUserCreditLoanDic
	 */
	@RequestMapping("UserConstDic/getUserCreditLoanDic")
	@ResponseBody
	public List<UserConstDic> getUserCreditLoanDic(HttpServletRequest request) {
		// 创建map 存取mapper中查询条件的值
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("category", CREDIT_LOAN_KEY);
		List<UserConstDic> list = userConstDicService.getUserSetDic(request,
				map);
		return list;
	}

	/**
	 * 添加用户配置的信用借款项 /assets/UserConstDic/AddUserCreditLoanDic/" + ids
	 */
	@RequestMapping(value = "/UserConstDic/AddUserCreditLoanDic/{ids}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult AddUserCreditLoanDic(@PathVariable String ids,
			HttpServletRequest request) {
		// 传入为支出项的类型 PAY_ITEM_KEY
		ResponseResult result = userConstDicService.AddUserSetDic(ids, request,
				CREDIT_LOAN_KEY);
		return result;
	}
	
	/**
	 * 保存用户配置的信用借款期初金额  /assets/UserConstDic/saveCreditLoanBeginMoney
	 */	
	@RequestMapping(value = "/UserConstDic/saveCreditLoanBeginMoney", method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult saveCreditLoanBeginMoney(@RequestBody String json,
			HttpServletRequest request) {
		List<UserConstDic> list = JsonUtils.jsonToList(json, UserConstDic.class);
		// 传入为支出项的类型 PAY_ITEM_KEY
		ResponseResult result = userConstDicService.saveBeginMoney(list, request,
				CREDIT_LOAN_KEY);
		return result;
	}

	/**
	 * 获取用户配置的损益分类 /assets/UserConstDic/getProfitLossType
	 * 合并列值: category IN ('2_ZCX','3_SRX','4_BJSY')
	 */
	@RequestMapping("/UserConstDic/getProfitLossType")
	@ResponseBody
	public List<UserConstDic> getProfitLossType(HttpServletRequest request) {
		// 创建map 存取mapper中查询条件的值
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> listType = new ArrayList<String>();
		listType.add(PAY_ITEM_KEY);
		listType.add(INCOM_ITEM_KEY);
		listType.add(NOLOSS_ITEM_KEY);
		map.put("profitLossPayIncomTypeList", listType);
		// 设置缓存的类型为哪一种
		map.put("cacheType",PROFIT_LOSS_CACHETYPE);
		List<UserConstDic> list = userConstDicService.getProfitLossPayIncomType(request,map);
		return list;
	}
	/**
	 * 获取用户配置的收支方式 /assets/UserConstDic/getPayIncomType
	 * 合并列值: category IN ('5_YHKZL','6_XSYH','7_XYJK')
	 */
	@RequestMapping("/UserConstDic/getPayIncomType")
	@ResponseBody
	public List<UserConstDic> getPayIncomType(HttpServletRequest request) {
		// 创建map 存取mapper中查询条件的值
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> listType = new ArrayList<String>();
		listType.add(BANK_CARD_KEY);
		listType.add(ONLINE_BANK_KEY);
		listType.add(CREDIT_LOAN_KEY);
		map.put("profitLossPayIncomTypeList", listType);
		// 设置缓存的类型为哪一种
		map.put("cacheType",PAY_INCOM_CACHETYPE);
		List<UserConstDic> list = userConstDicService.getProfitLossPayIncomType(request,map);
		return list;
	}

	
	
	
}
