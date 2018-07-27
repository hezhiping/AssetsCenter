package com.assets.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
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

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andLnameIsNull() {
            addCriterion("lname is null");
            return (Criteria) this;
        }

        public Criteria andLnameIsNotNull() {
            addCriterion("lname is not null");
            return (Criteria) this;
        }

        public Criteria andLnameEqualTo(String value) {
            addCriterion("lname =", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotEqualTo(String value) {
            addCriterion("lname <>", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameGreaterThan(String value) {
            addCriterion("lname >", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameGreaterThanOrEqualTo(String value) {
            addCriterion("lname >=", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLessThan(String value) {
            addCriterion("lname <", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLessThanOrEqualTo(String value) {
            addCriterion("lname <=", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLike(String value) {
            addCriterion("lname like", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotLike(String value) {
            addCriterion("lname not like", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameIn(List<String> values) {
            addCriterion("lname in", values, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotIn(List<String> values) {
            addCriterion("lname not in", values, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameBetween(String value1, String value2) {
            addCriterion("lname between", value1, value2, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotBetween(String value1, String value2) {
            addCriterion("lname not between", value1, value2, "lname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andTitleNoIsNull() {
            addCriterion("title_no is null");
            return (Criteria) this;
        }

        public Criteria andTitleNoIsNotNull() {
            addCriterion("title_no is not null");
            return (Criteria) this;
        }

        public Criteria andTitleNoEqualTo(String value) {
            addCriterion("title_no =", value, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoNotEqualTo(String value) {
            addCriterion("title_no <>", value, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoGreaterThan(String value) {
            addCriterion("title_no >", value, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoGreaterThanOrEqualTo(String value) {
            addCriterion("title_no >=", value, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoLessThan(String value) {
            addCriterion("title_no <", value, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoLessThanOrEqualTo(String value) {
            addCriterion("title_no <=", value, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoLike(String value) {
            addCriterion("title_no like", value, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoNotLike(String value) {
            addCriterion("title_no not like", value, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoIn(List<String> values) {
            addCriterion("title_no in", values, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoNotIn(List<String> values) {
            addCriterion("title_no not in", values, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoBetween(String value1, String value2) {
            addCriterion("title_no between", value1, value2, "titleNo");
            return (Criteria) this;
        }

        public Criteria andTitleNoNotBetween(String value1, String value2) {
            addCriterion("title_no not between", value1, value2, "titleNo");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(Long value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(Long value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(Long value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(Long value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(Long value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<Long> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<Long> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(Long value1, Long value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(Long value1, Long value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgEnameIsNull() {
            addCriterion("org_ename is null");
            return (Criteria) this;
        }

        public Criteria andOrgEnameIsNotNull() {
            addCriterion("org_ename is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEnameEqualTo(String value) {
            addCriterion("org_ename =", value, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameNotEqualTo(String value) {
            addCriterion("org_ename <>", value, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameGreaterThan(String value) {
            addCriterion("org_ename >", value, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameGreaterThanOrEqualTo(String value) {
            addCriterion("org_ename >=", value, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameLessThan(String value) {
            addCriterion("org_ename <", value, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameLessThanOrEqualTo(String value) {
            addCriterion("org_ename <=", value, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameLike(String value) {
            addCriterion("org_ename like", value, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameNotLike(String value) {
            addCriterion("org_ename not like", value, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameIn(List<String> values) {
            addCriterion("org_ename in", values, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameNotIn(List<String> values) {
            addCriterion("org_ename not in", values, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameBetween(String value1, String value2) {
            addCriterion("org_ename between", value1, value2, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgEnameNotBetween(String value1, String value2) {
            addCriterion("org_ename not between", value1, value2, "orgEname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameIsNull() {
            addCriterion("org_cname is null");
            return (Criteria) this;
        }

        public Criteria andOrgCnameIsNotNull() {
            addCriterion("org_cname is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCnameEqualTo(String value) {
            addCriterion("org_cname =", value, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameNotEqualTo(String value) {
            addCriterion("org_cname <>", value, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameGreaterThan(String value) {
            addCriterion("org_cname >", value, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameGreaterThanOrEqualTo(String value) {
            addCriterion("org_cname >=", value, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameLessThan(String value) {
            addCriterion("org_cname <", value, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameLessThanOrEqualTo(String value) {
            addCriterion("org_cname <=", value, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameLike(String value) {
            addCriterion("org_cname like", value, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameNotLike(String value) {
            addCriterion("org_cname not like", value, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameIn(List<String> values) {
            addCriterion("org_cname in", values, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameNotIn(List<String> values) {
            addCriterion("org_cname not in", values, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameBetween(String value1, String value2) {
            addCriterion("org_cname between", value1, value2, "orgCname");
            return (Criteria) this;
        }

        public Criteria andOrgCnameNotBetween(String value1, String value2) {
            addCriterion("org_cname not between", value1, value2, "orgCname");
            return (Criteria) this;
        }

        public Criteria andPosInOrgIsNull() {
            addCriterion("pos_in_org is null");
            return (Criteria) this;
        }

        public Criteria andPosInOrgIsNotNull() {
            addCriterion("pos_in_org is not null");
            return (Criteria) this;
        }

        public Criteria andPosInOrgEqualTo(String value) {
            addCriterion("pos_in_org =", value, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgNotEqualTo(String value) {
            addCriterion("pos_in_org <>", value, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgGreaterThan(String value) {
            addCriterion("pos_in_org >", value, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgGreaterThanOrEqualTo(String value) {
            addCriterion("pos_in_org >=", value, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgLessThan(String value) {
            addCriterion("pos_in_org <", value, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgLessThanOrEqualTo(String value) {
            addCriterion("pos_in_org <=", value, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgLike(String value) {
            addCriterion("pos_in_org like", value, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgNotLike(String value) {
            addCriterion("pos_in_org not like", value, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgIn(List<String> values) {
            addCriterion("pos_in_org in", values, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgNotIn(List<String> values) {
            addCriterion("pos_in_org not in", values, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgBetween(String value1, String value2) {
            addCriterion("pos_in_org between", value1, value2, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andPosInOrgNotBetween(String value1, String value2) {
            addCriterion("pos_in_org not between", value1, value2, "posInOrg");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andEaddressIsNull() {
            addCriterion("eaddress is null");
            return (Criteria) this;
        }

        public Criteria andEaddressIsNotNull() {
            addCriterion("eaddress is not null");
            return (Criteria) this;
        }

        public Criteria andEaddressEqualTo(String value) {
            addCriterion("eaddress =", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressNotEqualTo(String value) {
            addCriterion("eaddress <>", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressGreaterThan(String value) {
            addCriterion("eaddress >", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressGreaterThanOrEqualTo(String value) {
            addCriterion("eaddress >=", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressLessThan(String value) {
            addCriterion("eaddress <", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressLessThanOrEqualTo(String value) {
            addCriterion("eaddress <=", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressLike(String value) {
            addCriterion("eaddress like", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressNotLike(String value) {
            addCriterion("eaddress not like", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressIn(List<String> values) {
            addCriterion("eaddress in", values, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressNotIn(List<String> values) {
            addCriterion("eaddress not in", values, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressBetween(String value1, String value2) {
            addCriterion("eaddress between", value1, value2, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressNotBetween(String value1, String value2) {
            addCriterion("eaddress not between", value1, value2, "eaddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNull() {
            addCriterion("caddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("caddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("caddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("caddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("caddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("caddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("caddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("caddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("caddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("caddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("caddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("caddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("caddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("caddress not between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHttpIsNull() {
            addCriterion("http is null");
            return (Criteria) this;
        }

        public Criteria andHttpIsNotNull() {
            addCriterion("http is not null");
            return (Criteria) this;
        }

        public Criteria andHttpEqualTo(String value) {
            addCriterion("http =", value, "http");
            return (Criteria) this;
        }

        public Criteria andHttpNotEqualTo(String value) {
            addCriterion("http <>", value, "http");
            return (Criteria) this;
        }

        public Criteria andHttpGreaterThan(String value) {
            addCriterion("http >", value, "http");
            return (Criteria) this;
        }

        public Criteria andHttpGreaterThanOrEqualTo(String value) {
            addCriterion("http >=", value, "http");
            return (Criteria) this;
        }

        public Criteria andHttpLessThan(String value) {
            addCriterion("http <", value, "http");
            return (Criteria) this;
        }

        public Criteria andHttpLessThanOrEqualTo(String value) {
            addCriterion("http <=", value, "http");
            return (Criteria) this;
        }

        public Criteria andHttpLike(String value) {
            addCriterion("http like", value, "http");
            return (Criteria) this;
        }

        public Criteria andHttpNotLike(String value) {
            addCriterion("http not like", value, "http");
            return (Criteria) this;
        }

        public Criteria andHttpIn(List<String> values) {
            addCriterion("http in", values, "http");
            return (Criteria) this;
        }

        public Criteria andHttpNotIn(List<String> values) {
            addCriterion("http not in", values, "http");
            return (Criteria) this;
        }

        public Criteria andHttpBetween(String value1, String value2) {
            addCriterion("http between", value1, value2, "http");
            return (Criteria) this;
        }

        public Criteria andHttpNotBetween(String value1, String value2) {
            addCriterion("http not between", value1, value2, "http");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeIsNull() {
            addCriterion("highest_degree is null");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeIsNotNull() {
            addCriterion("highest_degree is not null");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeEqualTo(String value) {
            addCriterion("highest_degree =", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeNotEqualTo(String value) {
            addCriterion("highest_degree <>", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeGreaterThan(String value) {
            addCriterion("highest_degree >", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("highest_degree >=", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLessThan(String value) {
            addCriterion("highest_degree <", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLessThanOrEqualTo(String value) {
            addCriterion("highest_degree <=", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLike(String value) {
            addCriterion("highest_degree like", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeNotLike(String value) {
            addCriterion("highest_degree not like", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeIn(List<String> values) {
            addCriterion("highest_degree in", values, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeNotIn(List<String> values) {
            addCriterion("highest_degree not in", values, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeBetween(String value1, String value2) {
            addCriterion("highest_degree between", value1, value2, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeNotBetween(String value1, String value2) {
            addCriterion("highest_degree not between", value1, value2, "highestDegree");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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