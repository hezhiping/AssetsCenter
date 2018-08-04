package com.assets.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InvestBankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvestBankExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPsnCodeIsNull() {
            addCriterion("psn_code is null");
            return (Criteria) this;
        }

        public Criteria andPsnCodeIsNotNull() {
            addCriterion("psn_code is not null");
            return (Criteria) this;
        }

        public Criteria andPsnCodeEqualTo(Integer value) {
            addCriterion("psn_code =", value, "psnCode");
            return (Criteria) this;
        }

        public Criteria andPsnCodeNotEqualTo(Integer value) {
            addCriterion("psn_code <>", value, "psnCode");
            return (Criteria) this;
        }

        public Criteria andPsnCodeGreaterThan(Integer value) {
            addCriterion("psn_code >", value, "psnCode");
            return (Criteria) this;
        }

        public Criteria andPsnCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("psn_code >=", value, "psnCode");
            return (Criteria) this;
        }

        public Criteria andPsnCodeLessThan(Integer value) {
            addCriterion("psn_code <", value, "psnCode");
            return (Criteria) this;
        }

        public Criteria andPsnCodeLessThanOrEqualTo(Integer value) {
            addCriterion("psn_code <=", value, "psnCode");
            return (Criteria) this;
        }

        public Criteria andPsnCodeIn(List<Integer> values) {
            addCriterion("psn_code in", values, "psnCode");
            return (Criteria) this;
        }

        public Criteria andPsnCodeNotIn(List<Integer> values) {
            addCriterion("psn_code not in", values, "psnCode");
            return (Criteria) this;
        }

        public Criteria andPsnCodeBetween(Integer value1, Integer value2) {
            addCriterion("psn_code between", value1, value2, "psnCode");
            return (Criteria) this;
        }

        public Criteria andPsnCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("psn_code not between", value1, value2, "psnCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeIsNull() {
            addCriterion("invest_code is null");
            return (Criteria) this;
        }

        public Criteria andInvestCodeIsNotNull() {
            addCriterion("invest_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvestCodeEqualTo(Integer value) {
            addCriterion("invest_code =", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeNotEqualTo(Integer value) {
            addCriterion("invest_code <>", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeGreaterThan(Integer value) {
            addCriterion("invest_code >", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("invest_code >=", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeLessThan(Integer value) {
            addCriterion("invest_code <", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeLessThanOrEqualTo(Integer value) {
            addCriterion("invest_code <=", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeIn(List<Integer> values) {
            addCriterion("invest_code in", values, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeNotIn(List<Integer> values) {
            addCriterion("invest_code not in", values, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeBetween(Integer value1, Integer value2) {
            addCriterion("invest_code between", value1, value2, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("invest_code not between", value1, value2, "investCode");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthIsNull() {
            addCriterion("current_month is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthIsNotNull() {
            addCriterion("current_month is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthEqualTo(String value) {
            addCriterion("current_month =", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotEqualTo(String value) {
            addCriterion("current_month <>", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthGreaterThan(String value) {
            addCriterion("current_month >", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthGreaterThanOrEqualTo(String value) {
            addCriterion("current_month >=", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthLessThan(String value) {
            addCriterion("current_month <", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthLessThanOrEqualTo(String value) {
            addCriterion("current_month <=", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthLike(String value) {
            addCriterion("current_month like", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotLike(String value) {
            addCriterion("current_month not like", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthIn(List<String> values) {
            addCriterion("current_month in", values, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotIn(List<String> values) {
            addCriterion("current_month not in", values, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthBetween(String value1, String value2) {
            addCriterion("current_month between", value1, value2, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotBetween(String value1, String value2) {
            addCriterion("current_month not between", value1, value2, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andInvestNameIsNull() {
            addCriterion("invest_name is null");
            return (Criteria) this;
        }

        public Criteria andInvestNameIsNotNull() {
            addCriterion("invest_name is not null");
            return (Criteria) this;
        }

        public Criteria andInvestNameEqualTo(String value) {
            addCriterion("invest_name =", value, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameNotEqualTo(String value) {
            addCriterion("invest_name <>", value, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameGreaterThan(String value) {
            addCriterion("invest_name >", value, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameGreaterThanOrEqualTo(String value) {
            addCriterion("invest_name >=", value, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameLessThan(String value) {
            addCriterion("invest_name <", value, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameLessThanOrEqualTo(String value) {
            addCriterion("invest_name <=", value, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameLike(String value) {
            addCriterion("invest_name like", value, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameNotLike(String value) {
            addCriterion("invest_name not like", value, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameIn(List<String> values) {
            addCriterion("invest_name in", values, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameNotIn(List<String> values) {
            addCriterion("invest_name not in", values, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameBetween(String value1, String value2) {
            addCriterion("invest_name between", value1, value2, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestNameNotBetween(String value1, String value2) {
            addCriterion("invest_name not between", value1, value2, "investName");
            return (Criteria) this;
        }

        public Criteria andInvestDateIsNull() {
            addCriterion("invest_date is null");
            return (Criteria) this;
        }

        public Criteria andInvestDateIsNotNull() {
            addCriterion("invest_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvestDateEqualTo(Date value) {
            addCriterionForJDBCDate("invest_date =", value, "investDate");
            return (Criteria) this;
        }

        public Criteria andInvestDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("invest_date <>", value, "investDate");
            return (Criteria) this;
        }

        public Criteria andInvestDateGreaterThan(Date value) {
            addCriterionForJDBCDate("invest_date >", value, "investDate");
            return (Criteria) this;
        }

        public Criteria andInvestDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("invest_date >=", value, "investDate");
            return (Criteria) this;
        }

        public Criteria andInvestDateLessThan(Date value) {
            addCriterionForJDBCDate("invest_date <", value, "investDate");
            return (Criteria) this;
        }

        public Criteria andInvestDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("invest_date <=", value, "investDate");
            return (Criteria) this;
        }

        public Criteria andInvestDateIn(List<Date> values) {
            addCriterionForJDBCDate("invest_date in", values, "investDate");
            return (Criteria) this;
        }

        public Criteria andInvestDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("invest_date not in", values, "investDate");
            return (Criteria) this;
        }

        public Criteria andInvestDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("invest_date between", value1, value2, "investDate");
            return (Criteria) this;
        }

        public Criteria andInvestDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("invest_date not between", value1, value2, "investDate");
            return (Criteria) this;
        }

        public Criteria andInvestTypeIsNull() {
            addCriterion("invest_type is null");
            return (Criteria) this;
        }

        public Criteria andInvestTypeIsNotNull() {
            addCriterion("invest_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvestTypeEqualTo(String value) {
            addCriterion("invest_type =", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeNotEqualTo(String value) {
            addCriterion("invest_type <>", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeGreaterThan(String value) {
            addCriterion("invest_type >", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invest_type >=", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeLessThan(String value) {
            addCriterion("invest_type <", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeLessThanOrEqualTo(String value) {
            addCriterion("invest_type <=", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeLike(String value) {
            addCriterion("invest_type like", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeNotLike(String value) {
            addCriterion("invest_type not like", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeIn(List<String> values) {
            addCriterion("invest_type in", values, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeNotIn(List<String> values) {
            addCriterion("invest_type not in", values, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeBetween(String value1, String value2) {
            addCriterion("invest_type between", value1, value2, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeNotBetween(String value1, String value2) {
            addCriterion("invest_type not between", value1, value2, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyIsNull() {
            addCriterion("invest_money is null");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyIsNotNull() {
            addCriterion("invest_money is not null");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyEqualTo(BigDecimal value) {
            addCriterion("invest_money =", value, "investMoney");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyNotEqualTo(BigDecimal value) {
            addCriterion("invest_money <>", value, "investMoney");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyGreaterThan(BigDecimal value) {
            addCriterion("invest_money >", value, "investMoney");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invest_money >=", value, "investMoney");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyLessThan(BigDecimal value) {
            addCriterion("invest_money <", value, "investMoney");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invest_money <=", value, "investMoney");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyIn(List<BigDecimal> values) {
            addCriterion("invest_money in", values, "investMoney");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyNotIn(List<BigDecimal> values) {
            addCriterion("invest_money not in", values, "investMoney");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invest_money between", value1, value2, "investMoney");
            return (Criteria) this;
        }

        public Criteria andInvestMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invest_money not between", value1, value2, "investMoney");
            return (Criteria) this;
        }

        public Criteria andInvestProfitIsNull() {
            addCriterion("invest_profit is null");
            return (Criteria) this;
        }

        public Criteria andInvestProfitIsNotNull() {
            addCriterion("invest_profit is not null");
            return (Criteria) this;
        }

        public Criteria andInvestProfitEqualTo(BigDecimal value) {
            addCriterion("invest_profit =", value, "investProfit");
            return (Criteria) this;
        }

        public Criteria andInvestProfitNotEqualTo(BigDecimal value) {
            addCriterion("invest_profit <>", value, "investProfit");
            return (Criteria) this;
        }

        public Criteria andInvestProfitGreaterThan(BigDecimal value) {
            addCriterion("invest_profit >", value, "investProfit");
            return (Criteria) this;
        }

        public Criteria andInvestProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invest_profit >=", value, "investProfit");
            return (Criteria) this;
        }

        public Criteria andInvestProfitLessThan(BigDecimal value) {
            addCriterion("invest_profit <", value, "investProfit");
            return (Criteria) this;
        }

        public Criteria andInvestProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invest_profit <=", value, "investProfit");
            return (Criteria) this;
        }

        public Criteria andInvestProfitIn(List<BigDecimal> values) {
            addCriterion("invest_profit in", values, "investProfit");
            return (Criteria) this;
        }

        public Criteria andInvestProfitNotIn(List<BigDecimal> values) {
            addCriterion("invest_profit not in", values, "investProfit");
            return (Criteria) this;
        }

        public Criteria andInvestProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invest_profit between", value1, value2, "investProfit");
            return (Criteria) this;
        }

        public Criteria andInvestProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invest_profit not between", value1, value2, "investProfit");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateIsNull() {
            addCriterion("invest_profit_date is null");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateIsNotNull() {
            addCriterion("invest_profit_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateEqualTo(Date value) {
            addCriterionForJDBCDate("invest_profit_date =", value, "investProfitDate");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("invest_profit_date <>", value, "investProfitDate");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("invest_profit_date >", value, "investProfitDate");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("invest_profit_date >=", value, "investProfitDate");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateLessThan(Date value) {
            addCriterionForJDBCDate("invest_profit_date <", value, "investProfitDate");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("invest_profit_date <=", value, "investProfitDate");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateIn(List<Date> values) {
            addCriterionForJDBCDate("invest_profit_date in", values, "investProfitDate");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("invest_profit_date not in", values, "investProfitDate");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("invest_profit_date between", value1, value2, "investProfitDate");
            return (Criteria) this;
        }

        public Criteria andInvestProfitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("invest_profit_date not between", value1, value2, "investProfitDate");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnIsNull() {
            addCriterion("annualized_rate_return is null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnIsNotNull() {
            addCriterion("annualized_rate_return is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnEqualTo(String value) {
            addCriterion("annualized_rate_return =", value, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnNotEqualTo(String value) {
            addCriterion("annualized_rate_return <>", value, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnGreaterThan(String value) {
            addCriterion("annualized_rate_return >", value, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnGreaterThanOrEqualTo(String value) {
            addCriterion("annualized_rate_return >=", value, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnLessThan(String value) {
            addCriterion("annualized_rate_return <", value, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnLessThanOrEqualTo(String value) {
            addCriterion("annualized_rate_return <=", value, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnLike(String value) {
            addCriterion("annualized_rate_return like", value, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnNotLike(String value) {
            addCriterion("annualized_rate_return not like", value, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnIn(List<String> values) {
            addCriterion("annualized_rate_return in", values, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnNotIn(List<String> values) {
            addCriterion("annualized_rate_return not in", values, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnBetween(String value1, String value2) {
            addCriterion("annualized_rate_return between", value1, value2, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andAnnualizedRateReturnNotBetween(String value1, String value2) {
            addCriterion("annualized_rate_return not between", value1, value2, "annualizedRateReturn");
            return (Criteria) this;
        }

        public Criteria andTagStatusIsNull() {
            addCriterion("tag_status is null");
            return (Criteria) this;
        }

        public Criteria andTagStatusIsNotNull() {
            addCriterion("tag_status is not null");
            return (Criteria) this;
        }

        public Criteria andTagStatusEqualTo(String value) {
            addCriterion("tag_status =", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusNotEqualTo(String value) {
            addCriterion("tag_status <>", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusGreaterThan(String value) {
            addCriterion("tag_status >", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusGreaterThanOrEqualTo(String value) {
            addCriterion("tag_status >=", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusLessThan(String value) {
            addCriterion("tag_status <", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusLessThanOrEqualTo(String value) {
            addCriterion("tag_status <=", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusLike(String value) {
            addCriterion("tag_status like", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusNotLike(String value) {
            addCriterion("tag_status not like", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusIn(List<String> values) {
            addCriterion("tag_status in", values, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusNotIn(List<String> values) {
            addCriterion("tag_status not in", values, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusBetween(String value1, String value2) {
            addCriterion("tag_status between", value1, value2, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusNotBetween(String value1, String value2) {
            addCriterion("tag_status not between", value1, value2, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCurrentYearIsNull() {
            addCriterion("current_year is null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearIsNotNull() {
            addCriterion("current_year is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearEqualTo(String value) {
            addCriterion("current_year =", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearNotEqualTo(String value) {
            addCriterion("current_year <>", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearGreaterThan(String value) {
            addCriterion("current_year >", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearGreaterThanOrEqualTo(String value) {
            addCriterion("current_year >=", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearLessThan(String value) {
            addCriterion("current_year <", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearLessThanOrEqualTo(String value) {
            addCriterion("current_year <=", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearLike(String value) {
            addCriterion("current_year like", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearNotLike(String value) {
            addCriterion("current_year not like", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearIn(List<String> values) {
            addCriterion("current_year in", values, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearNotIn(List<String> values) {
            addCriterion("current_year not in", values, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearBetween(String value1, String value2) {
            addCriterion("current_year between", value1, value2, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearNotBetween(String value1, String value2) {
            addCriterion("current_year not between", value1, value2, "currentYear");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}