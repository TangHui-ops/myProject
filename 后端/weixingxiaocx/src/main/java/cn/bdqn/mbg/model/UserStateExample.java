package cn.bdqn.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserStateExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public UserStateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }
    public void andUserStateId(Integer id){

    }
    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
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

        public Criteria andUserStateIdIsNull() {
            addCriterion("user_state_id is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIdIsNotNull() {
            addCriterion("user_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateIdEqualTo(Integer value) {
            addCriterion("user_state_id =", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdNotEqualTo(Integer value) {
            addCriterion("user_state_id <>", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdGreaterThan(Integer value) {
            addCriterion("user_state_id >", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_state_id >=", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdLessThan(Integer value) {
            addCriterion("user_state_id <", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_state_id <=", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdIn(List<Integer> values) {
            addCriterion("user_state_id in", values, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdNotIn(List<Integer> values) {
            addCriterion("user_state_id not in", values, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdBetween(Integer value1, Integer value2) {
            addCriterion("user_state_id between", value1, value2, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_state_id not between", value1, value2, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserSIsNull() {
            addCriterion("user_s is null");
            return (Criteria) this;
        }

        public Criteria andUserSIsNotNull() {
            addCriterion("user_s is not null");
            return (Criteria) this;
        }

        public Criteria andUserSEqualTo(Integer value) {
            addCriterion("user_s =", value, "userS");
            return (Criteria) this;
        }

        public Criteria andUserSNotEqualTo(Integer value) {
            addCriterion("user_s <>", value, "userS");
            return (Criteria) this;
        }

        public Criteria andUserSGreaterThan(Integer value) {
            addCriterion("user_s >", value, "userS");
            return (Criteria) this;
        }

        public Criteria andUserSGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_s >=", value, "userS");
            return (Criteria) this;
        }

        public Criteria andUserSLessThan(Integer value) {
            addCriterion("user_s <", value, "userS");
            return (Criteria) this;
        }

        public Criteria andUserSLessThanOrEqualTo(Integer value) {
            addCriterion("user_s <=", value, "userS");
            return (Criteria) this;
        }

        public Criteria andUserSIn(List<Integer> values) {
            addCriterion("user_s in", values, "userS");
            return (Criteria) this;
        }

        public Criteria andUserSNotIn(List<Integer> values) {
            addCriterion("user_s not in", values, "userS");
            return (Criteria) this;
        }

        public Criteria andUserSBetween(Integer value1, Integer value2) {
            addCriterion("user_s between", value1, value2, "userS");
            return (Criteria) this;
        }

        public Criteria andUserSNotBetween(Integer value1, Integer value2) {
            addCriterion("user_s not between", value1, value2, "userS");
            return (Criteria) this;
        }

        public Criteria andUserStateDateIsNull() {
            addCriterion("user_state_date is null");
            return (Criteria) this;
        }

        public Criteria andUserStateDateIsNotNull() {
            addCriterion("user_state_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateDateEqualTo(Date value) {
            addCriterion("user_state_date =", value, "userStateDate");
            return (Criteria) this;
        }

        public Criteria andUserStateDateNotEqualTo(Date value) {
            addCriterion("user_state_date <>", value, "userStateDate");
            return (Criteria) this;
        }

        public Criteria andUserStateDateGreaterThan(Date value) {
            addCriterion("user_state_date >", value, "userStateDate");
            return (Criteria) this;
        }

        public Criteria andUserStateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("user_state_date >=", value, "userStateDate");
            return (Criteria) this;
        }

        public Criteria andUserStateDateLessThan(Date value) {
            addCriterion("user_state_date <", value, "userStateDate");
            return (Criteria) this;
        }

        public Criteria andUserStateDateLessThanOrEqualTo(Date value) {
            addCriterion("user_state_date <=", value, "userStateDate");
            return (Criteria) this;
        }

        public Criteria andUserStateDateIn(List<Date> values) {
            addCriterion("user_state_date in", values, "userStateDate");
            return (Criteria) this;
        }

        public Criteria andUserStateDateNotIn(List<Date> values) {
            addCriterion("user_state_date not in", values, "userStateDate");
            return (Criteria) this;
        }

        public Criteria andUserStateDateBetween(Date value1, Date value2) {
            addCriterion("user_state_date between", value1, value2, "userStateDate");
            return (Criteria) this;
        }

        public Criteria andUserStateDateNotBetween(Date value1, Date value2) {
            addCriterion("user_state_date not between", value1, value2, "userStateDate");
            return (Criteria) this;
        }

        public Criteria andUserStateDtIsNull() {
            addCriterion("user_state_dt is null");
            return (Criteria) this;
        }

        public Criteria andUserStateDtIsNotNull() {
            addCriterion("user_state_dt is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateDtEqualTo(Date value) {
            addCriterion("user_state_dt =", value, "userStateDt");
            return (Criteria) this;
        }

        public Criteria andUserStateDtNotEqualTo(Date value) {
            addCriterion("user_state_dt <>", value, "userStateDt");
            return (Criteria) this;
        }

        public Criteria andUserStateDtGreaterThan(Date value) {
            addCriterion("user_state_dt >", value, "userStateDt");
            return (Criteria) this;
        }

        public Criteria andUserStateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("user_state_dt >=", value, "userStateDt");
            return (Criteria) this;
        }

        public Criteria andUserStateDtLessThan(Date value) {
            addCriterion("user_state_dt <", value, "userStateDt");
            return (Criteria) this;
        }

        public Criteria andUserStateDtLessThanOrEqualTo(Date value) {
            addCriterion("user_state_dt <=", value, "userStateDt");
            return (Criteria) this;
        }

        public Criteria andUserStateDtIn(List<Date> values) {
            addCriterion("user_state_dt in", values, "userStateDt");
            return (Criteria) this;
        }

        public Criteria andUserStateDtNotIn(List<Date> values) {
            addCriterion("user_state_dt not in", values, "userStateDt");
            return (Criteria) this;
        }

        public Criteria andUserStateDtBetween(Date value1, Date value2) {
            addCriterion("user_state_dt between", value1, value2, "userStateDt");
            return (Criteria) this;
        }

        public Criteria andUserStateDtNotBetween(Date value1, Date value2) {
            addCriterion("user_state_dt not between", value1, value2, "userStateDt");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonIsNull() {
            addCriterion("user_state_reason is null");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonIsNotNull() {
            addCriterion("user_state_reason is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonEqualTo(String value) {
            addCriterion("user_state_reason =", value, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonNotEqualTo(String value) {
            addCriterion("user_state_reason <>", value, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonGreaterThan(String value) {
            addCriterion("user_state_reason >", value, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonGreaterThanOrEqualTo(String value) {
            addCriterion("user_state_reason >=", value, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonLessThan(String value) {
            addCriterion("user_state_reason <", value, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonLessThanOrEqualTo(String value) {
            addCriterion("user_state_reason <=", value, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonLike(String value) {
            addCriterion("user_state_reason like", value, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonNotLike(String value) {
            addCriterion("user_state_reason not like", value, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonIn(List<String> values) {
            addCriterion("user_state_reason in", values, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonNotIn(List<String> values) {
            addCriterion("user_state_reason not in", values, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonBetween(String value1, String value2) {
            addCriterion("user_state_reason between", value1, value2, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStateReasonNotBetween(String value1, String value2) {
            addCriterion("user_state_reason not between", value1, value2, "userStateReason");
            return (Criteria) this;
        }

        public Criteria andUserStatePIsNull() {
            addCriterion("user_state_p is null");
            return (Criteria) this;
        }

        public Criteria andUserStatePIsNotNull() {
            addCriterion("user_state_p is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatePEqualTo(Integer value) {
            addCriterion("user_state_p =", value, "userStateP");
            return (Criteria) this;
        }

        public Criteria andUserStatePNotEqualTo(Integer value) {
            addCriterion("user_state_p <>", value, "userStateP");
            return (Criteria) this;
        }

        public Criteria andUserStatePGreaterThan(Integer value) {
            addCriterion("user_state_p >", value, "userStateP");
            return (Criteria) this;
        }

        public Criteria andUserStatePGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_state_p >=", value, "userStateP");
            return (Criteria) this;
        }

        public Criteria andUserStatePLessThan(Integer value) {
            addCriterion("user_state_p <", value, "userStateP");
            return (Criteria) this;
        }

        public Criteria andUserStatePLessThanOrEqualTo(Integer value) {
            addCriterion("user_state_p <=", value, "userStateP");
            return (Criteria) this;
        }

        public Criteria andUserStatePIn(List<Integer> values) {
            addCriterion("user_state_p in", values, "userStateP");
            return (Criteria) this;
        }

        public Criteria andUserStatePNotIn(List<Integer> values) {
            addCriterion("user_state_p not in", values, "userStateP");
            return (Criteria) this;
        }

        public Criteria andUserStatePBetween(Integer value1, Integer value2) {
            addCriterion("user_state_p between", value1, value2, "userStateP");
            return (Criteria) this;
        }

        public Criteria andUserStatePNotBetween(Integer value1, Integer value2) {
            addCriterion("user_state_p not between", value1, value2, "userStateP");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_state
     *
     * @mbggenerated do_not_delete_during_merge Tue May 26 14:32:04 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
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