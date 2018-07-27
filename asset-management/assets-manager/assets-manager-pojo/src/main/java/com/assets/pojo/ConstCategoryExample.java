package com.assets.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConstCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConstCategoryExample() {
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

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCdescriptionIsNull() {
            addCriterion("cdescription is null");
            return (Criteria) this;
        }

        public Criteria andCdescriptionIsNotNull() {
            addCriterion("cdescription is not null");
            return (Criteria) this;
        }

        public Criteria andCdescriptionEqualTo(String value) {
            addCriterion("cdescription =", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionNotEqualTo(String value) {
            addCriterion("cdescription <>", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionGreaterThan(String value) {
            addCriterion("cdescription >", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("cdescription >=", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionLessThan(String value) {
            addCriterion("cdescription <", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionLessThanOrEqualTo(String value) {
            addCriterion("cdescription <=", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionLike(String value) {
            addCriterion("cdescription like", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionNotLike(String value) {
            addCriterion("cdescription not like", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionIn(List<String> values) {
            addCriterion("cdescription in", values, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionNotIn(List<String> values) {
            addCriterion("cdescription not in", values, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionBetween(String value1, String value2) {
            addCriterion("cdescription between", value1, value2, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionNotBetween(String value1, String value2) {
            addCriterion("cdescription not between", value1, value2, "cdescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionIsNull() {
            addCriterion("edescription is null");
            return (Criteria) this;
        }

        public Criteria andEdescriptionIsNotNull() {
            addCriterion("edescription is not null");
            return (Criteria) this;
        }

        public Criteria andEdescriptionEqualTo(String value) {
            addCriterion("edescription =", value, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionNotEqualTo(String value) {
            addCriterion("edescription <>", value, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionGreaterThan(String value) {
            addCriterion("edescription >", value, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("edescription >=", value, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionLessThan(String value) {
            addCriterion("edescription <", value, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionLessThanOrEqualTo(String value) {
            addCriterion("edescription <=", value, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionLike(String value) {
            addCriterion("edescription like", value, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionNotLike(String value) {
            addCriterion("edescription not like", value, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionIn(List<String> values) {
            addCriterion("edescription in", values, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionNotIn(List<String> values) {
            addCriterion("edescription not in", values, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionBetween(String value1, String value2) {
            addCriterion("edescription between", value1, value2, "edescription");
            return (Criteria) this;
        }

        public Criteria andEdescriptionNotBetween(String value1, String value2) {
            addCriterion("edescription not between", value1, value2, "edescription");
            return (Criteria) this;
        }

        public Criteria andQuerySqlIsNull() {
            addCriterion("query_sql is null");
            return (Criteria) this;
        }

        public Criteria andQuerySqlIsNotNull() {
            addCriterion("query_sql is not null");
            return (Criteria) this;
        }

        public Criteria andQuerySqlEqualTo(String value) {
            addCriterion("query_sql =", value, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlNotEqualTo(String value) {
            addCriterion("query_sql <>", value, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlGreaterThan(String value) {
            addCriterion("query_sql >", value, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlGreaterThanOrEqualTo(String value) {
            addCriterion("query_sql >=", value, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlLessThan(String value) {
            addCriterion("query_sql <", value, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlLessThanOrEqualTo(String value) {
            addCriterion("query_sql <=", value, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlLike(String value) {
            addCriterion("query_sql like", value, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlNotLike(String value) {
            addCriterion("query_sql not like", value, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlIn(List<String> values) {
            addCriterion("query_sql in", values, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlNotIn(List<String> values) {
            addCriterion("query_sql not in", values, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlBetween(String value1, String value2) {
            addCriterion("query_sql between", value1, value2, "querySql");
            return (Criteria) this;
        }

        public Criteria andQuerySqlNotBetween(String value1, String value2) {
            addCriterion("query_sql not between", value1, value2, "querySql");
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