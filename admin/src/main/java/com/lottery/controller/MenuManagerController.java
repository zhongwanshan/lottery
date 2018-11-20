package com.lottery.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.MenuZNode;
import com.lottery.entity.TblBaseAdminMenu;
import com.lottery.service.TblBaseAdminMenuService;

@Controller
@RequestMapping("/menuManager")
public class MenuManagerController {
	
    @Autowired
	TblBaseAdminMenuService tblBaseAdminmenuService;
	
	//跳转到对应的菜单页面
	@RequestMapping("/menuHome")
	public String homePath(){
	  return "menuHome";
	}
	
	//跳转到对应的菜单页面
		@RequestMapping("/addMenuPath")
		public String addMenuPath(){
		  return "addMenu";
		}
	 //保存菜单的信息
	 @RequestMapping("/addMenu")
	 @ResponseBody
	 public String addMenu(TblBaseAdminMenu tblBaseAdminMenu){
		
	  return tblBaseAdminmenuService.addMenu(tblBaseAdminMenu)>0?"sucess":"false";
	}
	
	 
	 //保存菜单的信息
	 @RequestMapping("/menuDetail")
	 public String menuDetail(Integer id,Map<String,Object> mapValue){
		 TblBaseAdminMenu tblBaseAdminMenu = tblBaseAdminmenuService.queryMenuById(id);
		 mapValue.put("tblBaseAdminMenu", tblBaseAdminMenu);
	  return "menuDetail";
	}
     /**
	 * 添加子菜单
	 * @param id
	 * @return
	 */
	@RequestMapping("/addChildMenu")
	public String addChildMenu(String pid,String menuCode,Map<String, Object> mapValue){
		mapValue.put("pid", pid);
		mapValue.put("menuCode", menuCode);
	  return "addChildMenu";
	}

	 /**
	 * 查询所有菜单信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryAllMenuDatas")
	@ResponseBody
	public List<MenuZNode> queryAllMenuDatas(){	
		List<MenuZNode> menuZNode = tblBaseAdminmenuService.queryAllMenuDatas();
	  System.out.println(menuZNode);
	  return menuZNode;
	}
	/**
	 * 删除选中的记录
	 * @param idList
	 * @return
	 */
	
	@RequestMapping("/deleteMenuDataByIds")
	public String deleteMenuDataByIds(String idList){
		String[] idString = idList.split(",");
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < idString.length; i++) {
			intList.add(Integer.parseInt(idString[i]));
		}
	  return tblBaseAdminmenuService.deleteMenuDataByIds(intList)>1?"sucess":"false";
	}
/**
     * 根据条件查询角色信息
     * @param sysmenuName
     * @param sysmenuCode
     * @param menuStatus
     * @param pageNum
     * @return
     *//*
	@RequestMapping("/searchmenuData")
	@ResponseBody
	public List<TblBaseAdminmenu> searchmenuData(String menuName ,Integer menuStatus,Integer pageNum){
	  return tblBaseAdminmenuService.searchBaseAdminmenuByCondition(menuName, menuStatus, pageNum);
	}
	//添加menu
	@RequestMapping("/addmenu")
	@ResponseBody
	public String addmenu(String menuName,String menuDesc,String menuStatus){
	  return tblBaseAdminmenuService.addmenu(menuName,menuDesc,menuStatus)==1?"sucess":"false";
	}*/
	

}
