package com.assets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
