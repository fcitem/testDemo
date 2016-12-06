package com.fc.bean;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("menu_id like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("menu_id not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuClassIsNull() {
            addCriterion("menu_class is null");
            return (Criteria) this;
        }

        public Criteria andMenuClassIsNotNull() {
            addCriterion("menu_class is not null");
            return (Criteria) this;
        }

        public Criteria andMenuClassEqualTo(String value) {
            addCriterion("menu_class =", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassNotEqualTo(String value) {
            addCriterion("menu_class <>", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassGreaterThan(String value) {
            addCriterion("menu_class >", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassGreaterThanOrEqualTo(String value) {
            addCriterion("menu_class >=", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassLessThan(String value) {
            addCriterion("menu_class <", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassLessThanOrEqualTo(String value) {
            addCriterion("menu_class <=", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassLike(String value) {
            addCriterion("menu_class like", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassNotLike(String value) {
            addCriterion("menu_class not like", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassIn(List<String> values) {
            addCriterion("menu_class in", values, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassNotIn(List<String> values) {
            addCriterion("menu_class not in", values, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassBetween(String value1, String value2) {
            addCriterion("menu_class between", value1, value2, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassNotBetween(String value1, String value2) {
            addCriterion("menu_class not between", value1, value2, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIsNull() {
            addCriterion("menu_link is null");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIsNotNull() {
            addCriterion("menu_link is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLinkEqualTo(String value) {
            addCriterion("menu_link =", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotEqualTo(String value) {
            addCriterion("menu_link <>", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkGreaterThan(String value) {
            addCriterion("menu_link >", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkGreaterThanOrEqualTo(String value) {
            addCriterion("menu_link >=", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLessThan(String value) {
            addCriterion("menu_link <", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLessThanOrEqualTo(String value) {
            addCriterion("menu_link <=", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLike(String value) {
            addCriterion("menu_link like", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotLike(String value) {
            addCriterion("menu_link not like", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIn(List<String> values) {
            addCriterion("menu_link in", values, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotIn(List<String> values) {
            addCriterion("menu_link not in", values, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkBetween(String value1, String value2) {
            addCriterion("menu_link between", value1, value2, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotBetween(String value1, String value2) {
            addCriterion("menu_link not between", value1, value2, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuRoleIsNull() {
            addCriterion("menu_role is null");
            return (Criteria) this;
        }

        public Criteria andMenuRoleIsNotNull() {
            addCriterion("menu_role is not null");
            return (Criteria) this;
        }

        public Criteria andMenuRoleEqualTo(String value) {
            addCriterion("menu_role =", value, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleNotEqualTo(String value) {
            addCriterion("menu_role <>", value, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleGreaterThan(String value) {
            addCriterion("menu_role >", value, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleGreaterThanOrEqualTo(String value) {
            addCriterion("menu_role >=", value, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleLessThan(String value) {
            addCriterion("menu_role <", value, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleLessThanOrEqualTo(String value) {
            addCriterion("menu_role <=", value, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleLike(String value) {
            addCriterion("menu_role like", value, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleNotLike(String value) {
            addCriterion("menu_role not like", value, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleIn(List<String> values) {
            addCriterion("menu_role in", values, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleNotIn(List<String> values) {
            addCriterion("menu_role not in", values, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleBetween(String value1, String value2) {
            addCriterion("menu_role between", value1, value2, "menuRole");
            return (Criteria) this;
        }

        public Criteria andMenuRoleNotBetween(String value1, String value2) {
            addCriterion("menu_role not between", value1, value2, "menuRole");
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