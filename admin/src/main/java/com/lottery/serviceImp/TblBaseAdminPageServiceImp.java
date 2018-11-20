package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.TblBaseAdminPageMapper;
import com.lottery.entity.TblBaseAdminPage;
import com.lottery.service.TblBaseAdminPageService;
@Service(value ="tblBaseAdminPageService")
public class TblBaseAdminPageServiceImp implements TblBaseAdminPageService {
	
	@Autowired
	TblBaseAdminPageMapper tblBaseAdminPageMapper;

	@Override
	public List<TblBaseAdminPage> searchBaseAdminPageByCondition(TblBaseAdminPage tblBaseAdminPage) {
		
		return tblBaseAdminPageMapper.searchBaseAdminPageByCondition(tblBaseAdminPage);
	}

	@Override
	public Integer searchTotallPageNum(TblBaseAdminPage tblBaseAdminPage) {
		// TODO Auto-generated method stub
		return tblBaseAdminPageMapper.searchTotallPageNum(tblBaseAdminPage);
	}

	@Override
	public Integer addPage(TblBaseAdminPage tblBaseAdminPage) {
		// TODO Auto-generated method stub
		return tblBaseAdminPageMapper.addPage(tblBaseAdminPage);
	}

	@Override
	public TblBaseAdminPage querypageById(Integer id) {
		
		return tblBaseAdminPageMapper.querypageById(id).get(0);
	}

	@Override
	public Integer updatePageData(TblBaseAdminPage tblBaseAdminPage) {
		
		return tblBaseAdminPageMapper.updatePageData(tblBaseAdminPage);
	}

	@Override
	public Integer deletePageDataByIds(List<Integer> idList) {
		
		return tblBaseAdminPageMapper.deletePageDataByIds(idList);
	}


}
