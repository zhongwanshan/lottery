package com.lottery.service;

import java.util.List;

import com.lottery.entity.TblBaseAdminPage;

public interface TblBaseAdminPageService {

	// 根据条件查询最新10条数据
	public List<TblBaseAdminPage> searchBaseAdminPageByCondition(TblBaseAdminPage tblBaseAdminPage);

	// 查询总页数
	public Integer searchTotallPageNum(TblBaseAdminPage tblBaseAdminPage);

	// 添加用户
	public Integer addPage(TblBaseAdminPage tblBaseAdminPage);
	// 根据id查询记录
	public TblBaseAdminPage querypageById(Integer id);
	// 根据id更新用户信息
   public Integer updatePageData(TblBaseAdminPage tblBaseAdminPage);
   // 根据id更新用户信息
   public Integer deletePageDataByIds(List<Integer> idList);
   
   

}
