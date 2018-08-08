package com.assets.mapper;

import com.assets.pojo.UserConstDic;
import com.assets.pojo.UserConstDicExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserConstDicMapper {
    int countByExample(UserConstDicExample example);

    int deleteByExample(UserConstDicExample example);

    int insert(UserConstDic record);

    int insertSelective(UserConstDic record);

    List<UserConstDic> selectByExample(UserConstDicExample example);

    int updateByExampleSelective(@Param("record") UserConstDic record, @Param("example") UserConstDicExample example);

    int updateByExample(@Param("record") UserConstDic record, @Param("example") UserConstDicExample example);
    
    // 关联查询用户配置的支出项
    UserConstDic selectUserSetDic(Map<String, Object> map);
}