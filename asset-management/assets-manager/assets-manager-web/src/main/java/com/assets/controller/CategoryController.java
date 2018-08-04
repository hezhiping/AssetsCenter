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
import com.assets.pojo.ConstCategory;
import com.assets.service.CategoryService;

@Controller
@RequestMapping("assets")
public class CategoryController {

	@Autowired 
	private  CategoryService categoryService;
	
	/**
	 * 分页获取数据
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/Category/categoryList")
	@ResponseBody
	public EasyUIDataGridResult getCategoryList(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "30") Integer rows) {
		EasyUIDataGridResult result = categoryService.getCategoryList(page,rows);
		return result;
	}
	/**
	 * 添加数据字典数据
	 * @param constDictionary
	 * @return
	 */
	@RequestMapping(value="/Category/addCategory",method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView addCategory(ConstCategory constCategory) {
		
		ModelAndView mv = new ModelAndView();
		ResponseResult result = categoryService.addCategory(constCategory);
		if (result.getStatus() == 200) {
			mv.setViewName("constCategory");
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
	@RequestMapping(value = "/Category/modifyCategory",method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView modifyCategory(ConstCategory constCategory){
		ModelAndView mv = new ModelAndView();
		ResponseResult result = categoryService.modifyCategory(constCategory);
		if(result.getStatus() == 200){
			mv.setViewName("constCategory");
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
	@RequestMapping("/Category/deleteCategory/{ids}")
	@ResponseBody
	public ResponseResult deleteCategory(@PathVariable String ids) {
		ResponseResult result = categoryService.deleteCategory(ids);
		return result;		
	}
	
	/**
	 * 获取所有菜单类别
	 * 
	 * @param 菜单节点名称
	 * @return 返回菜单集合
	 */
	@RequestMapping(value = "/Category/getCategoryCombox")	
	@ResponseBody
	public List<ConstCategory> getCategoryCombox() {
		List<ConstCategory> list = categoryService.getCategoryCombox();
		return list;
	}
}
