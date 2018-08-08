package com.assets.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.assets.common.pojo.EasyUIDataGridResult;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.ConstDictionary;
import com.assets.service.DictionaryService;

@Controller
@RequestMapping("assets")
public class DictionaryController {
	@Autowired 
	private DictionaryService dictionaryService;
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
	
	/**
	 * 分页获取数据
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/Dictionary/dictionaryList")
	@ResponseBody
	public EasyUIDataGridResult getDcitionaryList(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "30") Integer rows) {
		EasyUIDataGridResult result = dictionaryService.getDcitionaryList(page,rows);
		return result;
	}
	/**
	 * 添加数据字典数据
	 * @param constDictionary
	 * @return
	 */
	@RequestMapping(value="/Dictionary/addDictionary",method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView addDictionary(ConstDictionary constDictionary) {
		
		ModelAndView mv = new ModelAndView();
		ResponseResult result = dictionaryService.addDictionary(constDictionary);
		if (result.getStatus() == 200) {
			mv.setViewName("constDictionary");
		}else {
			mv.setViewName("addError");
		}
		return mv;
	}
	/**
	 * 修改数据字典数据
	 * @param consDictionary
	 * @return
	 */
	@RequestMapping(value = "/Dictionary/modifyDictionary",method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView modifyDictionary(ConstDictionary consDictionary){
		ModelAndView mv = new ModelAndView();
		ResponseResult result = dictionaryService.modifyDictionary(consDictionary);
		if(result.getStatus() == 200){
			mv.setViewName("constDictionary");
		}else {
			mv.setViewName("modifyError");
		}		
		return mv;
	}
	/**
	 * 删除数据字典数据	
	 * @param ids
	 * @return
	 */
	@RequestMapping("/Dictionary/deleteDictionary/{ids}")
	@ResponseBody
	public ResponseResult deleteDictionary(@PathVariable String ids) {
		ResponseResult result = dictionaryService.deleteDictionary(ids);
		return result;		
	}
	
	/**
	 * 获取菜单类别下拉按钮的值
	 */
	@RequestMapping("/Dictionary/getDicMenuType/{dicMenuType}")
	@ResponseBody
	public List<ConstDictionary> getDicMenuType(@PathVariable String dicMenuType){
		List<ConstDictionary> list = dictionaryService.getDicMenuType(dicMenuType);
		return list;
	}
	/**
	 * 获取用户支付项的所有选项	
	 * URL:/assets/Dictionary/getUserPayAllDic
	 */
	@RequestMapping("/Dictionary/getUserPayAllDic")
	@ResponseBody
	public List<ConstDictionary> getUserPayAllDic(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("category",PAY_ITEM_KEY);
		List<ConstDictionary> list = dictionaryService.getUserSetAllDic(map);
		return list;
	}
	
	/**
	 * 获取用户收入项的所有选项	
	 * URL:/assets/Dictionary/getUserIncomAllDic
	 */
	@RequestMapping("/Dictionary/getUserIncomAllDic")
	@ResponseBody
	public List<ConstDictionary> getUserIncomAllDic(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("category", INCOM_ITEM_KEY);
		List<ConstDictionary> list = dictionaryService.getUserSetAllDic(map);
		return list;
	}
	/**
	 * 获取银行卡的所有选项	
	 * URL:/assets/Dictionary/getUserBankCardAllDic
	 */
	@RequestMapping("/Dictionary/getUserBankCardAllDic")
	@ResponseBody
	public List<ConstDictionary> getUserBankCardAllDic(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("category", BANK_CARD_KEY);
		List<ConstDictionary> list = dictionaryService.getUserSetAllDic(map);
		return list;
	}
	/**
	 * 获取线上银行的所有选项	
	 * URL:/assets/Dictionary/getUserOlineBankAllDic
	 */
	@RequestMapping("/Dictionary/getUserOlineBankAllDic")
	@ResponseBody
	public List<ConstDictionary> getUserOlineBankAllDic(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("category", ONLINE_BANK_KEY);
		List<ConstDictionary> list = dictionaryService.getUserSetAllDic(map);
		return list;
	}
	
	/**
	 * 获取不计损益项的所有选项	
	 * URL:/assets/Dictionary/getUserNoLossAllDic
	 */
	@RequestMapping("/Dictionary/getUserNoLossAllDic")
	@ResponseBody
	public List<ConstDictionary> getUserNoLossAllDic(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("category", NOLOSS_ITEM_KEY);
		List<ConstDictionary> list = dictionaryService.getUserSetAllDic(map);
		return list;
	}
	

	/**
	 * 获取信用借款的所有选项	
	 * URL:/assets/Dictionary/getUserCreditLoanAllDic
	 */
	@RequestMapping("/Dictionary/getUserCreditLoanAllDic")
	@ResponseBody
	public List<ConstDictionary> getUserCreditLoanAllDic(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("category", CREDIT_LOAN_KEY);
		List<ConstDictionary> list = dictionaryService.getUserSetAllDic(map);
		return list;
	}
}
