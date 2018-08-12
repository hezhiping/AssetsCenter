package com.assets.mapper;

import com.assets.pojo.FundChange;
import com.assets.pojo.FundChangeExample;

import java.util.List;
import java.util.Map;

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
    // 关联常数字典表查询变更项名称
    List<FundChange> selectFundChangeList(Map<String, Object> map);
}