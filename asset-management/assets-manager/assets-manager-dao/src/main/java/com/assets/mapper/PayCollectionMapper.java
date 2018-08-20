package com.assets.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.assets.pojo.PayCollection;
import com.assets.pojo.PayCollectionExample;

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

    List<PayCollection> selectPaySum(Map<String, Object> map);
}