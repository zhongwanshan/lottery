package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.TblBaseAdminButtonMapper;
import com.lottery.entity.TblBaseAdminButton;
import com.lottery.service.TblBaseAdminButtonService;
@Service(value ="tblBaseAdminButtonService")
public class TblBaseAdminButtonServiceImp implements TblBaseAdminButtonService {
	
	@Autowired
	TblBaseAdminButtonMapper tblBaseAdminButtonMapper;

	@Override
	public List<TblBaseAdminButton> searchAllBaseAdminButton() {
		
		return tblBaseAdminButtonMapper.searchAllBaseAdminButton();
	}

	@Override
	public Integer searchTotallButtonNum(TblBaseAdminButton tblBaseAdminButton) {
		// TODO Auto-generated method stub
		return tblBaseAdminButtonMapper.searchTotallButtonNum(tblBaseAdminButton);
	}

	@Override
	public Integer addButton(TblBaseAdminButton tblBaseAdminButton) {
		// TODO Auto-generated method stub
		return tblBaseAdminButtonMapper.addButton(tblBaseAdminButton);
	}

	@Override
	public TblBaseAdminButton queryButtonById(Integer id) {
		
		return tblBaseAdminButtonMapper.queryButtonById(id).get(0);
	}

	@Override
	public Integer updateButtonData(TblBaseAdminButton tblBaseAdminButton) {
		// TODO Auto-generated method stub
		return tblBaseAdminButtonMapper.updateButtonData(tblBaseAdminButton);
	}

	@Override
	public Integer deleteButtonDataByIds(List<Integer> idList) {
		
		return tblBaseAdminButtonMapper.deleteButtonDataByIds(idList);
	}


}
