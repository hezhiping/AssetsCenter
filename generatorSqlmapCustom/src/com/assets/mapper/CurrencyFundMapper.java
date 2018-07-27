package com.assets.mapper;

import com.assets.pojo.CurrencyFund;
import com.assets.pojo.CurrencyFundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrencyFundMapper {
    int countByExample(CurrencyFundExample example);

    int deleteByExample(CurrencyFundExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CurrencyFund record);

    int insertSelective(CurrencyFund record);

    List<CurrencyFund> selectByExample(CurrencyFundExample example);

    CurrencyFund selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CurrencyFund record, @Param("example") CurrencyFundExample example);

    int updateByExample(@Param("record") CurrencyFund record, @Param("example") CurrencyFundExample example);

    int updateByPrimaryKeySelective(CurrencyFund record);

    int updateByPrimaryKey(CurrencyFund record);
}