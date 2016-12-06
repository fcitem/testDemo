package com.fc.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    private Integer begin;
    
    private Integer number;

    public Integer getBegin() {
		return begin;
	}

	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public void setLimit(Integer begin,Integer number){
		this.number=number;
		this.begin=begin;
	}

    public ProductExample() {
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
        this.begin=null;
        this.number=null;
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

        public Criteria andPronameIsNull() {
            addCriterion("proName is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("proName is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("proName =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("proName <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("proName >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("proName >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("proName <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("proName <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("proName like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("proName not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("proName in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("proName not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("proName between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("proName not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNull() {
            addCriterion("proType is null");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNotNull() {
            addCriterion("proType is not null");
            return (Criteria) this;
        }

        public Criteria andProtypeEqualTo(String value) {
            addCriterion("proType =", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotEqualTo(String value) {
            addCriterion("proType <>", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThan(String value) {
            addCriterion("proType >", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThanOrEqualTo(String value) {
            addCriterion("proType >=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThan(String value) {
            addCriterion("proType <", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThanOrEqualTo(String value) {
            addCriterion("proType <=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLike(String value) {
            addCriterion("proType like", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotLike(String value) {
            addCriterion("proType not like", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeIn(List<String> values) {
            addCriterion("proType in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotIn(List<String> values) {
            addCriterion("proType not in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeBetween(String value1, String value2) {
            addCriterion("proType between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotBetween(String value1, String value2) {
            addCriterion("proType not between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andProvalueIsNull() {
            addCriterion("proValue is null");
            return (Criteria) this;
        }

        public Criteria andProvalueIsNotNull() {
            addCriterion("proValue is not null");
            return (Criteria) this;
        }

        public Criteria andProvalueEqualTo(Double value) {
            addCriterion("proValue =", value, "provalue");
            return (Criteria) this;
        }

        public Criteria andProvalueNotEqualTo(Double value) {
            addCriterion("proValue <>", value, "provalue");
            return (Criteria) this;
        }

        public Criteria andProvalueGreaterThan(Double value) {
            addCriterion("proValue >", value, "provalue");
            return (Criteria) this;
        }

        public Criteria andProvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("proValue >=", value, "provalue");
            return (Criteria) this;
        }

        public Criteria andProvalueLessThan(Double value) {
            addCriterion("proValue <", value, "provalue");
            return (Criteria) this;
        }

        public Criteria andProvalueLessThanOrEqualTo(Double value) {
            addCriterion("proValue <=", value, "provalue");
            return (Criteria) this;
        }

        public Criteria andProvalueIn(List<Double> values) {
            addCriterion("proValue in", values, "provalue");
            return (Criteria) this;
        }

        public Criteria andProvalueNotIn(List<Double> values) {
            addCriterion("proValue not in", values, "provalue");
            return (Criteria) this;
        }

        public Criteria andProvalueBetween(Double value1, Double value2) {
            addCriterion("proValue between", value1, value2, "provalue");
            return (Criteria) this;
        }

        public Criteria andProvalueNotBetween(Double value1, Double value2) {
            addCriterion("proValue not between", value1, value2, "provalue");
            return (Criteria) this;
        }

        public Criteria andProimgIsNull() {
            addCriterion("proImg is null");
            return (Criteria) this;
        }

        public Criteria andProimgIsNotNull() {
            addCriterion("proImg is not null");
            return (Criteria) this;
        }

        public Criteria andProimgEqualTo(String value) {
            addCriterion("proImg =", value, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgNotEqualTo(String value) {
            addCriterion("proImg <>", value, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgGreaterThan(String value) {
            addCriterion("proImg >", value, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgGreaterThanOrEqualTo(String value) {
            addCriterion("proImg >=", value, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgLessThan(String value) {
            addCriterion("proImg <", value, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgLessThanOrEqualTo(String value) {
            addCriterion("proImg <=", value, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgLike(String value) {
            addCriterion("proImg like", value, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgNotLike(String value) {
            addCriterion("proImg not like", value, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgIn(List<String> values) {
            addCriterion("proImg in", values, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgNotIn(List<String> values) {
            addCriterion("proImg not in", values, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgBetween(String value1, String value2) {
            addCriterion("proImg between", value1, value2, "proimg");
            return (Criteria) this;
        }

        public Criteria andProimgNotBetween(String value1, String value2) {
            addCriterion("proImg not between", value1, value2, "proimg");
            return (Criteria) this;
        }

        public Criteria andProdescIsNull() {
            addCriterion("proDesc is null");
            return (Criteria) this;
        }

        public Criteria andProdescIsNotNull() {
            addCriterion("proDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProdescEqualTo(String value) {
            addCriterion("proDesc =", value, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescNotEqualTo(String value) {
            addCriterion("proDesc <>", value, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescGreaterThan(String value) {
            addCriterion("proDesc >", value, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescGreaterThanOrEqualTo(String value) {
            addCriterion("proDesc >=", value, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescLessThan(String value) {
            addCriterion("proDesc <", value, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescLessThanOrEqualTo(String value) {
            addCriterion("proDesc <=", value, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescLike(String value) {
            addCriterion("proDesc like", value, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescNotLike(String value) {
            addCriterion("proDesc not like", value, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescIn(List<String> values) {
            addCriterion("proDesc in", values, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescNotIn(List<String> values) {
            addCriterion("proDesc not in", values, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescBetween(String value1, String value2) {
            addCriterion("proDesc between", value1, value2, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProdescNotBetween(String value1, String value2) {
            addCriterion("proDesc not between", value1, value2, "prodesc");
            return (Criteria) this;
        }

        public Criteria andProcontrollerIsNull() {
            addCriterion("proController is null");
            return (Criteria) this;
        }

        public Criteria andProcontrollerIsNotNull() {
            addCriterion("proController is not null");
            return (Criteria) this;
        }

        public Criteria andProcontrollerEqualTo(String value) {
            addCriterion("proController =", value, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerNotEqualTo(String value) {
            addCriterion("proController <>", value, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerGreaterThan(String value) {
            addCriterion("proController >", value, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerGreaterThanOrEqualTo(String value) {
            addCriterion("proController >=", value, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerLessThan(String value) {
            addCriterion("proController <", value, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerLessThanOrEqualTo(String value) {
            addCriterion("proController <=", value, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerLike(String value) {
            addCriterion("proController like", value, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerNotLike(String value) {
            addCriterion("proController not like", value, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerIn(List<String> values) {
            addCriterion("proController in", values, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerNotIn(List<String> values) {
            addCriterion("proController not in", values, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerBetween(String value1, String value2) {
            addCriterion("proController between", value1, value2, "procontroller");
            return (Criteria) this;
        }

        public Criteria andProcontrollerNotBetween(String value1, String value2) {
            addCriterion("proController not between", value1, value2, "procontroller");
            return (Criteria) this;
        }

        public Criteria andPromlIsNull() {
            addCriterion("proMl is null");
            return (Criteria) this;
        }

        public Criteria andPromlIsNotNull() {
            addCriterion("proMl is not null");
            return (Criteria) this;
        }

        public Criteria andPromlEqualTo(Double value) {
            addCriterion("proMl =", value, "proml");
            return (Criteria) this;
        }

        public Criteria andPromlNotEqualTo(Double value) {
            addCriterion("proMl <>", value, "proml");
            return (Criteria) this;
        }

        public Criteria andPromlGreaterThan(Double value) {
            addCriterion("proMl >", value, "proml");
            return (Criteria) this;
        }

        public Criteria andPromlGreaterThanOrEqualTo(Double value) {
            addCriterion("proMl >=", value, "proml");
            return (Criteria) this;
        }

        public Criteria andPromlLessThan(Double value) {
            addCriterion("proMl <", value, "proml");
            return (Criteria) this;
        }

        public Criteria andPromlLessThanOrEqualTo(Double value) {
            addCriterion("proMl <=", value, "proml");
            return (Criteria) this;
        }

        public Criteria andPromlIn(List<Double> values) {
            addCriterion("proMl in", values, "proml");
            return (Criteria) this;
        }

        public Criteria andPromlNotIn(List<Double> values) {
            addCriterion("proMl not in", values, "proml");
            return (Criteria) this;
        }

        public Criteria andPromlBetween(Double value1, Double value2) {
            addCriterion("proMl between", value1, value2, "proml");
            return (Criteria) this;
        }

        public Criteria andPromlNotBetween(Double value1, Double value2) {
            addCriterion("proMl not between", value1, value2, "proml");
            return (Criteria) this;
        }

        public Criteria andPronowvalueIsNull() {
            addCriterion("pronowValue is null");
            return (Criteria) this;
        }

        public Criteria andPronowvalueIsNotNull() {
            addCriterion("pronowValue is not null");
            return (Criteria) this;
        }

        public Criteria andPronowvalueEqualTo(Double value) {
            addCriterion("pronowValue =", value, "pronowvalue");
            return (Criteria) this;
        }

        public Criteria andPronowvalueNotEqualTo(Double value) {
            addCriterion("pronowValue <>", value, "pronowvalue");
            return (Criteria) this;
        }

        public Criteria andPronowvalueGreaterThan(Double value) {
            addCriterion("pronowValue >", value, "pronowvalue");
            return (Criteria) this;
        }

        public Criteria andPronowvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("pronowValue >=", value, "pronowvalue");
            return (Criteria) this;
        }

        public Criteria andPronowvalueLessThan(Double value) {
            addCriterion("pronowValue <", value, "pronowvalue");
            return (Criteria) this;
        }

        public Criteria andPronowvalueLessThanOrEqualTo(Double value) {
            addCriterion("pronowValue <=", value, "pronowvalue");
            return (Criteria) this;
        }

        public Criteria andPronowvalueIn(List<Double> values) {
            addCriterion("pronowValue in", values, "pronowvalue");
            return (Criteria) this;
        }

        public Criteria andPronowvalueNotIn(List<Double> values) {
            addCriterion("pronowValue not in", values, "pronowvalue");
            return (Criteria) this;
        }

        public Criteria andPronowvalueBetween(Double value1, Double value2) {
            addCriterion("pronowValue between", value1, value2, "pronowvalue");
            return (Criteria) this;
        }

        public Criteria andPronowvalueNotBetween(Double value1, Double value2) {
            addCriterion("pronowValue not between", value1, value2, "pronowvalue");
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