package com.zhkjoa.model;

import java.util.ArrayList;
import java.util.List;

public class zhuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public zhuserExample() {
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

        public Criteria andZhIdIsNull() {
            addCriterion("zh_id is null");
            return (Criteria) this;
        }

        public Criteria andZhIdIsNotNull() {
            addCriterion("zh_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhIdEqualTo(Integer value) {
            addCriterion("zh_id =", value, "zhId");
            return (Criteria) this;
        }

        public Criteria andZhIdNotEqualTo(Integer value) {
            addCriterion("zh_id <>", value, "zhId");
            return (Criteria) this;
        }

        public Criteria andZhIdGreaterThan(Integer value) {
            addCriterion("zh_id >", value, "zhId");
            return (Criteria) this;
        }

        public Criteria andZhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zh_id >=", value, "zhId");
            return (Criteria) this;
        }

        public Criteria andZhIdLessThan(Integer value) {
            addCriterion("zh_id <", value, "zhId");
            return (Criteria) this;
        }

        public Criteria andZhIdLessThanOrEqualTo(Integer value) {
            addCriterion("zh_id <=", value, "zhId");
            return (Criteria) this;
        }

        public Criteria andZhIdIn(List<Integer> values) {
            addCriterion("zh_id in", values, "zhId");
            return (Criteria) this;
        }

        public Criteria andZhIdNotIn(List<Integer> values) {
            addCriterion("zh_id not in", values, "zhId");
            return (Criteria) this;
        }

        public Criteria andZhIdBetween(Integer value1, Integer value2) {
            addCriterion("zh_id between", value1, value2, "zhId");
            return (Criteria) this;
        }

