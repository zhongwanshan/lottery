package com.lottery.dao;

import com.lottery.entity.BaseProvince;
import com.lottery.entity.BaseProvinceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BaseProvinceMapper {
    long countByExample(BaseProvinceExample example);

    int deleteByExample(BaseProvinceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseProvince record);

    int insertSelective(BaseProvince record);

    List<BaseProvince> selectByExample(BaseProvinceExample example);

    BaseProvince selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseProvince record, @Param("example") BaseProvinceExample example);

    int updateByExample(@Param("record") BaseProvince record, @Param("example") BaseProvinceExample example);

    int updateByPrimaryKeySelective(BaseProvince record);

    int updateByPrimaryKey(BaseProvince record);
    
    List<BaseProvince> querAllProvince();
}