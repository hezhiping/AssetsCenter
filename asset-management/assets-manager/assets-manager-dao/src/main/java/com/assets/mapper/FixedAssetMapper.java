package com.assets.mapper;

import com.assets.pojo.FixedAsset;
import com.assets.pojo.FixedAssetExample;
import com.assets.pojo.FixedAssetKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FixedAssetMapper {
    int countByExample(FixedAssetExample example);

    int deleteByExample(FixedAssetExample example);

    int deleteByPrimaryKey(FixedAssetKey key);

    int insert(FixedAsset record);

    int insertSelective(FixedAsset record);

    List<FixedAsset> selectByExampleWithBLOBs(FixedAssetExample example);

    List<FixedAsset> selectByExample(FixedAssetExample example);

    FixedAsset selectByPrimaryKey(FixedAssetKey key);

    int updateByExampleSelective(@Param("record") FixedAsset record, @Param("example") FixedAssetExample example);

    int updateByExampleWithBLOBs(@Param("record") FixedAsset record, @Param("example") FixedAssetExample example);

    int updateByExample(@Param("record") FixedAsset record, @Param("example") FixedAssetExample example);

    int updateByPrimaryKeySelective(FixedAsset record);

    int updateByPrimaryKeyWithBLOBs(FixedAsset record);

    int updateByPrimaryKey(FixedAsset record);

    // 根据id 删除
	int deleteById(Integer integer);
}