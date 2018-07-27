package com.assets.mapper;

import com.assets.pojo.AssetIncom;
import com.assets.pojo.AssetIncomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetIncomMapper {
    int countByExample(AssetIncomExample example);

    int deleteByExample(AssetIncomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetIncom record);

    int insertSelective(AssetIncom record);

    List<AssetIncom> selectByExampleWithBLOBs(AssetIncomExample example);

    List<AssetIncom> selectByExample(AssetIncomExample example);

    AssetIncom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetIncom record, @Param("example") AssetIncomExample example);

    int updateByExampleWithBLOBs(@Param("record") AssetIncom record, @Param("example") AssetIncomExample example);

    int updateByExample(@Param("record") AssetIncom record, @Param("example") AssetIncomExample example);

    int updateByPrimaryKeySelective(AssetIncom record);

    int updateByPrimaryKeyWithBLOBs(AssetIncom record);

    int updateByPrimaryKey(AssetIncom record);
}