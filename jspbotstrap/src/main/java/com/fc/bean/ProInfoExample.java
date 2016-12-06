package com.fc.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProInfoExample() {
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

        public Criteria andProidIsNull() {
            addCriterion("proId is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("proId is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(String value) {
            addCriterion("proId =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(String value) {
            addCriterion("proId <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(String value) {
            addCriterion("proId >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(String value) {
            addCriterion("proId >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(String value) {
            addCriterion("proId <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(String value) {
            addCriterion("proId <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLike(String value) {
            addCriterion("proId like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotLike(String value) {
            addCriterion("proId not like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<String> values) {
            addCriterion("proId in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<String> values) {
            addCriterion("proId not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(String value1, String value2) {
            addCriterion("proId between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(String value1, String value2) {
            addCriterion("proId not between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andNowvalueIsNull() {
            addCriterion("nowValue is null");
            return (Criteria) this;
        }

        public Criteria andNowvalueIsNotNull() {
            addCriterion("nowValue is not null");
            return (Criteria) this;
        }

        public Criteria andNowvalueEqualTo(Double value) {
            addCriterion("nowValue =", value, "nowvalue");
            return (Criteria) this;
        }

        public Criteria andNowvalueNotEqualTo(Double value) {
            addCriterion("nowValue <>", value, "nowvalue");
            return (Criteria) this;
        }

        public Criteria andNowvalueGreaterThan(Double value) {
            addCriterion("nowValue >", value, "nowvalue");
            return (Criteria) this;
        }

        public Criteria andNowvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("nowValue >=", value, "nowvalue");
            return (Criteria) this;
        }

        public Criteria andNowvalueLessThan(Double value) {
            addCriterion("nowValue <", value, "nowvalue");
            return (Criteria) this;
        }

        public Criteria andNowvalueLessThanOrEqualTo(Double value) {
            addCriterion("nowValue <=", value, "nowvalue");
            return (Criteria) this;
        }

        public Criteria andNowvalueIn(List<Double> values) {
            addCriterion("nowValue in", values, "nowvalue");
            return (Criteria) this;
        }

        public Criteria andNowvalueNotIn(List<Double> values) {
            addCriterion("nowValue not in", values, "nowvalue");
            return (Criteria) this;
        }

        public Criteria andNowvalueBetween(Double value1, Double value2) {
            addCriterion("nowValue between", value1, value2, "nowvalue");
            return (Criteria) this;
        }

        public Criteria andNowvalueNotBetween(Double value1, Double value2) {
            addCriterion("nowValue not between", value1, value2, "nowvalue");
            return (Criteria) this;
        }

        public Criteria andPronumberIsNull() {
            addCriterion("proNumber is null");
            return (Criteria) this;
        }

        public Criteria andPronumberIsNotNull() {
            addCriterion("proNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPronumberEqualTo(Integer value) {
            addCriterion("proNumber =", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotEqualTo(Integer value) {
            addCriterion("proNumber <>", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberGreaterThan(Integer value) {
            addCriterion("proNumber >", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("proNumber >=", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberLessThan(Integer value) {
            addCriterion("proNumber <", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberLessThanOrEqualTo(Integer value) {
            addCriterion("proNumber <=", value, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberIn(List<Integer> values) {
            addCriterion("proNumber in", values, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotIn(List<Integer> values) {
            addCriterion("proNumber not in", values, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberBetween(Integer value1, Integer value2) {
            addCriterion("proNumber between", value1, value2, "pronumber");
            return (Criteria) this;
        }

        public Criteria andPronumberNotBetween(Integer value1, Integer value2) {
            addCriterion("proNumber not between", value1, value2, "pronumber");
            return (Criteria) this;
        }

        public Criteria andProsourceIsNull() {
            addCriterion("proSource is null");
            return (Criteria) this;
        }

        public Criteria andProsourceIsNotNull() {
            addCriterion("proSource is not null");
            return (Criteria) this;
        }

        public Criteria andProsourceEqualTo(String value) {
            addCriterion("proSource =", value, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceNotEqualTo(String value) {
            addCriterion("proSource <>", value, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceGreaterThan(String value) {
            addCriterion("proSource >", value, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceGreaterThanOrEqualTo(String value) {
            addCriterion("proSource >=", value, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceLessThan(String value) {
            addCriterion("proSource <", value, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceLessThanOrEqualTo(String value) {
            addCriterion("proSource <=", value, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceLike(String value) {
            addCriterion("proSource like", value, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceNotLike(String value) {
            addCriterion("proSource not like", value, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceIn(List<String> values) {
            addCriterion("proSource in", values, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceNotIn(List<String> values) {
            addCriterion("proSource not in", values, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceBetween(String value1, String value2) {
            addCriterion("proSource between", value1, value2, "prosource");
            return (Criteria) this;
        }

        public Criteria andProsourceNotBetween(String value1, String value2) {
            addCriterion("proSource not between", value1, value2, "prosource");
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