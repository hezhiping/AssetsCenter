package com.assets.mapper;

import com.assets.pojo.SysResource;
import com.assets.pojo.SysResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourceMapper {
    int countByExample(SysResourceExample example);

    int deleteByExample(SysResourceExample example);

    int deleteByPrimaryKey(Long resourceId);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    List<SysResource> selectByExample(SysResourceExample example);

    SysResource selectByPrimaryKey(Long resourceId);

    int updateByExampleSelective(@Param("record") SysResource record, @Param("example") SysResourceExample example);

    int updateByExample(@Param("record") SysResource record, @Param("example") SysResourceExample example);

    int updateByPrimaryKeySelective(SysResource record);

    int updateByPrimaryKey(SysResource record);
}