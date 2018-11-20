package com.lottery.dao;

import com.lottery.entity.BaseCity;
import com.lottery.entity.BaseCityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BaseCityMapper {
    long countByExample(BaseCityExample example);

    int deleteByExample(BaseCityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseCity record);

    int insertSelective(BaseCity record);

    List<BaseCity> selectByExample(BaseCityExample example);

    BaseCity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseCity record, @Param("example") BaseCityExample example);

    int updateByExample(@Param("record") BaseCity record, @Param("example") BaseCityExample example);

    int updateByPrimaryKeySelective(BaseCity record);

    int updateByPrimaryKey(BaseCity record);
    
    List<BaseCity> selectCityListByProvinceId(Integer provinceId);
    
}