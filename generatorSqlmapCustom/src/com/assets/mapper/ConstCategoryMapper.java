package com.assets.mapper;

import com.assets.pojo.ConstCategory;
import com.assets.pojo.ConstCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstCategoryMapper {
    int countByExample(ConstCategoryExample example);

    int deleteByExample(ConstCategoryExample example);

    int deleteByPrimaryKey(String category);

    int insert(ConstCategory record);

    int insertSelective(ConstCategory record);

    List<ConstCategory> selectByExample(ConstCategoryExample example);

    ConstCategory selectByPrimaryKey(String category);

    int updateByExampleSelective(@Param("record") ConstCategory record, @Param("example") ConstCategoryExample example);

    int updateByExample(@Param("record") ConstCategory record, @Param("example") ConstCategoryExample example);

    int updateByPrimaryKeySelective(ConstCategory record);

    int updateByPrimaryKey(ConstCategory record);
}