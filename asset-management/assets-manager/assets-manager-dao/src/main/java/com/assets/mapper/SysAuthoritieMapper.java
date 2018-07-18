package com.assets.mapper;

import com.assets.pojo.SysAuthoritie;
import com.assets.pojo.SysAuthoritieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAuthoritieMapper {
    int countByExample(SysAuthoritieExample example);

    int deleteByExample(SysAuthoritieExample example);

    int deleteByPrimaryKey(Integer authorityId);

    int insert(SysAuthoritie record);

    int insertSelective(SysAuthoritie record);

    List<SysAuthoritie> selectByExample(SysAuthoritieExample example);

    SysAuthoritie selectByPrimaryKey(Integer authorityId);

    int updateByExampleSelective(@Param("record") SysAuthoritie record, @Param("example") SysAuthoritieExample example);

    int updateByExample(@Param("record") SysAuthoritie record, @Param("example") SysAuthoritieExample example);

    int updateByPrimaryKeySelective(SysAuthoritie record);

    int updateByPrimaryKey(SysAuthoritie record);
}