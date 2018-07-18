package com.assets.mapper;

import com.assets.pojo.AssetOut;
import com.assets.pojo.AssetOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetOutMapper {
    int countByExample(AssetOutExample example);

    int deleteByExample(AssetOutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetOut record);

    int insertSelective(AssetOut record);

    List<AssetOut> selectByExampleWithBLOBs(AssetOutExample example);

    List<AssetOut> selectByExample(AssetOutExample example);

    AssetOut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetOut record, @Param("example") AssetOutExample example);

    int updateByExampleWithBLOBs(@Param("record") AssetOut record, @Param("example") AssetOutExample example);

    int updateByExample(@Param("record") AssetOut record, @Param("example") AssetOutExample example);

    int updateByPrimaryKeySelective(AssetOut record);

    int updateByPrimaryKeyWithBLOBs(AssetOut record);

    int updateByPrimaryKey(AssetOut record);
}