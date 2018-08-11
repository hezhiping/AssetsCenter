package com.assets.mapper;

import com.assets.pojo.FundChange;
import com.assets.pojo.FundChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundChangeMapper {
    int countByExample(FundChangeExample example);

    int deleteByExample(FundChangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FundChange record);

    int insertSelective(FundChange record);

    List<FundChange> selectByExample(FundChangeExample example);

    FundChange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FundChange record, @Param("example") FundChangeExample example);

    int updateByExample(@Param("record") FundChange record, @Param("example") FundChangeExample example);

    int updateByPrimaryKeySelective(FundChange record);

    int updateByPrimaryKey(FundChange record);
    
    List<FundChange> selectInfo();
}