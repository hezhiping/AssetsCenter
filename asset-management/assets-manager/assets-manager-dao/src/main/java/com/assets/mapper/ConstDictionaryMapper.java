package com.assets.mapper;

import com.assets.pojo.ConstDictionary;
import com.assets.pojo.ConstDictionaryExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ConstDictionaryMapper {
    int countByExample(ConstDictionaryExample example);

    int deleteByExample(ConstDictionaryExample example);

    int deleteByPrimaryKey(Integer costCode);

    int insert(ConstDictionary record);

    int insertSelective(ConstDictionary record);

    List<ConstDictionary> selectByExample(ConstDictionaryExample example);

    ConstDictionary selectByPrimaryKey(Integer costCode);

    int updateByExampleSelective(@Param("record") ConstDictionary record, @Param("example") ConstDictionaryExample example);

    int updateByExample(@Param("record") ConstDictionary record, @Param("example") ConstDictionaryExample example);

    int updateByPrimaryKeySelective(ConstDictionary record);

    int updateByPrimaryKey(ConstDictionary record);
    
    // 添加语句，获取常数配置项
    List<ConstDictionary> selectUserSetAllDic(Map<String, Object> map);
}