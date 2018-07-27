package com.assets.mapper;

import com.assets.pojo.SysRoleAuthoritie;
import com.assets.pojo.SysRoleAuthoritieExample;
import com.assets.pojo.SysRoleAuthoritieKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleAuthoritieMapper {
    int countByExample(SysRoleAuthoritieExample example);

    int deleteByExample(SysRoleAuthoritieExample example);

    int deleteByPrimaryKey(SysRoleAuthoritieKey key);

    int insert(SysRoleAuthoritie record);

    int insertSelective(SysRoleAuthoritie record);

    List<SysRoleAuthoritie> selectByExample(SysRoleAuthoritieExample example);

    SysRoleAuthoritie selectByPrimaryKey(SysRoleAuthoritieKey key);

    int updateByExampleSelective(@Param("record") SysRoleAuthoritie record, @Param("example") SysRoleAuthoritieExample example);

    int updateByExample(@Param("record") SysRoleAuthoritie record, @Param("example") SysRoleAuthoritieExample example);

    int updateByPrimaryKeySelective(SysRoleAuthoritie record);

    int updateByPrimaryKey(SysRoleAuthoritie record);
}