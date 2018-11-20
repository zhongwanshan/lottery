package com.lottery.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.TblBaseAdminPage;
import com.lottery.service.TblBaseAdminPageService;

@Controller
@RequestMapping("/pageManager")
public class PageManagerController {

	@Autowired
	TblBaseAdminPageService tblBaseAdminPageService;

	// 跳转到对应的页面目录
	@RequestMapping("/pageHome")
	public String homePath(Map<String, Object> mapValue) {
		TblBaseAdminPage tblBaseAdminPage= new TblBaseAdminPage();
		tblBaseAdminPage.setIsDel(2);
		tblBaseAdminPage.setPageNum(0);
		//按时间排序查询最新的10条记录
		List<TblBaseAdminPage> tblBaseAdminPageList = tblBaseAdminPageService.searchBaseAdminPageByCondition(tblBaseAdminPage);
		//查询总记录数
		Integer totallNum =tblBaseAdminPageService.searchTotallPageNum(tblBaseAdminPage);
		mapValue.put("dataList", tblBaseAdminPageList);
		mapValue.put("totallNum", totallNum);
		
		return "pageHome";
	}

	// 跳转到对应的新增页面
	@RequestMapping("/addPagePath")
	public String addpagePath() {
		return "addPage";
	}

	// 新增页面的信息
	@RequestMapping("/addPage")
	@ResponseBody
	public String addpage(TblBaseAdminPage tblBaseAdminPage) {
		return tblBaseAdminPageService.addPage(tblBaseAdminPage) > 0 ? "sucess" : "false";

	}

	// 保存页面的信息
	@RequestMapping("/updatePagePath")
	public String pageDetail(Integer id, Map<String, Object> mapValue) {
		TblBaseAdminPage tblBaseAdminPage = tblBaseAdminPageService.querypageById(id);
		mapValue.put("tblBaseAdminPage", tblBaseAdminPage);
		return "updatePage";
	}
	
	// 修改页面的信息
	@RequestMapping("/updatePage")
	@ResponseBody
	public String UpdatePage(TblBaseAdminPage tblBaseAdminPage) {
		return tblBaseAdminPageService.updatePageData(tblBaseAdminPage) > 0 ? "sucess" : "false";
	}

	/**
	 * 删除选中的记录
	 * 
	 * @param idList
	 * @return
	 */

	@RequestMapping("/deletePageDataByIds")
	@ResponseBody
	public String deletePageDataByIds(String idList) {
		String[] idString = idList.split(",");
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < idString.length; i++) {
			intList.add(Integer.parseInt(idString[i]));
		}
		return tblBaseAdminPageService.deletePageDataByIds(intList) > 1 ? "sucess" : "false";
	}

	/**
	 * 查询页面记录
	 * 
	 * @param tblBaseAdminPage
	 * @return
	 */
	@RequestMapping("/searchBaseAdminPageByCondition")
	@ResponseBody
	public List<TblBaseAdminPage> searchBaseAdminPageByCondition(TblBaseAdminPage tblBaseAdminPage) {
		// 根据查询条件查询分页记录

		return tblBaseAdminPageService.searchBaseAdminPageByCondition(tblBaseAdminPage);
	}

	/**
	 * 查询页面总记录
	 * 
	 * @param tblBaseAdminPage
	 * @return
	 */
	@RequestMapping("/queryTotallNumByCondition")
	@ResponseBody
	public Integer queryTotallNumByCondition(TblBaseAdminPage tblBaseAdminPage) {

		return tblBaseAdminPageService.searchTotallPageNum(tblBaseAdminPage);
	}

}
