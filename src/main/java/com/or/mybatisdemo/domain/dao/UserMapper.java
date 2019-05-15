package com.or.mybatisdemo.domain.dao;

import com.or.mybatisdemo.base.baseMapper.BaseMapper;
import com.or.mybatisdemo.domain.eneity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<User> {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);



}