package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.BaseAdminUserMapper;
import com.lottery.entity.BaseAdminUser;
import com.lottery.service.BaseAdminUserService;
import com.lottery.util.DateFomatUtil;
@Service(value ="BaseAdminUserService")
public class BaseAdminUserServiceImp implements BaseAdminUserService {
	
	@Autowired
	BaseAdminUserMapper baseAdminUserMapper;

	//根据分页查询用户信息
	@Override
	public List<BaseAdminUser> searchBaseAdminUserByCondition(String sysUserName ,String sysUserCode,Integer userStatus,Integer pageNum) {
		BaseAdminUser baseAdminUser = new BaseAdminUser();
		baseAdminUser.setSysUserName(sysUserName);
		baseAdminUser.setSysUserCode(sysUserCode);
		baseAdminUser.setUserStatus(Short.valueOf(userStatus+""));
		baseAdminUser.setPageNum(pageNum);
		List<BaseAdminUser> tblBasePushMsgList = baseAdminUserMapper.searchBaseAdminUseByCondition(baseAdminUser);
		  for (BaseAdminUser BaseAdminUser : tblBasePushMsgList) {
		    	 BaseAdminUser.setRegTimeTow(
							DateFomatUtil.formatDateTime(BaseAdminUser.getRegTime(), "yyyy-MM-dd HH:mm:ss"));
			}
		return tblBasePushMsgList;
	}
    //根据分页查询总记录数目
	@Override
	public Integer searchTotallPageNum(String sysUserName ,String sysUserCode,Integer userStatus,Integer pageNum) {
		BaseAdminUser baseAdminUser = new BaseAdminUser();
		baseAdminUser.setSysUserName(sysUserName);
		baseAdminUser.setSysUserCode(sysUserCode);
		baseAdminUser.setUserStatus(Short.valueOf(userStatus+""));
		baseAdminUser.setPageNum(pageNum);
		return baseAdminUserMapper.searchTotallPageNum(baseAdminUser);
	}
	//添加新用户
	@Override
	public Integer addUser(BaseAdminUser baseAdminUser) {
		return baseAdminUserMapper.insertSelective(baseAdminUser);
	}
	
	//根据id查询用户信息
	@Override
	public BaseAdminUser findSysUserById(Integer id) {
		  
		return baseAdminUserMapper.selectByPrimaryKey(id);
	}
	
	//根据用户id更新用户信息
	@Override
	public Integer updateUserData(BaseAdminUser baseAdminUser) {
	
	
		return baseAdminUserMapper.updateByPrimaryKeySelective(baseAdminUser);
	}
	/*
	//根据集合删除用户记录
	@Override
	public Integer deleteUserDataByIds(List<Integer> idList) {
		BaseAdminUserMapper.deleteUserDataByIds(idList);
		return null;
	}
	*/
	@Override
	public BaseAdminUser login(BaseAdminUser baseAdminUser) {
		return baseAdminUserMapper.login(baseAdminUser).size()>0?baseAdminUserMapper.login(baseAdminUser).get(0):null;
	}

}
