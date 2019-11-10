package com.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuAgeIsNull() {
            addCriterion("stu_age is null");
            return (Criteria) this;
        }

        public Criteria andStuAgeIsNotNull() {
            addCriterion("stu_age is not null");
            return (Criteria) this;
        }

        public Criteria andStuAgeEqualTo(Integer value) {
            addCriterion("stu_age =", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotEqualTo(Integer value) {
            addCriterion("stu_age <>", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeGreaterThan(Integer value) {
            addCriterion("stu_age >", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_age >=", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeLessThan(Integer value) {
            addCriterion("stu_age <", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeLessThanOrEqualTo(Integer value) {
            addCriterion("stu_age <=", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeIn(List<Integer> values) {
            addCriterion("stu_age in", values, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotIn(List<Integer> values) {
            addCriterion("stu_age not in", values, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeBetween(Integer value1, Integer value2) {
            addCriterion("stu_age between", value1, value2, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_age not between", value1, value2, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNull() {
            addCriterion("stu_phone is null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNotNull() {
            addCriterion("stu_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneEqualTo(String value) {
            addCriterion("stu_phone =", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotEqualTo(String value) {
            addCriterion("stu_phone <>", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThan(String value) {
            addCriterion("stu_phone >", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("stu_phone >=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThan(String value) {
            addCriterion("stu_phone <", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThanOrEqualTo(String value) {
            addCriterion("stu_phone <=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLike(String value) {
            addCriterion("stu_phone like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotLike(String value) {
            addCriterion("stu_phone not like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIn(List<String> values) {
            addCriterion("stu_phone in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotIn(List<String> values) {
            addCriterion("stu_phone not in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneBetween(String value1, String value2) {
            addCriterion("stu_phone between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotBetween(String value1, String value2) {
            addCriterion("stu_phone not between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuRemarkIsNull() {
            addCriterion("stu_remark is null");
            return (Criteria) this;
        }

        public Criteria andStuRemarkIsNotNull() {
            addCriterion("stu_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStuRemarkEqualTo(String value) {
            addCriterion("stu_remark =", value, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkNotEqualTo(String value) {
            addCriterion("stu_remark <>", value, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkGreaterThan(String value) {
            addCriterion("stu_remark >", value, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("stu_remark >=", value, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkLessThan(String value) {
            addCriterion("stu_remark <", value, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkLessThanOrEqualTo(String value) {
            addCriterion("stu_remark <=", value, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkLike(String value) {
            addCriterion("stu_remark like", value, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkNotLike(String value) {
            addCriterion("stu_remark not like", value, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkIn(List<String> values) {
            addCriterion("stu_remark in", values, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkNotIn(List<String> values) {
            addCriterion("stu_remark not in", values, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkBetween(String value1, String value2) {
            addCriterion("stu_remark between", value1, value2, "stuRemark");
            return (Criteria) this;
        }

        public Criteria andStuRemarkNotBetween(String value1, String value2) {
            addCriterion("stu_remark not between", value1, value2, "stuRemark");
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