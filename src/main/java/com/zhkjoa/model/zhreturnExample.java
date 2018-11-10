package com.zhkjoa.model;

import java.util.ArrayList;
import java.util.List;

public class zhreturnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public zhreturnExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRNameIsNull() {
            addCriterion("r_name is null");
            return (Criteria) this;
        }

        public Criteria andRNameIsNotNull() {
            addCriterion("r_name is not null");
            return (Criteria) this;
        }

        public Criteria andRNameEqualTo(String value) {
            addCriterion("r_name =", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotEqualTo(String value) {
            addCriterion("r_name <>", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThan(String value) {
            addCriterion("r_name >", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThanOrEqualTo(String value) {
            addCriterion("r_name >=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThan(String value) {
            addCriterion("r_name <", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThanOrEqualTo(String value) {
            addCriterion("r_name <=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLike(String value) {
            addCriterion("r_name like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotLike(String value) {
            addCriterion("r_name not like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameIn(List<String> values) {
            addCriterion("r_name in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotIn(List<String> values) {
            addCriterion("r_name not in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameBetween(String value1, String value2) {
            addCriterion("r_name between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotBetween(String value1, String value2) {
            addCriterion("r_name not between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRTitleIsNull() {
            addCriterion("r_title is null");
            return (Criteria) this;
        }

        public Criteria andRTitleIsNotNull() {
            addCriterion("r_title is not null");
            return (Criteria) this;
        }

        public Criteria andRTitleEqualTo(String value) {
            addCriterion("r_title =", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotEqualTo(String value) {
            addCriterion("r_title <>", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleGreaterThan(String value) {
            addCriterion("r_title >", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleGreaterThanOrEqualTo(String value) {
            addCriterion("r_title >=", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleLessThan(String value) {
            addCriterion("r_title <", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleLessThanOrEqualTo(String value) {
            addCriterion("r_title <=", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleLike(String value) {
            addCriterion("r_title like", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotLike(String value) {
            addCriterion("r_title not like", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleIn(List<String> values) {
            addCriterion("r_title in", values, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotIn(List<String> values) {
            addCriterion("r_title not in", values, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleBetween(String value1, String value2) {
            addCriterion("r_title between", value1, value2, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotBetween(String value1, String value2) {
            addCriterion("r_title not between", value1, value2, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRDataIsNull() {
            addCriterion("r_data is null");
            return (Criteria) this;
        }

        public Criteria andRDataIsNotNull() {
            addCriterion("r_data is not null");
            return (Criteria) this;
        }

        public Criteria andRDataEqualTo(String value) {
            addCriterion("r_data =", value, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataNotEqualTo(String value) {
            addCriterion("r_data <>", value, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataGreaterThan(String value) {
            addCriterion("r_data >", value, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataGreaterThanOrEqualTo(String value) {
            addCriterion("r_data >=", value, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataLessThan(String value) {
            addCriterion("r_data <", value, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataLessThanOrEqualTo(String value) {
            addCriterion("r_data <=", value, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataLike(String value) {
            addCriterion("r_data like", value, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataNotLike(String value) {
            addCriterion("r_data not like", value, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataIn(List<String> values) {
            addCriterion("r_data in", values, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataNotIn(List<String> values) {
            addCriterion("r_data not in", values, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataBetween(String value1, String value2) {
            addCriterion("r_data between", value1, value2, "rData");
            return (Criteria) this;
        }

        public Criteria andRDataNotBetween(String value1, String value2) {
            addCriterion("r_data not between", value1, value2, "rData");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNull() {
            addCriterion("r_time is null");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNotNull() {
            addCriterion("r_time is not null");
            return (Criteria) this;
        }

        public Criteria andRTimeEqualTo(String value) {
            addCriterion("r_time =", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotEqualTo(String value) {
            addCriterion("r_time <>", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThan(String value) {
            addCriterion("r_time >", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThanOrEqualTo(String value) {
            addCriterion("r_time >=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThan(String value) {
            addCriterion("r_time <", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThanOrEqualTo(String value) {
            addCriterion("r_time <=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLike(String value) {
            addCriterion("r_time like", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotLike(String value) {
            addCriterion("r_time not like", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeIn(List<String> values) {
            addCriterion("r_time in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotIn(List<String> values) {
            addCriterion("r_time not in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeBetween(String value1, String value2) {
            addCriterion("r_time between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotBetween(String value1, String value2) {
            addCriterion("r_time not between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRStateIsNull() {
            addCriterion("r_state is null");
            return (Criteria) this;
        }

        public Criteria andRStateIsNotNull() {
            addCriterion("r_state is not null");
            return (Criteria) this;
        }

        public Criteria andRStateEqualTo(Integer value) {
            addCriterion("r_state =", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotEqualTo(Integer value) {
            addCriterion("r_state <>", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThan(Integer value) {
            addCriterion("r_state >", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_state >=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThan(Integer value) {
            addCriterion("r_state <", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThanOrEqualTo(Integer value) {
            addCriterion("r_state <=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateIn(List<Integer> values) {
            addCriterion("r_state in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotIn(List<Integer> values) {
            addCriterion("r_state not in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateBetween(Integer value1, Integer value2) {
            addCriterion("r_state between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotBetween(Integer value1, Integer value2) {
            addCriterion("r_state not between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andRDepartmentIsNull() {
            addCriterion("r_department is null");
            return (Criteria) this;
        }

        public Criteria andRDepartmentIsNotNull() {
            addCriterion("r_department is not null");
            return (Criteria) this;
        }

        public Criteria andRDepartmentEqualTo(String value) {
            addCriterion("r_department =", value, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentNotEqualTo(String value) {
            addCriterion("r_department <>", value, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentGreaterThan(String value) {
            addCriterion("r_department >", value, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("r_department >=", value, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentLessThan(String value) {
            addCriterion("r_department <", value, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentLessThanOrEqualTo(String value) {
            addCriterion("r_department <=", value, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentLike(String value) {
            addCriterion("r_department like", value, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentNotLike(String value) {
            addCriterion("r_department not like", value, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentIn(List<String> values) {
            addCriterion("r_department in", values, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentNotIn(List<String> values) {
            addCriterion("r_department not in", values, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentBetween(String value1, String value2) {
            addCriterion("r_department between", value1, value2, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRDepartmentNotBetween(String value1, String value2) {
            addCriterion("r_department not between", value1, value2, "rDepartment");
            return (Criteria) this;
        }

        public Criteria andRManagernameIsNull() {
            addCriterion("r_managername is null");
            return (Criteria) this;
        }

        public Criteria andRManagernameIsNotNull() {
            addCriterion("r_managername is not null");
            return (Criteria) this;
        }

        public Criteria andRManagernameEqualTo(String value) {
            addCriterion("r_managername =", value, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameNotEqualTo(String value) {
            addCriterion("r_managername <>", value, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameGreaterThan(String value) {
            addCriterion("r_managername >", value, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameGreaterThanOrEqualTo(String value) {
            addCriterion("r_managername >=", value, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameLessThan(String value) {
            addCriterion("r_managername <", value, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameLessThanOrEqualTo(String value) {
            addCriterion("r_managername <=", value, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameLike(String value) {
            addCriterion("r_managername like", value, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameNotLike(String value) {
            addCriterion("r_managername not like", value, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameIn(List<String> values) {
            addCriterion("r_managername in", values, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameNotIn(List<String> values) {
            addCriterion("r_managername not in", values, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameBetween(String value1, String value2) {
            addCriterion("r_managername between", value1, value2, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRManagernameNotBetween(String value1, String value2) {
            addCriterion("r_managername not between", value1, value2, "rManagername");
            return (Criteria) this;
        }

        public Criteria andRReasonIsNull() {
            addCriterion("r_reason is null");
            return (Criteria) this;
        }

        public Criteria andRReasonIsNotNull() {
            addCriterion("r_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRReasonEqualTo(String value) {
            addCriterion("r_reason =", value, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonNotEqualTo(String value) {
            addCriterion("r_reason <>", value, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonGreaterThan(String value) {
            addCriterion("r_reason >", value, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonGreaterThanOrEqualTo(String value) {
            addCriterion("r_reason >=", value, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonLessThan(String value) {
            addCriterion("r_reason <", value, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonLessThanOrEqualTo(String value) {
            addCriterion("r_reason <=", value, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonLike(String value) {
            addCriterion("r_reason like", value, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonNotLike(String value) {
            addCriterion("r_reason not like", value, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonIn(List<String> values) {
            addCriterion("r_reason in", values, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonNotIn(List<String> values) {
            addCriterion("r_reason not in", values, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonBetween(String value1, String value2) {
            addCriterion("r_reason between", value1, value2, "rReason");
            return (Criteria) this;
        }

        public Criteria andRReasonNotBetween(String value1, String value2) {
            addCriterion("r_reason not between", value1, value2, "rReason");
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