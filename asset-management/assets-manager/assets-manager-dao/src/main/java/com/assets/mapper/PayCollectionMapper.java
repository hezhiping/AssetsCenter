package com.assets.mapper;

import com.assets.pojo.PayCollection;
import com.assets.pojo.PayCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayCollectionMapper {
    int countByExample(PayCollectionExample example);

    int deleteByExample(PayCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayCollection record);

    int insertSelective(PayCollection record);

    List<PayCollection> selectByExample(PayCollectionExample example);

    PayCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PayCollection record, @Param("example") PayCollectionExample example);

    int updateByExample(@Param("record") PayCollection record, @Param("example") PayCollectionExample example);

    int updateByPrimaryKeySelective(PayCollection record);

    int updateByPrimaryKey(PayCollection record);
}