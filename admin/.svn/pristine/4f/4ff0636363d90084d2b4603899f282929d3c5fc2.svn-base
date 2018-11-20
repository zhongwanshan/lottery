package com.lottery.dao;

import com.lottery.entity.UserWithdrawnOrder;
import com.lottery.entity.UserWithdrawnOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserWithdrawnOrderMapper {
    long countByExample(UserWithdrawnOrderExample example);

    int deleteByExample(UserWithdrawnOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserWithdrawnOrder record);

    int insertSelective(UserWithdrawnOrder record);

    List<UserWithdrawnOrder> selectByExample(UserWithdrawnOrderExample example);

    UserWithdrawnOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserWithdrawnOrder record, @Param("example") UserWithdrawnOrderExample example);

    int updateByExample(@Param("record") UserWithdrawnOrder record, @Param("example") UserWithdrawnOrderExample example);

    int updateByPrimaryKeySelective(UserWithdrawnOrder record);

    int updateByPrimaryKey(UserWithdrawnOrder record);
    //分页查询提现记录
    List<UserWithdrawnOrder> queryUserWithdrawnOrderByCondition(UserWithdrawnOrder userWithdrawnOrder);
    
    //根据条件查询总记录数
    Integer queryUserWithdrawnOrderCountByCondition(UserWithdrawnOrder userWithdrawnOrder);
}