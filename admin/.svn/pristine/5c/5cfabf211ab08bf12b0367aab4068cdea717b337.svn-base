package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.TblBaseAdminUserMapper;
import com.lottery.entity.TblBaseAdminUser;
import com.lottery.service.TblBaseAdminUserService;
import com.lottery.util.ConstantUtil;
@Service(value ="tblBaseAdminUserService")
public class TblBaseAdminUserServiceImp implements TblBaseAdminUserService {
	
	@Autowired
	TblBaseAdminUserMapper tblBaseAdminUserMapper;

	//根据分页查询用户信息
	@Override
	public List<TblBaseAdminUser> searchBaseAdminUserByCondition(String sysUserName ,String sysUserCode,Integer userStatus,Integer pageNum) {
		TblBaseAdminUser tblBaseAdminUser = new TblBaseAdminUser();
		tblBaseAdminUser.setSysUserName(sysUserName);
		tblBaseAdminUser.setSysUserCode(sysUserCode);
		tblBaseAdminUser.setUserStatus(userStatus);
		if (pageNum!=null) {
			tblBaseAdminUser.setPageNum(pageNum*ConstantUtil.messagePageSize);
		}
		List<TblBaseAdminUser> tblBasePushMsgList = tblBaseAdminUserMapper.searchBaseAdminUseByCondition(tblBaseAdminUser);
		return tblBasePushMsgList;
	}
    //根据分页查询总记录数目
	@Override
	public Integer searchTotallPageNum(String sysUserName ,String sysUserCode,Integer userStatus,Integer pageNum) {
		TblBaseAdminUser tblBaseAdminUser = new TblBaseAdminUser();
		tblBaseAdminUser.setSysUserName(sysUserName);
		tblBaseAdminUser.setSysUserCode(sysUserCode);
		tblBaseAdminUser.setUserStatus(userStatus);
		return tblBaseAdminUserMapper.searchTotallPageNum(tblBaseAdminUser);
	}
	//添加新用户
	@Override
	public Integer addUser(String sysUserName, String sysUserPwd) {
		TblBaseAdminUser tblBaseAdminUser = new TblBaseAdminUser();
		tblBaseAdminUser.setSysUserName(sysUserName);
		tblBaseAdminUser.setSysUserCode(sysUserName);
		tblBaseAdminUser.setUserStatus(0);
		tblBaseAdminUser.setSysUserPwd(sysUserPwd);
		Integer tblBaseAdminUserBack = tblBaseAdminUserMapper.addUser(tblBaseAdminUser);
	
		return tblBaseAdminUserBack;
	}
	//根据id查询用户信息
	@Override
	public TblBaseAdminUser findSysUserById(Integer id) {
		  
		return tblBaseAdminUserMapper.findSysUserById(id).get(0);
	}
	//根据用户id更新用户信息
	@Override
	public Integer updateUserData(String sysUserName, Integer userStatus, Integer id) {
		TblBaseAdminUser tblBaseAdminUser = new TblBaseAdminUser();
		tblBaseAdminUser.setId(id);
		tblBaseAdminUser.setSysUserName(sysUserName);
		tblBaseAdminUser.setUserStatus(userStatus);
		/*return tblBaseAdminUserMapper.updateUserData(tblBaseAdminUser);*/
		return tblBaseAdminUserMapper.updateUserData(tblBaseAdminUser);
	}
	//根据集合删除用户记录
	@Override
	public Integer deleteUserDataByIds(List<Integer> idList) {
		tblBaseAdminUserMapper.deleteUserDataByIds(idList);
		return null;
	}
	@Override
	public TblBaseAdminUser login(TblBaseAdminUser tblBaseAdminUser) {
		// TODO Auto-generated method stub
		return tblBaseAdminUserMapper.login(tblBaseAdminUser)==null?null:tblBaseAdminUserMapper.login(tblBaseAdminUser).get(0);
	}

}
