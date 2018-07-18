package com.assets.mapper;

import com.assets.pojo.SysResourceAuthoritieExample;
import com.assets.pojo.SysResourceAuthoritieKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourceAuthoritieMapper {
    int countByExample(SysResourceAuthoritieExample example);

    int deleteByExample(SysResourceAuthoritieExample example);

    int deleteByPrimaryKey(SysResourceAuthoritieKey key);

    int insert(SysResourceAuthoritieKey record);

    int insertSelective(SysResourceAuthoritieKey record);

    List<SysResourceAuthoritieKey> selectByExample(SysResourceAuthoritieExample example);

    int updateByExampleSelective(@Param("record") SysResourceAuthoritieKey record, @Param("example") SysResourceAuthoritieExample example);

    int updateByExample(@Param("record") SysResourceAuthoritieKey record, @Param("example") SysResourceAuthoritieExample example);
}