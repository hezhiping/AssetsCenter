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
import com.assets.common.pojo.ZtreeJsonResult;
import com.assets.common.utils.ExceptionUtil;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.SysResource;
import com.assets.service.MenuService;

@Controller
@RequestMapping("assets")
public class MenuController {

	@Autowired
	private MenuService menuService;

	/**
	 * 获取左侧菜单树
	 * 
	 * @param 菜单节点名称
	 * @return 返回菜单集合
	 */
	@RequestMapping(value = "/menu/{resourceType}", method = RequestMethod.POST)
	// /{resourceType}
	@ResponseBody
	public List<ZtreeJsonResult> getMenu(@PathVariable String resourceType) {
		List<ZtreeJsonResult> list = menuService.getMenu(resourceType);

		return list;
	}

	/**
	 * 获取所有菜单 返回菜单集合
	 */
	@RequestMapping("/menu/list")
	@ResponseBody
	public EasyUIDataGridResult getAllMenu(
			@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "30") Integer rows) {
		EasyUIDataGridResult result = menuService.getAllMenu(page, rows);
		return result;
	}

	/**
	 * 添加菜单，返回ResponseResult
	 */
	@RequestMapping(value = "/menu/addMenu", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView addMenu(SysResource menuResuorce) {
		ModelAndView modelView = new ModelAndView();
		ResponseResult result = menuService.addMenu(menuResuorce);
		if(result.getStatus()== 200){
			modelView.setViewName("menulist");
		}else{
			modelView.setViewName("addError");
		}
		return modelView;

	}
}
