package com.assets.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PersonalLoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonalLoanExample() {
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

        public Criteria andLendPersonIsNull() {
            addCriterion("lend_person is null");
            return (Criteria) this;
        }

        public Criteria andLendPersonIsNotNull() {
            addCriterion("lend_person is not null");
            return (Criteria) this;
        }

        public Criteria andLendPersonEqualTo(String value) {
            addCriterion("lend_person =", value, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonNotEqualTo(String value) {
            addCriterion("lend_person <>", value, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonGreaterThan(String value) {
            addCriterion("lend_person >", value, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonGreaterThanOrEqualTo(String value) {
            addCriterion("lend_person >=", value, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonLessThan(String value) {
            addCriterion("lend_person <", value, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonLessThanOrEqualTo(String value) {
            addCriterion("lend_person <=", value, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonLike(String value) {
            addCriterion("lend_person like", value, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonNotLike(String value) {
            addCriterion("lend_person not like", value, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonIn(List<String> values) {
            addCriterion("lend_person in", values, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonNotIn(List<String> values) {
            addCriterion("lend_person not in", values, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonBetween(String value1, String value2) {
            addCriterion("lend_person between", value1, value2, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendPersonNotBetween(String value1, String value2) {
            addCriterion("lend_person not between", value1, value2, "lendPerson");
            return (Criteria) this;
        }

        public Criteria andLendDateIsNull() {
            addCriterion("lend_date is null");
            return (Criteria) this;
        }

        public Criteria andLendDateIsNotNull() {
            addCriterion("lend_date is not null");
            return (Criteria) this;
        }

        public Criteria andLendDateEqualTo(Date value) {
            addCriterionForJDBCDate("lend_date =", value, "lendDate");
            return (Criteria) this;
        }

        public Criteria andLendDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lend_date <>", value, "lendDate");
            return (Criteria) this;
        }

        public Criteria andLendDateGreaterThan(Date value) {
            addCriterionForJDBCDate("lend_date >", value, "lendDate");
            return (Criteria) this;
        }

        public Criteria andLendDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lend_date >=", value, "lendDate");
            return (Criteria) this;
        }

        public Criteria andLendDateLessThan(Date value) {
            addCriterionForJDBCDate("lend_date <", value, "lendDate");
            return (Criteria) this;
        }

        public Criteria andLendDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lend_date <=", value, "lendDate");
            return (Criteria) this;
        }

        public Criteria andLendDateIn(List<Date> values) {
            addCriterionForJDBCDate("lend_date in", values, "lendDate");
            return (Criteria) this;
        }

        public Criteria andLendDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lend_date not in", values, "lendDate");
            return (Criteria) this;
        }

        public Criteria andLendDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lend_date between", value1, value2, "lendDate");
            return (Criteria) this;
        }

        public Criteria andLendDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lend_date not between", value1, value2, "lendDate");
            return (Criteria) this;
        }

        public Criteria andLendMoneyIsNull() {
            addCriterion("lend_money is null");
            return (Criteria) this;
        }

        public Criteria andLendMoneyIsNotNull() {
            addCriterion("lend_money is not null");
            return (Criteria) this;
        }

        public Criteria andLendMoneyEqualTo(BigDecimal value) {
            addCriterion("lend_money =", value, "lendMoney");
            return (Criteria) this;
        }

        public Criteria andLendMoneyNotEqualTo(BigDecimal value) {
            addCriterion("lend_money <>", value, "lendMoney");
            return (Criteria) this;
        }

        public Criteria andLendMoneyGreaterThan(BigDecimal value) {
            addCriterion("lend_money >", value, "lendMoney");
            return (Criteria) this;
        }

        public Criteria andLendMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lend_money >=", value, "lendMoney");
            return (Criteria) this;
        }

        public Criteria andLendMoneyLessThan(BigDecimal value) {
            addCriterion("lend_money <", value, "lendMoney");
            return (Criteria) this;
        }

        public Criteria andLendMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lend_money <=", value, "lendMoney");
            return (Criteria) this;
        }

        public Criteria andLendMoneyIn(List<BigDecimal> values) {
            addCriterion("lend_money in", values, "lendMoney");
            return (Criteria) this;
        }

        public Criteria andLendMoneyNotIn(List<BigDecimal> values) {
            addCriterion("lend_money not in", values, "lendMoney");
            return (Criteria) this;
        }

        public Criteria andLendMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lend_money between", value1, value2, "lendMoney");
            return (Criteria) this;
        }

        public Criteria andLendMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lend_money not between", value1, value2, "lendMoney");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitIsNull() {
            addCriterion("accumulate_profit is null");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitIsNotNull() {
            addCriterion("accumulate_profit is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitEqualTo(BigDecimal value) {
            addCriterion("accumulate_profit =", value, "accumulateProfit");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitNotEqualTo(BigDecimal value) {
            addCriterion("accumulate_profit <>", value, "accumulateProfit");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitGreaterThan(BigDecimal value) {
            addCriterion("accumulate_profit >", value, "accumulateProfit");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accumulate_profit >=", value, "accumulateProfit");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitLessThan(BigDecimal value) {
            addCriterion("accumulate_profit <", value, "accumulateProfit");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accumulate_profit <=", value, "accumulateProfit");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitIn(List<BigDecimal> values) {
            addCriterion("accumulate_profit in", values, "accumulateProfit");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitNotIn(List<BigDecimal> values) {
            addCriterion("accumulate_profit not in", values, "accumulateProfit");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accumulate_profit between", value1, value2, "accumulateProfit");
            return (Criteria) this;
        }

        public Criteria andAccumulateProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accumulate_profit not between", value1, value2, "accumulateProfit");
            return (Criteria) this;
        }

        public Criteria andGoingIsNull() {
            addCriterion("going is null");
            return (Criteria) this;
        }

        public Criteria andGoingIsNotNull() {
            addCriterion("going is not null");
            return (Criteria) this;
        }

        public Criteria andGoingEqualTo(String value) {
            addCriterion("going =", value, "going");
            return (Criteria) this;
        }

        public Criteria andGoingNotEqualTo(String value) {
            addCriterion("going <>", value, "going");
            return (Criteria) this;
        }

        public Criteria andGoingGreaterThan(String value) {
            addCriterion("going >", value, "going");
            return (Criteria) this;
        }

        public Criteria andGoingGreaterThanOrEqualTo(String value) {
            addCriterion("going >=", value, "going");
            return (Criteria) this;
        }

        public Criteria andGoingLessThan(String value) {
            addCriterion("going <", value, "going");
            return (Criteria) this;
        }

        public Criteria andGoingLessThanOrEqualTo(String value) {
            addCriterion("going <=", value, "going");
            return (Criteria) this;
        }

        public Criteria andGoingLike(String value) {
            addCriterion("going like", value, "going");
            return (Criteria) this;
        }

        public Criteria andGoingNotLike(String value) {
            addCriterion("going not like", value, "going");
            return (Criteria) this;
        }

        public Criteria andGoingIn(List<String> values) {
            addCriterion("going in", values, "going");
            return (Criteria) this;
        }

        public Criteria andGoingNotIn(List<String> values) {
            addCriterion("going not in", values, "going");
            return (Criteria) this;
        }

        public Criteria andGoingBetween(String value1, String value2) {
            addCriterion("going between", value1, value2, "going");
            return (Criteria) this;
        }

        public Criteria andGoingNotBetween(String value1, String value2) {
            addCriterion("going not between", value1, value2, "going");
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