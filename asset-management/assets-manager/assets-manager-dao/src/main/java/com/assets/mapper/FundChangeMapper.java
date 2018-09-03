package com.assets.mapper;

import com.assets.pojo.FundChange;
import com.assets.pojo.FundChangeExample;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface FundChangeMapper {
    int countByExample(FundChangeExample example);

    int deleteByExample(FundChangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FundChange record);

    int insertSelective(FundChange record);

    List<FundChange> selectByExample(FundChangeExample example);

    FundChange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FundChange record, @Param("example") FundChangeExample example);

    int updateByExample(@Param("record") FundChange record, @Param("example") FundChangeExample example);

    int updateByPrimaryKeySelective(FundChange record);

    int updateByPrimaryKey(FundChange record);
    /**
     *  关联常数字典表查询变更项名称
     * @param map
     * @return
     */
    List<FundChange> selectFundChangeList(Map<String, Object> map);

    /**
     * 查询资金变动表中支出总和
     * @param map
     * SELECT	IFNULL(SUM(t.pay_money),0) AS pay_money  FROM fund_change t WHERE t.psn_code = 1 AND t.current_year = '2018' 
     * AND t.current_month = '08' AND t.pay_mode = '27'; 
     * @return     * 
     */
	Map<String, Object> selectPaySumByConsCode(Map<String, Object> map);

	/**
	 * 查询资金变动表中偿还总和
	 * @param map
	 * SELECT	IFNULL(SUM(t.pay_money),0) AS incom_money FROM fund_change t WHERE t.psn_code = 1 AND t.current_year = '2018' 
	 * AND t.current_month = '08' AND t.incom_mode = '27' ;
	 * @return	 
	 */
	Map<String, Object>  selectRepaySumByConsCode(Map<String, Object> map);
}