        public Criteria andZhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zh_id not between", value1, value2, "zhId");
            return (Criteria) this;
        }

        public Criteria andZhUsernameIsNull() {
            addCriterion("zh_username is null");
            return (Criteria) this;
        }

        public Criteria andZhUsernameIsNotNull() {
            addCriterion("zh_username is not null");
            return (Criteria) this;
        }

        public Criteria andZhUsernameEqualTo(String value) {
            addCriterion("zh_username =", value, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameNotEqualTo(String value) {
            addCriterion("zh_username <>", value, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameGreaterThan(String value) {
            addCriterion("zh_username >", value, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("zh_username >=", value, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameLessThan(String value) {
            addCriterion("zh_username <", value, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameLessThanOrEqualTo(String value) {
            addCriterion("zh_username <=", value, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameLike(String value) {
            addCriterion("zh_username like", value, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameNotLike(String value) {
            addCriterion("zh_username not like", value, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameIn(List<String> values) {
            addCriterion("zh_username in", values, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameNotIn(List<String> values) {
            addCriterion("zh_username not in", values, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameBetween(String value1, String value2) {
            addCriterion("zh_username between", value1, value2, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhUsernameNotBetween(String value1, String value2) {
            addCriterion("zh_username not between", value1, value2, "zhUsername");
            return (Criteria) this;
        }

        public Criteria andZhPasswordIsNull() {
            addCriterion("zh_password is null");
            return (Criteria) this;
        }

        public Criteria andZhPasswordIsNotNull() {
            addCriterion("zh_password is not null");
            return (Criteria) this;
        }

        public Criteria andZhPasswordEqualTo(String value) {
            addCriterion("zh_password =", value, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordNotEqualTo(String value) {
            addCriterion("zh_password <>", value, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordGreaterThan(String value) {
            addCriterion("zh_password >", value, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("zh_password >=", value, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordLessThan(String value) {
            addCriterion("zh_password <", value, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordLessThanOrEqualTo(String value) {
            addCriterion("zh_password <=", value, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordLike(String value) {
            addCriterion("zh_password like", value, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordNotLike(String value) {
            addCriterion("zh_password not like", value, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordIn(List<String> values) {
            addCriterion("zh_password in", values, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordNotIn(List<String> values) {
            addCriterion("zh_password not in", values, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordBetween(String value1, String value2) {
            addCriterion("zh_password between", value1, value2, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhPasswordNotBetween(String value1, String value2) {
            addCriterion("zh_password not between", value1, value2, "zhPassword");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentIsNull() {
            addCriterion("zh_department is null");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentIsNotNull() {
            addCriterion("zh_department is not null");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentEqualTo(String value) {
            addCriterion("zh_department =", value, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentNotEqualTo(String value) {
            addCriterion("zh_department <>", value, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentGreaterThan(String value) {
            addCriterion("zh_department >", value, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("zh_department >=", value, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentLessThan(String value) {
            addCriterion("zh_department <", value, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentLessThanOrEqualTo(String value) {
            addCriterion("zh_department <=", value, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentLike(String value) {
            addCriterion("zh_department like", value, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentNotLike(String value) {
            addCriterion("zh_department not like", value, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentIn(List<String> values) {
            addCriterion("zh_department in", values, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentNotIn(List<String> values) {
            addCriterion("zh_department not in", values, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentBetween(String value1, String value2) {
            addCriterion("zh_department between", value1, value2, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhDepartmentNotBetween(String value1, String value2) {
            addCriterion("zh_department not between", value1, value2, "zhDepartment");
            return (Criteria) this;
        }

        public Criteria andZhNameIsNull() {
            addCriterion("zh_name is null");
            return (Criteria) this;
        }

        public Criteria andZhNameIsNotNull() {
            addCriterion("zh_name is not null");
            return (Criteria) this;
        }

        public Criteria andZhNameEqualTo(String value) {
            addCriterion("zh_name =", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotEqualTo(String value) {
            addCriterion("zh_name <>", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameGreaterThan(String value) {
            addCriterion("zh_name >", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameGreaterThanOrEqualTo(String value) {
            addCriterion("zh_name >=", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameLessThan(String value) {
            addCriterion("zh_name <", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameLessThanOrEqualTo(String value) {
            addCriterion("zh_name <=", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameLike(String value) {
            addCriterion("zh_name like", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotLike(String value) {
            addCriterion("zh_name not like", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameIn(List<String> values) {
            addCriterion("zh_name in", values, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotIn(List<String> values) {
            addCriterion("zh_name not in", values, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameBetween(String value1, String value2) {
            addCriterion("zh_name between", value1, value2, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotBetween(String value1, String value2) {
            addCriterion("zh_name not between", value1, value2, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhEmailIsNull() {
            addCriterion("zh_email is null");
            return (Criteria) this;
        }

        public Criteria andZhEmailIsNotNull() {
            addCriterion("zh_email is not null");
            return (Criteria) this;
        }

        public Criteria andZhEmailEqualTo(String value) {
            addCriterion("zh_email =", value, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailNotEqualTo(String value) {
            addCriterion("zh_email <>", value, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailGreaterThan(String value) {
            addCriterion("zh_email >", value, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailGreaterThanOrEqualTo(String value) {
            addCriterion("zh_email >=", value, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailLessThan(String value) {
            addCriterion("zh_email <", value, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailLessThanOrEqualTo(String value) {
            addCriterion("zh_email <=", value, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailLike(String value) {
            addCriterion("zh_email like", value, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailNotLike(String value) {
            addCriterion("zh_email not like", value, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailIn(List<String> values) {
            addCriterion("zh_email in", values, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailNotIn(List<String> values) {
            addCriterion("zh_email not in", values, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailBetween(String value1, String value2) {
            addCriterion("zh_email between", value1, value2, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhEmailNotBetween(String value1, String value2) {
            addCriterion("zh_email not between", value1, value2, "zhEmail");
            return (Criteria) this;
        }

        public Criteria andZhSexIsNull() {
            addCriterion("zh_sex is null");
            return (Criteria) this;
        }

        public Criteria andZhSexIsNotNull() {
            addCriterion("zh_sex is not null");
            return (Criteria) this;
        }

        public Criteria andZhSexEqualTo(String value) {
            addCriterion("zh_sex =", value, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexNotEqualTo(String value) {
            addCriterion("zh_sex <>", value, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexGreaterThan(String value) {
            addCriterion("zh_sex >", value, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexGreaterThanOrEqualTo(String value) {
            addCriterion("zh_sex >=", value, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexLessThan(String value) {
            addCriterion("zh_sex <", value, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexLessThanOrEqualTo(String value) {
            addCriterion("zh_sex <=", value, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexLike(String value) {
            addCriterion("zh_sex like", value, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexNotLike(String value) {
            addCriterion("zh_sex not like", value, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexIn(List<String> values) {
            addCriterion("zh_sex in", values, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexNotIn(List<String> values) {
            addCriterion("zh_sex not in", values, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexBetween(String value1, String value2) {
            addCriterion("zh_sex between", value1, value2, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhSexNotBetween(String value1, String value2) {
            addCriterion("zh_sex not between", value1, value2, "zhSex");
            return (Criteria) this;
        }

        public Criteria andZhStateIsNull() {
            addCriterion("zh_state is null");
            return (Criteria) this;
        }

        public Criteria andZhStateIsNotNull() {
            addCriterion("zh_state is not null");
            return (Criteria) this;
        }

        public Criteria andZhStateEqualTo(Integer value) {
            addCriterion("zh_state =", value, "zhState");
            return (Criteria) this;
        }

        public Criteria andZhStateNotEqualTo(Integer value) {
            addCriterion("zh_state <>", value, "zhState");
            return (Criteria) this;
        }

        public Criteria andZhStateGreaterThan(Integer value) {
            addCriterion("zh_state >", value, "zhState");
            return (Criteria) this;
        }

        public Criteria andZhStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("zh_state >=", value, "zhState");
            return (Criteria) this;
        }

        public Criteria andZhStateLessThan(Integer value) {
            addCriterion("zh_state <", value, "zhState");
            return (Criteria) this;
        }

        public Criteria andZhStateLessThanOrEqualTo(Integer value) {
            addCriterion("zh_state <=", value, "zhState");
            return (Criteria) this;
        }

        public Criteria andZhStateIn(List<Integer> values) {
            addCriterion("zh_state in", values, "zhState");
            return (Criteria) this;
        }

        public Criteria andZhStateNotIn(List<Integer> values) {
            addCriterion("zh_state not in", values, "zhState");
            return (Criteria) this;
        }

        public Criteria andZhStateBetween(Integer value1, Integer value2) {
            addCriterion("zh_state between", value1, value2, "zhState");
            return (Criteria) this;
        }

        public Criteria andZhStateNotBetween(Integer value1, Integer value2) {
            addCriterion("zh_state not between", value1, value2, "zhState");
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