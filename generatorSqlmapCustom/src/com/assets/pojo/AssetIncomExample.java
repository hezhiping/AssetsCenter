package com.assets.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetIncomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetIncomExample() {
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

        public Criteria andDailyIncomIsNull() {
            addCriterion("daily_incom is null");
            return (Criteria) this;
        }

        public Criteria andDailyIncomIsNotNull() {
            addCriterion("daily_incom is not null");
            return (Criteria) this;
        }

        public Criteria andDailyIncomEqualTo(BigDecimal value) {
            addCriterion("daily_incom =", value, "dailyIncom");
            return (Criteria) this;
        }

        public Criteria andDailyIncomNotEqualTo(BigDecimal value) {
            addCriterion("daily_incom <>", value, "dailyIncom");
            return (Criteria) this;
        }

        public Criteria andDailyIncomGreaterThan(BigDecimal value) {
            addCriterion("daily_incom >", value, "dailyIncom");
            return (Criteria) this;
        }

        public Criteria andDailyIncomGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("daily_incom >=", value, "dailyIncom");
            return (Criteria) this;
        }

        public Criteria andDailyIncomLessThan(BigDecimal value) {
            addCriterion("daily_incom <", value, "dailyIncom");
            return (Criteria) this;
        }

        public Criteria andDailyIncomLessThanOrEqualTo(BigDecimal value) {
            addCriterion("daily_incom <=", value, "dailyIncom");
            return (Criteria) this;
        }

        public Criteria andDailyIncomIn(List<BigDecimal> values) {
            addCriterion("daily_incom in", values, "dailyIncom");
            return (Criteria) this;
        }

        public Criteria andDailyIncomNotIn(List<BigDecimal> values) {
            addCriterion("daily_incom not in", values, "dailyIncom");
            return (Criteria) this;
        }

        public Criteria andDailyIncomBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daily_incom between", value1, value2, "dailyIncom");
            return (Criteria) this;
        }

        public Criteria andDailyIncomNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daily_incom not between", value1, value2, "dailyIncom");
            return (Criteria) this;
        }

        public Criteria andDailyPayIsNull() {
            addCriterion("daily_pay is null");
            return (Criteria) this;
        }

        public Criteria andDailyPayIsNotNull() {
            addCriterion("daily_pay is not null");
            return (Criteria) this;
        }

        public Criteria andDailyPayEqualTo(BigDecimal value) {
            addCriterion("daily_pay =", value, "dailyPay");
            return (Criteria) this;
        }

        public Criteria andDailyPayNotEqualTo(BigDecimal value) {
            addCriterion("daily_pay <>", value, "dailyPay");
            return (Criteria) this;
        }

        public Criteria andDailyPayGreaterThan(BigDecimal value) {
            addCriterion("daily_pay >", value, "dailyPay");
            return (Criteria) this;
        }

        public Criteria andDailyPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("daily_pay >=", value, "dailyPay");
            return (Criteria) this;
        }

        public Criteria andDailyPayLessThan(BigDecimal value) {
            addCriterion("daily_pay <", value, "dailyPay");
            return (Criteria) this;
        }

        public Criteria andDailyPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("daily_pay <=", value, "dailyPay");
            return (Criteria) this;
        }

        public Criteria andDailyPayIn(List<BigDecimal> values) {
            addCriterion("daily_pay in", values, "dailyPay");
            return (Criteria) this;
        }

        public Criteria andDailyPayNotIn(List<BigDecimal> values) {
            addCriterion("daily_pay not in", values, "dailyPay");
            return (Criteria) this;
        }

        public Criteria andDailyPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daily_pay between", value1, value2, "dailyPay");
            return (Criteria) this;
        }

        public Criteria andDailyPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daily_pay not between", value1, value2, "dailyPay");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomIsNull() {
            addCriterion("non_daily_incom is null");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomIsNotNull() {
            addCriterion("non_daily_incom is not null");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomEqualTo(BigDecimal value) {
            addCriterion("non_daily_incom =", value, "nonDailyIncom");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomNotEqualTo(BigDecimal value) {
            addCriterion("non_daily_incom <>", value, "nonDailyIncom");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomGreaterThan(BigDecimal value) {
            addCriterion("non_daily_incom >", value, "nonDailyIncom");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("non_daily_incom >=", value, "nonDailyIncom");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomLessThan(BigDecimal value) {
            addCriterion("non_daily_incom <", value, "nonDailyIncom");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomLessThanOrEqualTo(BigDecimal value) {
            addCriterion("non_daily_incom <=", value, "nonDailyIncom");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomIn(List<BigDecimal> values) {
            addCriterion("non_daily_incom in", values, "nonDailyIncom");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomNotIn(List<BigDecimal> values) {
            addCriterion("non_daily_incom not in", values, "nonDailyIncom");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("non_daily_incom between", value1, value2, "nonDailyIncom");
            return (Criteria) this;
        }

        public Criteria andNonDailyIncomNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("non_daily_incom not between", value1, value2, "nonDailyIncom");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayIsNull() {
            addCriterion("non_daily_pay is null");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayIsNotNull() {
            addCriterion("non_daily_pay is not null");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayEqualTo(BigDecimal value) {
            addCriterion("non_daily_pay =", value, "nonDailyPay");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayNotEqualTo(BigDecimal value) {
            addCriterion("non_daily_pay <>", value, "nonDailyPay");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayGreaterThan(BigDecimal value) {
            addCriterion("non_daily_pay >", value, "nonDailyPay");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("non_daily_pay >=", value, "nonDailyPay");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayLessThan(BigDecimal value) {
            addCriterion("non_daily_pay <", value, "nonDailyPay");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("non_daily_pay <=", value, "nonDailyPay");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayIn(List<BigDecimal> values) {
            addCriterion("non_daily_pay in", values, "nonDailyPay");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayNotIn(List<BigDecimal> values) {
            addCriterion("non_daily_pay not in", values, "nonDailyPay");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("non_daily_pay between", value1, value2, "nonDailyPay");
            return (Criteria) this;
        }

        public Criteria andNonDailyPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("non_daily_pay not between", value1, value2, "nonDailyPay");
            return (Criteria) this;
        }

        public Criteria andAddProfitIsNull() {
            addCriterion("add_profit is null");
            return (Criteria) this;
        }

        public Criteria andAddProfitIsNotNull() {
            addCriterion("add_profit is not null");
            return (Criteria) this;
        }

        public Criteria andAddProfitEqualTo(BigDecimal value) {
            addCriterion("add_profit =", value, "addProfit");
            return (Criteria) this;
        }

        public Criteria andAddProfitNotEqualTo(BigDecimal value) {
            addCriterion("add_profit <>", value, "addProfit");
            return (Criteria) this;
        }

        public Criteria andAddProfitGreaterThan(BigDecimal value) {
            addCriterion("add_profit >", value, "addProfit");
            return (Criteria) this;
        }

        public Criteria andAddProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("add_profit >=", value, "addProfit");
            return (Criteria) this;
        }

        public Criteria andAddProfitLessThan(BigDecimal value) {
            addCriterion("add_profit <", value, "addProfit");
            return (Criteria) this;
        }

        public Criteria andAddProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("add_profit <=", value, "addProfit");
            return (Criteria) this;
        }

        public Criteria andAddProfitIn(List<BigDecimal> values) {
            addCriterion("add_profit in", values, "addProfit");
            return (Criteria) this;
        }

        public Criteria andAddProfitNotIn(List<BigDecimal> values) {
            addCriterion("add_profit not in", values, "addProfit");
            return (Criteria) this;
        }

        public Criteria andAddProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("add_profit between", value1, value2, "addProfit");
            return (Criteria) this;
        }

        public Criteria andAddProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("add_profit not between", value1, value2, "addProfit");
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