package com.lottery.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.TblBaseAdminButton;
import com.lottery.service.TblBaseAdminButtonService;

@Controller
@RequestMapping("/buttonManager")
public class ButtonManagerController {

	@Autowired
	TblBaseAdminButtonService tblBaseAdminButtonService;

	// 跳转到对应的页面目录
	@RequestMapping("/buttonHome")
	public String homePath(Map<String, Object> mapValue) {
	//查询button菜单列表
		List<TblBaseAdminButton> tblBaseAdminButtonList =	tblBaseAdminButtonService.searchAllBaseAdminButton();
		mapValue.put("dataList", tblBaseAdminButtonList);
		return "buttonHome";
	}

	// 跳转到对应的新增页面
	@RequestMapping("/addButtonPath")
	public String addbuttonPath() {
		return "addButton";
	}

	// 新增页面的信息
	@RequestMapping("/addButton")
	@ResponseBody
	public String addButton(TblBaseAdminButton tblBaseAdminButton) {
		return tblBaseAdminButtonService.addButton(tblBaseAdminButton) > 0 ? "sucess" : "false";

	}

	// 修改页面的信息
	@RequestMapping("/updateButtonPath")
	public String updateButtonPath(Integer id, Map<String, Object> mapValue) {
		TblBaseAdminButton tblBaseAdminbutton = tblBaseAdminButtonService.queryButtonById(id);
		mapValue.put("tblBaseAdminbutton", tblBaseAdminbutton);
		return "updateButton";
	}
	
	// 修改页面的信息
		@RequestMapping("/updateButton")
		@ResponseBody
		public String updateButton(TblBaseAdminButton tblBaseAdminButton) {
		
		return tblBaseAdminButtonService.updateButtonData( tblBaseAdminButton)>1?"sucess":"false";
		}

	/**
	 * 删除选中的记录
	 * 
	 * @param idList
	 * @return
	 */

	@RequestMapping("/deleteButtonDataByIds")
	@ResponseBody
	public String deleteButtonDataByIds(String idList) {
		String[] idString = idList.split(",");
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < idString.length; i++) {
			intList.add(Integer.parseInt(idString[i]));
		}
		return tblBaseAdminButtonService.deleteButtonDataByIds(intList) > 1 ? "sucess" : "false";
	}

	/**
	 * 查询按钮记录
	 * 
	 * @param tblBaseAdminbutton
	 * @return
	 */
	@RequestMapping("/searchAllBaseAdminButton")
	@ResponseBody
	public List<TblBaseAdminButton> searchAllBaseAdminButton() {
		// 根据查询条件查询分页记录
		return tblBaseAdminButtonService.searchAllBaseAdminButton();
	}

}
