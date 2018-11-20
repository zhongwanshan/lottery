package com.lottery.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.TblBaseAdminMenuMapper;
import com.lottery.entity.MenuZNode;
import com.lottery.entity.TblBaseAdminMenu;
import com.lottery.service.TblBaseAdminMenuService;
@Service(value ="tblBaseAdminMService")
public class TblBaseAdminMenuServiceImp implements TblBaseAdminMenuService {
	
	@Autowired
	TblBaseAdminMenuMapper tblBaseAdminMenuMapper;
    //添加菜单
	@Override
	public Integer addMenu(TblBaseAdminMenu tblBaseAdminMenu) {
		// TODO Auto-generated method stub
		return tblBaseAdminMenuMapper.addMenu(tblBaseAdminMenu);
	}
	//根据id查询数据
	@Override
	public TblBaseAdminMenu queryMenuById(Integer id) {
		List<TblBaseAdminMenu> tblBaseAdminMenu =tblBaseAdminMenuMapper.queryMenuById(id);
		return tblBaseAdminMenu.get(0);
	}
	//查询所有菜单
	@Override
	public List<MenuZNode> queryAllMenuDatas() {
		List<MenuZNode> menuZNodeList = new ArrayList<MenuZNode>();
		List<TblBaseAdminMenu>  tblBaseAdminMenuLlist= tblBaseAdminMenuMapper.queryAllMenuDatas();
		//构造数据集
		for (TblBaseAdminMenu tblBaseAdminMenu : tblBaseAdminMenuLlist) {
			MenuZNode menuZNode = new MenuZNode();
			menuZNode.setId(tblBaseAdminMenu.getId());
			menuZNode.setName(tblBaseAdminMenu.getMenuName());
			menuZNode.setpId(tblBaseAdminMenu.getParaMenuId());
			menuZNode.setOpen(true);
			menuZNodeList.add(menuZNode);
		}
		return menuZNodeList;
	}
	//删除对应的数据
	@Override
	public Integer deleteMenuDataByIds(List<Integer> idList) {
		  
		return tblBaseAdminMenuMapper.deleteMenuDataByIds(idList);
	}
	
	

}
