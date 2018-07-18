package com.assets.mapper;

import com.assets.pojo.PersonalLoan;
import com.assets.pojo.PersonalLoanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalLoanMapper {
    int countByExample(PersonalLoanExample example);

    int deleteByExample(PersonalLoanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PersonalLoan record);

    int insertSelective(PersonalLoan record);

    List<PersonalLoan> selectByExampleWithBLOBs(PersonalLoanExample example);

    List<PersonalLoan> selectByExample(PersonalLoanExample example);

    PersonalLoan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PersonalLoan record, @Param("example") PersonalLoanExample example);

    int updateByExampleWithBLOBs(@Param("record") PersonalLoan record, @Param("example") PersonalLoanExample example);

    int updateByExample(@Param("record") PersonalLoan record, @Param("example") PersonalLoanExample example);

    int updateByPrimaryKeySelective(PersonalLoan record);

    int updateByPrimaryKeyWithBLOBs(PersonalLoan record);

    int updateByPrimaryKey(PersonalLoan record);
}