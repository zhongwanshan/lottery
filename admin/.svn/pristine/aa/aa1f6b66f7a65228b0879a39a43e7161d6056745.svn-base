package com.lottery.dao;

import com.lottery.entity.BaseAdminUser;
import com.lottery.entity.BaseAdminUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BaseAdminUserMapper {
    long countByExample(BaseAdminUserExample example);

    int deleteByExample(BaseAdminUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseAdminUser record);

    int insertSelective(BaseAdminUser record);

    List<BaseAdminUser> selectByExample(BaseAdminUserExample example);

    BaseAdminUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseAdminUser record, @Param("example") BaseAdminUserExample example);

    int updateByExample(@Param("record") BaseAdminUser record, @Param("example") BaseAdminUserExample example);

    int updateByPrimaryKeySelective(BaseAdminUser record);

    int updateByPrimaryKey(BaseAdminUser record);
    
    List<BaseAdminUser> searchBaseAdminUseByCondition(BaseAdminUser record);
    
    int searchTotallPageNum(BaseAdminUser record);
    
    List<BaseAdminUser> login(BaseAdminUser record);
}