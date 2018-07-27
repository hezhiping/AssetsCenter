package com.assets.mapper;

import com.assets.pojo.InvestBank;
import com.assets.pojo.InvestBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvestBankMapper {
    int countByExample(InvestBankExample example);

    int deleteByExample(InvestBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InvestBank record);

    int insertSelective(InvestBank record);

    List<InvestBank> selectByExample(InvestBankExample example);

    InvestBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InvestBank record, @Param("example") InvestBankExample example);

    int updateByExample(@Param("record") InvestBank record, @Param("example") InvestBankExample example);

    int updateByPrimaryKeySelective(InvestBank record);

    int updateByPrimaryKey(InvestBank record);
}