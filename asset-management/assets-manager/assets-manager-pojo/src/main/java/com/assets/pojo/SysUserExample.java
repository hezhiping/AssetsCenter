package com.assets.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Integer value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Integer value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Integer value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Integer value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Integer value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Integer> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Integer> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Integer value1, Integer value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Integer value1, Integer value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andTokenChangedIsNull() {
            addCriterion("TOKEN_CHANGED is null");
            return (Criteria) this;
        }

        public Criteria andTokenChangedIsNotNull() {
            addCriterion("TOKEN_CHANGED is not null");
            return (Criteria) this;
        }

        public Criteria andTokenChangedEqualTo(Integer value) {
            addCriterion("TOKEN_CHANGED =", value, "tokenChanged");
            return (Criteria) this;
        }

        public Criteria andTokenChangedNotEqualTo(Integer value) {
            addCriterion("TOKEN_CHANGED <>", value, "tokenChanged");
            return (Criteria) this;
        }

        public Criteria andTokenChangedGreaterThan(Integer value) {
            addCriterion("TOKEN_CHANGED >", value, "tokenChanged");
            return (Criteria) this;
        }

        public Criteria andTokenChangedGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOKEN_CHANGED >=", value, "tokenChanged");
            return (Criteria) this;
        }

        public Criteria andTokenChangedLessThan(Integer value) {
            addCriterion("TOKEN_CHANGED <", value, "tokenChanged");
            return (Criteria) this;
        }

        public Criteria andTokenChangedLessThanOrEqualTo(Integer value) {
            addCriterion("TOKEN_CHANGED <=", value, "tokenChanged");
            return (Criteria) this;
        }

        public Criteria andTokenChangedIn(List<Integer> values) {
            addCriterion("TOKEN_CHANGED in", values, "tokenChanged");
            return (Criteria) this;
        }

        public Criteria andTokenChangedNotIn(List<Integer> values) {
            addCriterion("TOKEN_CHANGED not in", values, "tokenChanged");
            return (Criteria) this;
        }

        public Criteria andTokenChangedBetween(Integer value1, Integer value2) {
            addCriterion("TOKEN_CHANGED between", value1, value2, "tokenChanged");
            return (Criteria) this;
        }

        public Criteria andTokenChangedNotBetween(Integer value1, Integer value2) {
            addCriterion("TOKEN_CHANGED not between", value1, value2, "tokenChanged");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(Integer value) {
            addCriterion("NODE_ID =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(Integer value) {
            addCriterion("NODE_ID <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(Integer value) {
            addCriterion("NODE_ID >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NODE_ID >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(Integer value) {
            addCriterion("NODE_ID <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("NODE_ID <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<Integer> values) {
            addCriterion("NODE_ID in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<Integer> values) {
            addCriterion("NODE_ID not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(Integer value1, Integer value2) {
            addCriterion("NODE_ID between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NODE_ID not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(BigDecimal value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(BigDecimal value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(BigDecimal value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(BigDecimal value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<BigDecimal> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<BigDecimal> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andUkeysnIsNull() {
            addCriterion("UKEYSN is null");
            return (Criteria) this;
        }

        public Criteria andUkeysnIsNotNull() {
            addCriterion("UKEYSN is not null");
            return (Criteria) this;
        }

        public Criteria andUkeysnEqualTo(String value) {
            addCriterion("UKEYSN =", value, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnNotEqualTo(String value) {
            addCriterion("UKEYSN <>", value, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnGreaterThan(String value) {
            addCriterion("UKEYSN >", value, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnGreaterThanOrEqualTo(String value) {
            addCriterion("UKEYSN >=", value, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnLessThan(String value) {
            addCriterion("UKEYSN <", value, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnLessThanOrEqualTo(String value) {
            addCriterion("UKEYSN <=", value, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnLike(String value) {
            addCriterion("UKEYSN like", value, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnNotLike(String value) {
            addCriterion("UKEYSN not like", value, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnIn(List<String> values) {
            addCriterion("UKEYSN in", values, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnNotIn(List<String> values) {
            addCriterion("UKEYSN not in", values, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnBetween(String value1, String value2) {
            addCriterion("UKEYSN between", value1, value2, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeysnNotBetween(String value1, String value2) {
            addCriterion("UKEYSN not between", value1, value2, "ukeysn");
            return (Criteria) this;
        }

        public Criteria andUkeypwdIsNull() {
            addCriterion("UKEYPWD is null");
            return (Criteria) this;
        }

        public Criteria andUkeypwdIsNotNull() {
            addCriterion("UKEYPWD is not null");
            return (Criteria) this;
        }

        public Criteria andUkeypwdEqualTo(String value) {
            addCriterion("UKEYPWD =", value, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdNotEqualTo(String value) {
            addCriterion("UKEYPWD <>", value, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdGreaterThan(String value) {
            addCriterion("UKEYPWD >", value, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdGreaterThanOrEqualTo(String value) {
            addCriterion("UKEYPWD >=", value, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdLessThan(String value) {
            addCriterion("UKEYPWD <", value, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdLessThanOrEqualTo(String value) {
            addCriterion("UKEYPWD <=", value, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdLike(String value) {
            addCriterion("UKEYPWD like", value, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdNotLike(String value) {
            addCriterion("UKEYPWD not like", value, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdIn(List<String> values) {
            addCriterion("UKEYPWD in", values, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdNotIn(List<String> values) {
            addCriterion("UKEYPWD not in", values, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdBetween(String value1, String value2) {
            addCriterion("UKEYPWD between", value1, value2, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andUkeypwdNotBetween(String value1, String value2) {
            addCriterion("UKEYPWD not between", value1, value2, "ukeypwd");
            return (Criteria) this;
        }

        public Criteria andIsukeyIsNull() {
            addCriterion("ISUKEY is null");
            return (Criteria) this;
        }

        public Criteria andIsukeyIsNotNull() {
            addCriterion("ISUKEY is not null");
            return (Criteria) this;
        }

        public Criteria andIsukeyEqualTo(String value) {
            addCriterion("ISUKEY =", value, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyNotEqualTo(String value) {
            addCriterion("ISUKEY <>", value, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyGreaterThan(String value) {
            addCriterion("ISUKEY >", value, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyGreaterThanOrEqualTo(String value) {
            addCriterion("ISUKEY >=", value, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyLessThan(String value) {
            addCriterion("ISUKEY <", value, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyLessThanOrEqualTo(String value) {
            addCriterion("ISUKEY <=", value, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyLike(String value) {
            addCriterion("ISUKEY like", value, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyNotLike(String value) {
            addCriterion("ISUKEY not like", value, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyIn(List<String> values) {
            addCriterion("ISUKEY in", values, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyNotIn(List<String> values) {
            addCriterion("ISUKEY not in", values, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyBetween(String value1, String value2) {
            addCriterion("ISUKEY between", value1, value2, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsukeyNotBetween(String value1, String value2) {
            addCriterion("ISUKEY not between", value1, value2, "isukey");
            return (Criteria) this;
        }

        public Criteria andIsinternalIsNull() {
            addCriterion("ISINTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andIsinternalIsNotNull() {
            addCriterion("ISINTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsinternalEqualTo(String value) {
            addCriterion("ISINTERNAL =", value, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalNotEqualTo(String value) {
            addCriterion("ISINTERNAL <>", value, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalGreaterThan(String value) {
            addCriterion("ISINTERNAL >", value, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalGreaterThanOrEqualTo(String value) {
            addCriterion("ISINTERNAL >=", value, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalLessThan(String value) {
            addCriterion("ISINTERNAL <", value, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalLessThanOrEqualTo(String value) {
            addCriterion("ISINTERNAL <=", value, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalLike(String value) {
            addCriterion("ISINTERNAL like", value, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalNotLike(String value) {
            addCriterion("ISINTERNAL not like", value, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalIn(List<String> values) {
            addCriterion("ISINTERNAL in", values, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalNotIn(List<String> values) {
            addCriterion("ISINTERNAL not in", values, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalBetween(String value1, String value2) {
            addCriterion("ISINTERNAL between", value1, value2, "isinternal");
            return (Criteria) this;
        }

        public Criteria andIsinternalNotBetween(String value1, String value2) {
            addCriterion("ISINTERNAL not between", value1, value2, "isinternal");
            return (Criteria) this;
        }

        public Criteria andPlainPwdIsNull() {
            addCriterion("PLAIN_PWD is null");
            return (Criteria) this;
        }

        public Criteria andPlainPwdIsNotNull() {
            addCriterion("PLAIN_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andPlainPwdEqualTo(String value) {
            addCriterion("PLAIN_PWD =", value, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdNotEqualTo(String value) {
            addCriterion("PLAIN_PWD <>", value, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdGreaterThan(String value) {
            addCriterion("PLAIN_PWD >", value, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdGreaterThanOrEqualTo(String value) {
            addCriterion("PLAIN_PWD >=", value, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdLessThan(String value) {
            addCriterion("PLAIN_PWD <", value, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdLessThanOrEqualTo(String value) {
            addCriterion("PLAIN_PWD <=", value, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdLike(String value) {
            addCriterion("PLAIN_PWD like", value, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdNotLike(String value) {
            addCriterion("PLAIN_PWD not like", value, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdIn(List<String> values) {
            addCriterion("PLAIN_PWD in", values, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdNotIn(List<String> values) {
            addCriterion("PLAIN_PWD not in", values, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdBetween(String value1, String value2) {
            addCriterion("PLAIN_PWD between", value1, value2, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andPlainPwdNotBetween(String value1, String value2) {
            addCriterion("PLAIN_PWD not between", value1, value2, "plainPwd");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNull() {
            addCriterion("ADD_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNotNull() {
            addCriterion("ADD_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdEqualTo(Integer value) {
            addCriterion("ADD_USER_ID =", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotEqualTo(Integer value) {
            addCriterion("ADD_USER_ID <>", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThan(Integer value) {
            addCriterion("ADD_USER_ID >", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADD_USER_ID >=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThan(Integer value) {
            addCriterion("ADD_USER_ID <", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("ADD_USER_ID <=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIn(List<Integer> values) {
            addCriterion("ADD_USER_ID in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotIn(List<Integer> values) {
            addCriterion("ADD_USER_ID not in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdBetween(Integer value1, Integer value2) {
            addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpIsNull() {
            addCriterion("AUTH_LOGIN_IP is null");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpIsNotNull() {
            addCriterion("AUTH_LOGIN_IP is not null");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpEqualTo(String value) {
            addCriterion("AUTH_LOGIN_IP =", value, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpNotEqualTo(String value) {
            addCriterion("AUTH_LOGIN_IP <>", value, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpGreaterThan(String value) {
            addCriterion("AUTH_LOGIN_IP >", value, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_LOGIN_IP >=", value, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpLessThan(String value) {
            addCriterion("AUTH_LOGIN_IP <", value, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpLessThanOrEqualTo(String value) {
            addCriterion("AUTH_LOGIN_IP <=", value, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpLike(String value) {
            addCriterion("AUTH_LOGIN_IP like", value, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpNotLike(String value) {
            addCriterion("AUTH_LOGIN_IP not like", value, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpIn(List<String> values) {
            addCriterion("AUTH_LOGIN_IP in", values, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpNotIn(List<String> values) {
            addCriterion("AUTH_LOGIN_IP not in", values, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpBetween(String value1, String value2) {
            addCriterion("AUTH_LOGIN_IP between", value1, value2, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andAuthLoginIpNotBetween(String value1, String value2) {
            addCriterion("AUTH_LOGIN_IP not between", value1, value2, "authLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpIsNull() {
            addCriterion("LAST_ACCESS_IP is null");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpIsNotNull() {
            addCriterion("LAST_ACCESS_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpEqualTo(String value) {
            addCriterion("LAST_ACCESS_IP =", value, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpNotEqualTo(String value) {
            addCriterion("LAST_ACCESS_IP <>", value, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpGreaterThan(String value) {
            addCriterion("LAST_ACCESS_IP >", value, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_ACCESS_IP >=", value, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpLessThan(String value) {
            addCriterion("LAST_ACCESS_IP <", value, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpLessThanOrEqualTo(String value) {
            addCriterion("LAST_ACCESS_IP <=", value, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpLike(String value) {
            addCriterion("LAST_ACCESS_IP like", value, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpNotLike(String value) {
            addCriterion("LAST_ACCESS_IP not like", value, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpIn(List<String> values) {
            addCriterion("LAST_ACCESS_IP in", values, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpNotIn(List<String> values) {
            addCriterion("LAST_ACCESS_IP not in", values, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpBetween(String value1, String value2) {
            addCriterion("LAST_ACCESS_IP between", value1, value2, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLastAccessIpNotBetween(String value1, String value2) {
            addCriterion("LAST_ACCESS_IP not between", value1, value2, "lastAccessIp");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNull() {
            addCriterion("LOCALE is null");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNotNull() {
            addCriterion("LOCALE is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleEqualTo(String value) {
            addCriterion("LOCALE =", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotEqualTo(String value) {
            addCriterion("LOCALE <>", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThan(String value) {
            addCriterion("LOCALE >", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALE >=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThan(String value) {
            addCriterion("LOCALE <", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThanOrEqualTo(String value) {
            addCriterion("LOCALE <=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLike(String value) {
            addCriterion("LOCALE like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotLike(String value) {
            addCriterion("LOCALE not like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleIn(List<String> values) {
            addCriterion("LOCALE in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotIn(List<String> values) {
            addCriterion("LOCALE not in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleBetween(String value1, String value2) {
            addCriterion("LOCALE between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotBetween(String value1, String value2) {
            addCriterion("LOCALE not between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeIsNull() {
            addCriterion("PASSWORD_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeIsNotNull() {
            addCriterion("PASSWORD_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("PASSWORD_UPDATE_TIME =", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PASSWORD_UPDATE_TIME <>", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PASSWORD_UPDATE_TIME >", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PASSWORD_UPDATE_TIME >=", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("PASSWORD_UPDATE_TIME <", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PASSWORD_UPDATE_TIME <=", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("PASSWORD_UPDATE_TIME in", values, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PASSWORD_UPDATE_TIME not in", values, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PASSWORD_UPDATE_TIME between", value1, value2, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PASSWORD_UPDATE_TIME not between", value1, value2, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
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