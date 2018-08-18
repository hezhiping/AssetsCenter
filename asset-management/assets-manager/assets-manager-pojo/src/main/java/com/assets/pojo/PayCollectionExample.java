package com.assets.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PayCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayCollectionExample() {
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

        public Criteria andReceiptItemIsNull() {
            addCriterion("receipt_item is null");
            return (Criteria) this;
        }

        public Criteria andReceiptItemIsNotNull() {
            addCriterion("receipt_item is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptItemEqualTo(String value) {
            addCriterion("receipt_item =", value, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemNotEqualTo(String value) {
            addCriterion("receipt_item <>", value, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemGreaterThan(String value) {
            addCriterion("receipt_item >", value, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_item >=", value, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemLessThan(String value) {
            addCriterion("receipt_item <", value, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemLessThanOrEqualTo(String value) {
            addCriterion("receipt_item <=", value, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemLike(String value) {
            addCriterion("receipt_item like", value, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemNotLike(String value) {
            addCriterion("receipt_item not like", value, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemIn(List<String> values) {
            addCriterion("receipt_item in", values, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemNotIn(List<String> values) {
            addCriterion("receipt_item not in", values, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemBetween(String value1, String value2) {
            addCriterion("receipt_item between", value1, value2, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptItemNotBetween(String value1, String value2) {
            addCriterion("receipt_item not between", value1, value2, "receiptItem");
            return (Criteria) this;
        }

        public Criteria andReceiptDateIsNull() {
            addCriterion("receipt_date is null");
            return (Criteria) this;
        }

        public Criteria andReceiptDateIsNotNull() {
            addCriterion("receipt_date is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptDateEqualTo(Date value) {
            addCriterionForJDBCDate("receipt_date =", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("receipt_date <>", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateGreaterThan(Date value) {
            addCriterionForJDBCDate("receipt_date >", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("receipt_date >=", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateLessThan(Date value) {
            addCriterionForJDBCDate("receipt_date <", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("receipt_date <=", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateIn(List<Date> values) {
            addCriterionForJDBCDate("receipt_date in", values, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("receipt_date not in", values, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("receipt_date between", value1, value2, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("receipt_date not between", value1, value2, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andPersonIsNull() {
            addCriterion("person is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsNotNull() {
            addCriterion("person is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEqualTo(String value) {
            addCriterion("person =", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotEqualTo(String value) {
            addCriterion("person <>", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThan(String value) {
            addCriterion("person >", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThanOrEqualTo(String value) {
            addCriterion("person >=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThan(String value) {
            addCriterion("person <", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThanOrEqualTo(String value) {
            addCriterion("person <=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLike(String value) {
            addCriterion("person like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotLike(String value) {
            addCriterion("person not like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonIn(List<String> values) {
            addCriterion("person in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotIn(List<String> values) {
            addCriterion("person not in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonBetween(String value1, String value2) {
            addCriterion("person between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotBetween(String value1, String value2) {
            addCriterion("person not between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andReceiptPayIsNull() {
            addCriterion("receipt_pay is null");
            return (Criteria) this;
        }

        public Criteria andReceiptPayIsNotNull() {
            addCriterion("receipt_pay is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptPayEqualTo(BigDecimal value) {
            addCriterion("receipt_pay =", value, "receiptPay");
            return (Criteria) this;
        }

        public Criteria andReceiptPayNotEqualTo(BigDecimal value) {
            addCriterion("receipt_pay <>", value, "receiptPay");
            return (Criteria) this;
        }

        public Criteria andReceiptPayGreaterThan(BigDecimal value) {
            addCriterion("receipt_pay >", value, "receiptPay");
            return (Criteria) this;
        }

        public Criteria andReceiptPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receipt_pay >=", value, "receiptPay");
            return (Criteria) this;
        }

        public Criteria andReceiptPayLessThan(BigDecimal value) {
            addCriterion("receipt_pay <", value, "receiptPay");
            return (Criteria) this;
        }

        public Criteria andReceiptPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receipt_pay <=", value, "receiptPay");
            return (Criteria) this;
        }

        public Criteria andReceiptPayIn(List<BigDecimal> values) {
            addCriterion("receipt_pay in", values, "receiptPay");
            return (Criteria) this;
        }

        public Criteria andReceiptPayNotIn(List<BigDecimal> values) {
            addCriterion("receipt_pay not in", values, "receiptPay");
            return (Criteria) this;
        }

        public Criteria andReceiptPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipt_pay between", value1, value2, "receiptPay");
            return (Criteria) this;
        }

        public Criteria andReceiptPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipt_pay not between", value1, value2, "receiptPay");
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