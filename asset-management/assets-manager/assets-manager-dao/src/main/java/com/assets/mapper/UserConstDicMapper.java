package com.assets.mapper;

import com.assets.pojo.UserConstDic;
import com.assets.pojo.UserConstDicExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserConstDicMapper {
    int countByExample(UserConstDicExample example);

    int deleteByExample(UserConstDicExample example);

    int insert(UserConstDic record);

    int insertSelective(UserConstDic record);

    List<UserConstDic> selectByExample(UserConstDicExample example);

    int updateByExampleSelective(@Param("record") UserConstDic record, @Param("example") UserConstDicExample example);

    int updateByExample(@Param("record") UserConstDic record, @Param("example") UserConstDicExample example);
    
    /**
     *  关联查询用户配置的项   
     * @param  map设置两个参数 category =#{category}  AND psn_code = #{psnCode};
     * @param 
     * (1)psnCode为 中传入当前用户的psnCode 
     * (2) category 要查询的哪类配置
     * @return 返回用户配置的项，为19,20,21,26这种形式
     */
    UserConstDic selectUserSetDic(Map<String, Object> map);
    
    /**
      * 共用方法： 获取用户配置的损益分类 / 获取用户配置的收支方式 
     * @param  map设置一个参数;    	
	 * (1)category 要查询的哪类配置: category IN ('2_ZCX','3_SRX','4_BJSY')    
     * @return 返回用户配置的项，为19,20,21,26这种形式
     */  
    UserConstDic selectProfitLossPayIncomType(Map<String, Object> map);    
    
    
}