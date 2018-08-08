package com.assets.mapper;

import com.assets.pojo.CreditLoan;
import com.assets.pojo.CreditLoanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditLoanMapper {
    int countByExample(CreditLoanExample example);

    int deleteByExample(CreditLoanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CreditLoan record);

    int insertSelective(CreditLoan record);

    List<CreditLoan> selectByExample(CreditLoanExample example);

    CreditLoan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CreditLoan record, @Param("example") CreditLoanExample example);

    int updateByExample(@Param("record") CreditLoan record, @Param("example") CreditLoanExample example);

    int updateByPrimaryKeySelective(CreditLoan record);

    int updateByPrimaryKey(CreditLoan record);
}