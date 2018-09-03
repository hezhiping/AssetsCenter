package com.assets.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditLoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditLoanExample() {
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

        public Criteria andCreditExposureIsNull() {
            addCriterion("credit_exposure is null");
            return (Criteria) this;
        }

        public Criteria andCreditExposureIsNotNull() {
            addCriterion("credit_exposure is not null");
            return (Criteria) this;
        }

        public Criteria andCreditExposureEqualTo(BigDecimal value) {
            addCriterion("credit_exposure =", value, "creditExposure");
            return (Criteria) this;
        }

        public Criteria andCreditExposureNotEqualTo(BigDecimal value) {
            addCriterion("credit_exposure <>", value, "creditExposure");
            return (Criteria) this;
        }

        public Criteria andCreditExposureGreaterThan(BigDecimal value) {
            addCriterion("credit_exposure >", value, "creditExposure");
            return (Criteria) this;
        }

        public Criteria andCreditExposureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_exposure >=", value, "creditExposure");
            return (Criteria) this;
        }

        public Criteria andCreditExposureLessThan(BigDecimal value) {
            addCriterion("credit_exposure <", value, "creditExposure");
            return (Criteria) this;
        }

        public Criteria andCreditExposureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_exposure <=", value, "creditExposure");
            return (Criteria) this;
        }

        public Criteria andCreditExposureIn(List<BigDecimal> values) {
            addCriterion("credit_exposure in", values, "creditExposure");
            return (Criteria) this;
        }

        public Criteria andCreditExposureNotIn(List<BigDecimal> values) {
            addCriterion("credit_exposure not in", values, "creditExposure");
            return (Criteria) this;
        }

        public Criteria andCreditExposureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_exposure between", value1, value2, "creditExposure");
            return (Criteria) this;
        }

        public Criteria andCreditExposureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_exposure not between", value1, value2, "creditExposure");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNull() {
            addCriterion("credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNotNull() {
            addCriterion("credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountEqualTo(BigDecimal value) {
            addCriterion("credit_amount =", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotEqualTo(BigDecimal value) {
            addCriterion("credit_amount <>", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThan(BigDecimal value) {
            addCriterion("credit_amount >", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_amount >=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThan(BigDecimal value) {
            addCriterion("credit_amount <", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_amount <=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIn(List<BigDecimal> values) {
            addCriterion("credit_amount in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotIn(List<BigDecimal> values) {
            addCriterion("credit_amount not in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_amount between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_amount not between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceIsNull() {
            addCriterion("opening_balance is null");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceIsNotNull() {
            addCriterion("opening_balance is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceEqualTo(BigDecimal value) {
            addCriterion("opening_balance =", value, "openingBalance");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceNotEqualTo(BigDecimal value) {
            addCriterion("opening_balance <>", value, "openingBalance");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceGreaterThan(BigDecimal value) {
            addCriterion("opening_balance >", value, "openingBalance");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("opening_balance >=", value, "openingBalance");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceLessThan(BigDecimal value) {
            addCriterion("opening_balance <", value, "openingBalance");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("opening_balance <=", value, "openingBalance");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceIn(List<BigDecimal> values) {
            addCriterion("opening_balance in", values, "openingBalance");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceNotIn(List<BigDecimal> values) {
            addCriterion("opening_balance not in", values, "openingBalance");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opening_balance between", value1, value2, "openingBalance");
            return (Criteria) this;
        }

        public Criteria andOpeningBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("opening_balance not between", value1, value2, "openingBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentUseIsNull() {
            addCriterion("current_use is null");
            return (Criteria) this;
        }

        public Criteria andCurrentUseIsNotNull() {
            addCriterion("current_use is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentUseEqualTo(BigDecimal value) {
            addCriterion("current_use =", value, "currentUse");
            return (Criteria) this;
        }

        public Criteria andCurrentUseNotEqualTo(BigDecimal value) {
            addCriterion("current_use <>", value, "currentUse");
            return (Criteria) this;
        }

        public Criteria andCurrentUseGreaterThan(BigDecimal value) {
            addCriterion("current_use >", value, "currentUse");
            return (Criteria) this;
        }

        public Criteria andCurrentUseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_use >=", value, "currentUse");
            return (Criteria) this;
        }

        public Criteria andCurrentUseLessThan(BigDecimal value) {
            addCriterion("current_use <", value, "currentUse");
            return (Criteria) this;
        }

        public Criteria andCurrentUseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_use <=", value, "currentUse");
            return (Criteria) this;
        }

        public Criteria andCurrentUseIn(List<BigDecimal> values) {
            addCriterion("current_use in", values, "currentUse");
            return (Criteria) this;
        }

        public Criteria andCurrentUseNotIn(List<BigDecimal> values) {
            addCriterion("current_use not in", values, "currentUse");
            return (Criteria) this;
        }

        public Criteria andCurrentUseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_use between", value1, value2, "currentUse");
            return (Criteria) this;
        }

        public Criteria andCurrentUseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_use not between", value1, value2, "currentUse");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayIsNull() {
            addCriterion("current_repay is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayIsNotNull() {
            addCriterion("current_repay is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayEqualTo(BigDecimal value) {
            addCriterion("current_repay =", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayNotEqualTo(BigDecimal value) {
            addCriterion("current_repay <>", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayGreaterThan(BigDecimal value) {
            addCriterion("current_repay >", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_repay >=", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayLessThan(BigDecimal value) {
            addCriterion("current_repay <", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_repay <=", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayIn(List<BigDecimal> values) {
            addCriterion("current_repay in", values, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayNotIn(List<BigDecimal> values) {
            addCriterion("current_repay not in", values, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_repay between", value1, value2, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_repay not between", value1, value2, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceIsNull() {
            addCriterion("ending_balance is null");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceIsNotNull() {
            addCriterion("ending_balance is not null");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceEqualTo(BigDecimal value) {
            addCriterion("ending_balance =", value, "endingBalance");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceNotEqualTo(BigDecimal value) {
            addCriterion("ending_balance <>", value, "endingBalance");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceGreaterThan(BigDecimal value) {
            addCriterion("ending_balance >", value, "endingBalance");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ending_balance >=", value, "endingBalance");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceLessThan(BigDecimal value) {
            addCriterion("ending_balance <", value, "endingBalance");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ending_balance <=", value, "endingBalance");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceIn(List<BigDecimal> values) {
            addCriterion("ending_balance in", values, "endingBalance");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceNotIn(List<BigDecimal> values) {
            addCriterion("ending_balance not in", values, "endingBalance");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ending_balance between", value1, value2, "endingBalance");
            return (Criteria) this;
        }

        public Criteria andEndingBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ending_balance not between", value1, value2, "endingBalance");
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

        public Criteria andCostCodeIsNull() {
            addCriterion("cost_code is null");
            return (Criteria) this;
        }

        public Criteria andCostCodeIsNotNull() {
            addCriterion("cost_code is not null");
            return (Criteria) this;
        }

        public Criteria andCostCodeEqualTo(Integer value) {
            addCriterion("cost_code =", value, "costCode");
            return (Criteria) this;
        }

        public Criteria andCostCodeNotEqualTo(Integer value) {
            addCriterion("cost_code <>", value, "costCode");
            return (Criteria) this;
        }

        public Criteria andCostCodeGreaterThan(Integer value) {
            addCriterion("cost_code >", value, "costCode");
            return (Criteria) this;
        }

        public Criteria andCostCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_code >=", value, "costCode");
            return (Criteria) this;
        }

        public Criteria andCostCodeLessThan(Integer value) {
            addCriterion("cost_code <", value, "costCode");
            return (Criteria) this;
        }

        public Criteria andCostCodeLessThanOrEqualTo(Integer value) {
            addCriterion("cost_code <=", value, "costCode");
            return (Criteria) this;
        }

        public Criteria andCostCodeIn(List<Integer> values) {
            addCriterion("cost_code in", values, "costCode");
            return (Criteria) this;
        }

        public Criteria andCostCodeNotIn(List<Integer> values) {
            addCriterion("cost_code not in", values, "costCode");
            return (Criteria) this;
        }

        public Criteria andCostCodeBetween(Integer value1, Integer value2) {
            addCriterion("cost_code between", value1, value2, "costCode");
            return (Criteria) this;
        }

        public Criteria andCostCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_code not between", value1, value2, "costCode");
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