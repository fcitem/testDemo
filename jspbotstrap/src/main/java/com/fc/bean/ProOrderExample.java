package com.fc.bean;

import java.util.ArrayList;
import java.util.List;

public class ProOrderExample {
	 protected String orderByClause;

	    protected boolean distinct;

	    protected List<Criteria> oredCriteria;

	    public ProOrderExample() {
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

	        public Criteria andOrderidIsNull() {
	            addCriterion("orderId is null");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidIsNotNull() {
	            addCriterion("orderId is not null");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidEqualTo(String value) {
	            addCriterion("orderId =", value, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidNotEqualTo(String value) {
	            addCriterion("orderId <>", value, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidGreaterThan(String value) {
	            addCriterion("orderId >", value, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
	            addCriterion("orderId >=", value, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidLessThan(String value) {
	            addCriterion("orderId <", value, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidLessThanOrEqualTo(String value) {
	            addCriterion("orderId <=", value, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidLike(String value) {
	            addCriterion("orderId like", value, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidNotLike(String value) {
	            addCriterion("orderId not like", value, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidIn(List<String> values) {
	            addCriterion("orderId in", values, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidNotIn(List<String> values) {
	            addCriterion("orderId not in", values, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidBetween(String value1, String value2) {
	            addCriterion("orderId between", value1, value2, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andOrderidNotBetween(String value1, String value2) {
	            addCriterion("orderId not between", value1, value2, "orderid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridIsNull() {
	            addCriterion("userId is null");
	            return (Criteria) this;
	        }

	        public Criteria andUseridIsNotNull() {
	            addCriterion("userId is not null");
	            return (Criteria) this;
	        }

	        public Criteria andUseridEqualTo(String value) {
	            addCriterion("userId =", value, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridNotEqualTo(String value) {
	            addCriterion("userId <>", value, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridGreaterThan(String value) {
	            addCriterion("userId >", value, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridGreaterThanOrEqualTo(String value) {
	            addCriterion("userId >=", value, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridLessThan(String value) {
	            addCriterion("userId <", value, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridLessThanOrEqualTo(String value) {
	            addCriterion("userId <=", value, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridLike(String value) {
	            addCriterion("userId like", value, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridNotLike(String value) {
	            addCriterion("userId not like", value, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridIn(List<String> values) {
	            addCriterion("userId in", values, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridNotIn(List<String> values) {
	            addCriterion("userId not in", values, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridBetween(String value1, String value2) {
	            addCriterion("userId between", value1, value2, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andUseridNotBetween(String value1, String value2) {
	            addCriterion("userId not between", value1, value2, "userid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridIsNull() {
	            addCriterion("buyerId is null");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridIsNotNull() {
	            addCriterion("buyerId is not null");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridEqualTo(String value) {
	            addCriterion("buyerId =", value, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridNotEqualTo(String value) {
	            addCriterion("buyerId <>", value, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridGreaterThan(String value) {
	            addCriterion("buyerId >", value, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridGreaterThanOrEqualTo(String value) {
	            addCriterion("buyerId >=", value, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridLessThan(String value) {
	            addCriterion("buyerId <", value, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridLessThanOrEqualTo(String value) {
	            addCriterion("buyerId <=", value, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridLike(String value) {
	            addCriterion("buyerId like", value, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridNotLike(String value) {
	            addCriterion("buyerId not like", value, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridIn(List<String> values) {
	            addCriterion("buyerId in", values, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridNotIn(List<String> values) {
	            addCriterion("buyerId not in", values, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridBetween(String value1, String value2) {
	            addCriterion("buyerId between", value1, value2, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andBuyeridNotBetween(String value1, String value2) {
	            addCriterion("buyerId not between", value1, value2, "buyerid");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeIsNull() {
	            addCriterion("orderTime is null");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeIsNotNull() {
	            addCriterion("orderTime is not null");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeEqualTo(String value) {
	            addCriterion("orderTime =", value, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeNotEqualTo(String value) {
	            addCriterion("orderTime <>", value, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeGreaterThan(String value) {
	            addCriterion("orderTime >", value, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeGreaterThanOrEqualTo(String value) {
	            addCriterion("orderTime >=", value, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeLessThan(String value) {
	            addCriterion("orderTime <", value, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeLessThanOrEqualTo(String value) {
	            addCriterion("orderTime <=", value, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeLike(String value) {
	            addCriterion("orderTime like", value, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeNotLike(String value) {
	            addCriterion("orderTime not like", value, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeIn(List<String> values) {
	            addCriterion("orderTime in", values, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeNotIn(List<String> values) {
	            addCriterion("orderTime not in", values, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeBetween(String value1, String value2) {
	            addCriterion("orderTime between", value1, value2, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andOrdertimeNotBetween(String value1, String value2) {
	            addCriterion("orderTime not between", value1, value2, "ordertime");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneIsNull() {
	            addCriterion("buyerPhone is null");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneIsNotNull() {
	            addCriterion("buyerPhone is not null");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneEqualTo(String value) {
	            addCriterion("buyerPhone =", value, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneNotEqualTo(String value) {
	            addCriterion("buyerPhone <>", value, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneGreaterThan(String value) {
	            addCriterion("buyerPhone >", value, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneGreaterThanOrEqualTo(String value) {
	            addCriterion("buyerPhone >=", value, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneLessThan(String value) {
	            addCriterion("buyerPhone <", value, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneLessThanOrEqualTo(String value) {
	            addCriterion("buyerPhone <=", value, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneLike(String value) {
	            addCriterion("buyerPhone like", value, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneNotLike(String value) {
	            addCriterion("buyerPhone not like", value, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneIn(List<String> values) {
	            addCriterion("buyerPhone in", values, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneNotIn(List<String> values) {
	            addCriterion("buyerPhone not in", values, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneBetween(String value1, String value2) {
	            addCriterion("buyerPhone between", value1, value2, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andBuyerphoneNotBetween(String value1, String value2) {
	            addCriterion("buyerPhone not between", value1, value2, "buyerphone");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateIsNull() {
	            addCriterion("orderState is null");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateIsNotNull() {
	            addCriterion("orderState is not null");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateEqualTo(String value) {
	            addCriterion("orderState =", value, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateNotEqualTo(String value) {
	            addCriterion("orderState <>", value, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateGreaterThan(String value) {
	            addCriterion("orderState >", value, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateGreaterThanOrEqualTo(String value) {
	            addCriterion("orderState >=", value, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateLessThan(String value) {
	            addCriterion("orderState <", value, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateLessThanOrEqualTo(String value) {
	            addCriterion("orderState <=", value, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateLike(String value) {
	            addCriterion("orderState like", value, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateNotLike(String value) {
	            addCriterion("orderState not like", value, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateIn(List<String> values) {
	            addCriterion("orderState in", values, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateNotIn(List<String> values) {
	            addCriterion("orderState not in", values, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateBetween(String value1, String value2) {
	            addCriterion("orderState between", value1, value2, "orderstate");
	            return (Criteria) this;
	        }

	        public Criteria andOrderstateNotBetween(String value1, String value2) {
	            addCriterion("orderState not between", value1, value2, "orderstate");
	            return (Criteria) this;
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
	        
	        public Criteria andProidInList(List<String> values) {
	            addCriterion("o.proId in", values, "proid");
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