package com.assets.mapper;

import com.assets.pojo.ConstDictionary;
import com.assets.pojo.ConstDictionaryExample;
import com.assets.pojo.ConstDictionaryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstDictionaryMapper {
    int countByExample(ConstDictionaryExample example);

    int deleteByExample(ConstDictionaryExample example);

    int deleteByPrimaryKey(ConstDictionaryKey key);

    int insert(ConstDictionary record);

    int insertSelective(ConstDictionary record);

    List<ConstDictionary> selectByExample(ConstDictionaryExample example);

    ConstDictionary selectByPrimaryKey(ConstDictionaryKey key);

    int updateByExampleSelective(@Param("record") ConstDictionary record, @Param("example") ConstDictionaryExample example);

    int updateByExample(@Param("record") ConstDictionary record, @Param("example") ConstDictionaryExample example);

    int updateByPrimaryKeySelective(ConstDictionary record);

    int updateByPrimaryKey(ConstDictionary record);
}