package com.assets.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysResourceExample() {
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

        public Criteria andResourceIdIsNull() {
            addCriterion("RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Long value) {
            addCriterion("RESOURCE_ID =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Long value) {
            addCriterion("RESOURCE_ID <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Long value) {
            addCriterion("RESOURCE_ID >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RESOURCE_ID >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Long value) {
            addCriterion("RESOURCE_ID <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Long value) {
            addCriterion("RESOURCE_ID <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Long> values) {
            addCriterion("RESOURCE_ID in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Long> values) {
            addCriterion("RESOURCE_ID not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Long value1, Long value2) {
            addCriterion("RESOURCE_ID between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Long value1, Long value2) {
            addCriterion("RESOURCE_ID not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("RESOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("RESOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("RESOURCE_TYPE =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("RESOURCE_TYPE >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("RESOURCE_TYPE <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("RESOURCE_TYPE like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("RESOURCE_TYPE not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("RESOURCE_TYPE in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("RESOURCE_TYPE not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("VALUE is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("VALUE =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("VALUE <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("VALUE >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("VALUE <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("VALUE <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("VALUE like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("VALUE not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("VALUE in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("VALUE not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("VALUE between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("VALUE not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Short value) {
            addCriterion("ORDER_NUM =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Short value) {
            addCriterion("ORDER_NUM <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Short value) {
            addCriterion("ORDER_NUM >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_NUM >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Short value) {
            addCriterion("ORDER_NUM <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_NUM <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Short> values) {
            addCriterion("ORDER_NUM in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Short> values) {
            addCriterion("ORDER_NUM not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Short value1, Short value2) {
            addCriterion("ORDER_NUM between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_NUM not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("TARGET is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("TARGET =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("TARGET <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("TARGET >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("TARGET <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("TARGET <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("TARGET like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("TARGET not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("TARGET in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("TARGET not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("TARGET between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("TARGET not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andZhCnNameIsNull() {
            addCriterion("ZH_CN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andZhCnNameIsNotNull() {
            addCriterion("ZH_CN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andZhCnNameEqualTo(String value) {
            addCriterion("ZH_CN_NAME =", value, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameNotEqualTo(String value) {
            addCriterion("ZH_CN_NAME <>", value, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameGreaterThan(String value) {
            addCriterion("ZH_CN_NAME >", value, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("ZH_CN_NAME >=", value, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameLessThan(String value) {
            addCriterion("ZH_CN_NAME <", value, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameLessThanOrEqualTo(String value) {
            addCriterion("ZH_CN_NAME <=", value, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameLike(String value) {
            addCriterion("ZH_CN_NAME like", value, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameNotLike(String value) {
            addCriterion("ZH_CN_NAME not like", value, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameIn(List<String> values) {
            addCriterion("ZH_CN_NAME in", values, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameNotIn(List<String> values) {
            addCriterion("ZH_CN_NAME not in", values, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameBetween(String value1, String value2) {
            addCriterion("ZH_CN_NAME between", value1, value2, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andZhCnNameNotBetween(String value1, String value2) {
            addCriterion("ZH_CN_NAME not between", value1, value2, "zhCnName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLavelsIsNull() {
            addCriterion("LAVELS is null");
            return (Criteria) this;
        }

        public Criteria andLavelsIsNotNull() {
            addCriterion("LAVELS is not null");
            return (Criteria) this;
        }

        public Criteria andLavelsEqualTo(Short value) {
            addCriterion("LAVELS =", value, "lavels");
            return (Criteria) this;
        }

        public Criteria andLavelsNotEqualTo(Short value) {
            addCriterion("LAVELS <>", value, "lavels");
            return (Criteria) this;
        }

        public Criteria andLavelsGreaterThan(Short value) {
            addCriterion("LAVELS >", value, "lavels");
            return (Criteria) this;
        }

        public Criteria andLavelsGreaterThanOrEqualTo(Short value) {
            addCriterion("LAVELS >=", value, "lavels");
            return (Criteria) this;
        }

        public Criteria andLavelsLessThan(Short value) {
            addCriterion("LAVELS <", value, "lavels");
            return (Criteria) this;
        }

        public Criteria andLavelsLessThanOrEqualTo(Short value) {
            addCriterion("LAVELS <=", value, "lavels");
            return (Criteria) this;
        }

        public Criteria andLavelsIn(List<Short> values) {
            addCriterion("LAVELS in", values, "lavels");
            return (Criteria) this;
        }

        public Criteria andLavelsNotIn(List<Short> values) {
            addCriterion("LAVELS not in", values, "lavels");
            return (Criteria) this;
        }

        public Criteria andLavelsBetween(Short value1, Short value2) {
            addCriterion("LAVELS between", value1, value2, "lavels");
            return (Criteria) this;
        }

        public Criteria andLavelsNotBetween(Short value1, Short value2) {
            addCriterion("LAVELS not between", value1, value2, "lavels");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("IMG_URL =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("IMG_URL <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("IMG_URL >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_URL >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("IMG_URL <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("IMG_URL <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("IMG_URL like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("IMG_URL not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("IMG_URL in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("IMG_URL not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("IMG_URL between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("IMG_URL not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andTotalSqlIsNull() {
            addCriterion("TOTAL_SQL is null");
            return (Criteria) this;
        }

        public Criteria andTotalSqlIsNotNull() {
            addCriterion("TOTAL_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSqlEqualTo(String value) {
            addCriterion("TOTAL_SQL =", value, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlNotEqualTo(String value) {
            addCriterion("TOTAL_SQL <>", value, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlGreaterThan(String value) {
            addCriterion("TOTAL_SQL >", value, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_SQL >=", value, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlLessThan(String value) {
            addCriterion("TOTAL_SQL <", value, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_SQL <=", value, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlLike(String value) {
            addCriterion("TOTAL_SQL like", value, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlNotLike(String value) {
            addCriterion("TOTAL_SQL not like", value, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlIn(List<String> values) {
            addCriterion("TOTAL_SQL in", values, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlNotIn(List<String> values) {
            addCriterion("TOTAL_SQL not in", values, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlBetween(String value1, String value2) {
            addCriterion("TOTAL_SQL between", value1, value2, "totalSql");
            return (Criteria) this;
        }

        public Criteria andTotalSqlNotBetween(String value1, String value2) {
            addCriterion("TOTAL_SQL not between", value1, value2, "totalSql");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlIsNull() {
            addCriterion("NAV_IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlIsNotNull() {
            addCriterion("NAV_IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlEqualTo(String value) {
            addCriterion("NAV_IMG_URL =", value, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlNotEqualTo(String value) {
            addCriterion("NAV_IMG_URL <>", value, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlGreaterThan(String value) {
            addCriterion("NAV_IMG_URL >", value, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("NAV_IMG_URL >=", value, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlLessThan(String value) {
            addCriterion("NAV_IMG_URL <", value, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlLessThanOrEqualTo(String value) {
            addCriterion("NAV_IMG_URL <=", value, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlLike(String value) {
            addCriterion("NAV_IMG_URL like", value, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlNotLike(String value) {
            addCriterion("NAV_IMG_URL not like", value, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlIn(List<String> values) {
            addCriterion("NAV_IMG_URL in", values, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlNotIn(List<String> values) {
            addCriterion("NAV_IMG_URL not in", values, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlBetween(String value1, String value2) {
            addCriterion("NAV_IMG_URL between", value1, value2, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavImgUrlNotBetween(String value1, String value2) {
            addCriterion("NAV_IMG_URL not between", value1, value2, "navImgUrl");
            return (Criteria) this;
        }

        public Criteria andNavEnabledIsNull() {
            addCriterion("NAV_ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andNavEnabledIsNotNull() {
            addCriterion("NAV_ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andNavEnabledEqualTo(Short value) {
            addCriterion("NAV_ENABLED =", value, "navEnabled");
            return (Criteria) this;
        }

        public Criteria andNavEnabledNotEqualTo(Short value) {
            addCriterion("NAV_ENABLED <>", value, "navEnabled");
            return (Criteria) this;
        }

        public Criteria andNavEnabledGreaterThan(Short value) {
            addCriterion("NAV_ENABLED >", value, "navEnabled");
            return (Criteria) this;
        }

        public Criteria andNavEnabledGreaterThanOrEqualTo(Short value) {
            addCriterion("NAV_ENABLED >=", value, "navEnabled");
            return (Criteria) this;
        }

        public Criteria andNavEnabledLessThan(Short value) {
            addCriterion("NAV_ENABLED <", value, "navEnabled");
            return (Criteria) this;
        }

        public Criteria andNavEnabledLessThanOrEqualTo(Short value) {
            addCriterion("NAV_ENABLED <=", value, "navEnabled");
            return (Criteria) this;
        }

        public Criteria andNavEnabledIn(List<Short> values) {
            addCriterion("NAV_ENABLED in", values, "navEnabled");
            return (Criteria) this;
        }

        public Criteria andNavEnabledNotIn(List<Short> values) {
            addCriterion("NAV_ENABLED not in", values, "navEnabled");
            return (Criteria) this;
        }

        public Criteria andNavEnabledBetween(Short value1, Short value2) {
            addCriterion("NAV_ENABLED between", value1, value2, "navEnabled");
            return (Criteria) this;
        }

        public Criteria andNavEnabledNotBetween(Short value1, Short value2) {
            addCriterion("NAV_ENABLED not between", value1, value2, "navEnabled");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlIsNull() {
            addCriterion("OLD_TOTAL_SQL is null");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlIsNotNull() {
            addCriterion("OLD_TOTAL_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlEqualTo(String value) {
            addCriterion("OLD_TOTAL_SQL =", value, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlNotEqualTo(String value) {
            addCriterion("OLD_TOTAL_SQL <>", value, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlGreaterThan(String value) {
            addCriterion("OLD_TOTAL_SQL >", value, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_TOTAL_SQL >=", value, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlLessThan(String value) {
            addCriterion("OLD_TOTAL_SQL <", value, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlLessThanOrEqualTo(String value) {
            addCriterion("OLD_TOTAL_SQL <=", value, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlLike(String value) {
            addCriterion("OLD_TOTAL_SQL like", value, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlNotLike(String value) {
            addCriterion("OLD_TOTAL_SQL not like", value, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlIn(List<String> values) {
            addCriterion("OLD_TOTAL_SQL in", values, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlNotIn(List<String> values) {
            addCriterion("OLD_TOTAL_SQL not in", values, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlBetween(String value1, String value2) {
            addCriterion("OLD_TOTAL_SQL between", value1, value2, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andOldTotalSqlNotBetween(String value1, String value2) {
            addCriterion("OLD_TOTAL_SQL not between", value1, value2, "oldTotalSql");
            return (Criteria) this;
        }

        public Criteria andZhTwNameIsNull() {
            addCriterion("ZH_TW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andZhTwNameIsNotNull() {
            addCriterion("ZH_TW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andZhTwNameEqualTo(String value) {
            addCriterion("ZH_TW_NAME =", value, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameNotEqualTo(String value) {
            addCriterion("ZH_TW_NAME <>", value, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameGreaterThan(String value) {
            addCriterion("ZH_TW_NAME >", value, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameGreaterThanOrEqualTo(String value) {
            addCriterion("ZH_TW_NAME >=", value, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameLessThan(String value) {
            addCriterion("ZH_TW_NAME <", value, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameLessThanOrEqualTo(String value) {
            addCriterion("ZH_TW_NAME <=", value, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameLike(String value) {
            addCriterion("ZH_TW_NAME like", value, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameNotLike(String value) {
            addCriterion("ZH_TW_NAME not like", value, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameIn(List<String> values) {
            addCriterion("ZH_TW_NAME in", values, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameNotIn(List<String> values) {
            addCriterion("ZH_TW_NAME not in", values, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameBetween(String value1, String value2) {
            addCriterion("ZH_TW_NAME between", value1, value2, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andZhTwNameNotBetween(String value1, String value2) {
            addCriterion("ZH_TW_NAME not between", value1, value2, "zhTwName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameIsNull() {
            addCriterion("EN_US_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnUsNameIsNotNull() {
            addCriterion("EN_US_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnUsNameEqualTo(String value) {
            addCriterion("EN_US_NAME =", value, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameNotEqualTo(String value) {
            addCriterion("EN_US_NAME <>", value, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameGreaterThan(String value) {
            addCriterion("EN_US_NAME >", value, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameGreaterThanOrEqualTo(String value) {
            addCriterion("EN_US_NAME >=", value, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameLessThan(String value) {
            addCriterion("EN_US_NAME <", value, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameLessThanOrEqualTo(String value) {
            addCriterion("EN_US_NAME <=", value, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameLike(String value) {
            addCriterion("EN_US_NAME like", value, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameNotLike(String value) {
            addCriterion("EN_US_NAME not like", value, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameIn(List<String> values) {
            addCriterion("EN_US_NAME in", values, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameNotIn(List<String> values) {
            addCriterion("EN_US_NAME not in", values, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameBetween(String value1, String value2) {
            addCriterion("EN_US_NAME between", value1, value2, "enUsName");
            return (Criteria) this;
        }

        public Criteria andEnUsNameNotBetween(String value1, String value2) {
            addCriterion("EN_US_NAME not between", value1, value2, "enUsName");
            return (Criteria) this;
        }

        public Criteria andFlagLanIsNull() {
            addCriterion("FLAG_LAN is null");
            return (Criteria) this;
        }

        public Criteria andFlagLanIsNotNull() {
            addCriterion("FLAG_LAN is not null");
            return (Criteria) this;
        }

        public Criteria andFlagLanEqualTo(String value) {
            addCriterion("FLAG_LAN =", value, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanNotEqualTo(String value) {
            addCriterion("FLAG_LAN <>", value, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanGreaterThan(String value) {
            addCriterion("FLAG_LAN >", value, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG_LAN >=", value, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanLessThan(String value) {
            addCriterion("FLAG_LAN <", value, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanLessThanOrEqualTo(String value) {
            addCriterion("FLAG_LAN <=", value, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanLike(String value) {
            addCriterion("FLAG_LAN like", value, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanNotLike(String value) {
            addCriterion("FLAG_LAN not like", value, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanIn(List<String> values) {
            addCriterion("FLAG_LAN in", values, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanNotIn(List<String> values) {
            addCriterion("FLAG_LAN not in", values, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanBetween(String value1, String value2) {
            addCriterion("FLAG_LAN between", value1, value2, "flagLan");
            return (Criteria) this;
        }

        public Criteria andFlagLanNotBetween(String value1, String value2) {
            addCriterion("FLAG_LAN not between", value1, value2, "flagLan");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdIsNull() {
            addCriterion("STMS_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdIsNotNull() {
            addCriterion("STMS_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdEqualTo(BigDecimal value) {
            addCriterion("STMS_MENU_ID =", value, "stmsMenuId");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdNotEqualTo(BigDecimal value) {
            addCriterion("STMS_MENU_ID <>", value, "stmsMenuId");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdGreaterThan(BigDecimal value) {
            addCriterion("STMS_MENU_ID >", value, "stmsMenuId");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STMS_MENU_ID >=", value, "stmsMenuId");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdLessThan(BigDecimal value) {
            addCriterion("STMS_MENU_ID <", value, "stmsMenuId");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STMS_MENU_ID <=", value, "stmsMenuId");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdIn(List<BigDecimal> values) {
            addCriterion("STMS_MENU_ID in", values, "stmsMenuId");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdNotIn(List<BigDecimal> values) {
            addCriterion("STMS_MENU_ID not in", values, "stmsMenuId");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMS_MENU_ID between", value1, value2, "stmsMenuId");
            return (Criteria) this;
        }

        public Criteria andStmsMenuIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMS_MENU_ID not between", value1, value2, "stmsMenuId");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("CLASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("CLASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("CLASS_NAME =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("CLASS_NAME <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("CLASS_NAME >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("CLASS_NAME <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("CLASS_NAME like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("CLASS_NAME not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("CLASS_NAME in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("CLASS_NAME not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("CLASS_NAME between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("CLASS_NAME not between", value1, value2, "className");
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