package com.assets.mapper;

import com.assets.pojo.SysLog;
import com.assets.pojo.SysLogExample;
import com.assets.pojo.SysLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogMapper {
    int countByExample(SysLogExample example);

    int deleteByExample(SysLogExample example);

    int deleteByPrimaryKey(Long logCode);

    int insert(SysLogWithBLOBs record);

    int insertSelective(SysLogWithBLOBs record);

    List<SysLogWithBLOBs> selectByExampleWithBLOBs(SysLogExample example);

    List<SysLog> selectByExample(SysLogExample example);

    SysLogWithBLOBs selectByPrimaryKey(Long logCode);

    int updateByExampleSelective(@Param("record") SysLogWithBLOBs record, @Param("example") SysLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SysLogWithBLOBs record, @Param("example") SysLogExample example);

    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogExample example);

    int updateByPrimaryKeySelective(SysLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysLogWithBLOBs record);

    int updateByPrimaryKey(SysLog record);
}