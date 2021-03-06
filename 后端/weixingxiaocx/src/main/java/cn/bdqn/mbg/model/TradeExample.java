package cn.bdqn.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public TradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
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
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
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

        public Criteria andTradeIdIsNull() {
            addCriterion("trade_ID is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("trade_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(Integer value) {
            addCriterion("trade_ID =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(Integer value) {
            addCriterion("trade_ID <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(Integer value) {
            addCriterion("trade_ID >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_ID >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(Integer value) {
            addCriterion("trade_ID <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("trade_ID <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<Integer> values) {
            addCriterion("trade_ID in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<Integer> values) {
            addCriterion("trade_ID not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(Integer value1, Integer value2) {
            addCriterion("trade_ID between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_ID not between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(Integer value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(Integer value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(Integer value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(Integer value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<Integer> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<Integer> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(Integer value1, Integer value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradePatternIsNull() {
            addCriterion("trade_pattern is null");
            return (Criteria) this;
        }

        public Criteria andTradePatternIsNotNull() {
            addCriterion("trade_pattern is not null");
            return (Criteria) this;
        }

        public Criteria andTradePatternEqualTo(Integer value) {
            addCriterion("trade_pattern =", value, "tradePattern");
            return (Criteria) this;
        }

        public Criteria andTradePatternNotEqualTo(Integer value) {
            addCriterion("trade_pattern <>", value, "tradePattern");
            return (Criteria) this;
        }

        public Criteria andTradePatternGreaterThan(Integer value) {
            addCriterion("trade_pattern >", value, "tradePattern");
            return (Criteria) this;
        }

        public Criteria andTradePatternGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_pattern >=", value, "tradePattern");
            return (Criteria) this;
        }

        public Criteria andTradePatternLessThan(Integer value) {
            addCriterion("trade_pattern <", value, "tradePattern");
            return (Criteria) this;
        }

        public Criteria andTradePatternLessThanOrEqualTo(Integer value) {
            addCriterion("trade_pattern <=", value, "tradePattern");
            return (Criteria) this;
        }

        public Criteria andTradePatternIn(List<Integer> values) {
            addCriterion("trade_pattern in", values, "tradePattern");
            return (Criteria) this;
        }

        public Criteria andTradePatternNotIn(List<Integer> values) {
            addCriterion("trade_pattern not in", values, "tradePattern");
            return (Criteria) this;
        }

        public Criteria andTradePatternBetween(Integer value1, Integer value2) {
            addCriterion("trade_pattern between", value1, value2, "tradePattern");
            return (Criteria) this;
        }

        public Criteria andTradePatternNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_pattern not between", value1, value2, "tradePattern");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIsNull() {
            addCriterion("trade_money is null");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIsNotNull() {
            addCriterion("trade_money is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyEqualTo(BigDecimal value) {
            addCriterion("trade_money =", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("trade_money <>", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyGreaterThan(BigDecimal value) {
            addCriterion("trade_money >", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_money >=", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyLessThan(BigDecimal value) {
            addCriterion("trade_money <", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_money <=", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIn(List<BigDecimal> values) {
            addCriterion("trade_money in", values, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("trade_money not in", values, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_money between", value1, value2, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_money not between", value1, value2, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradePIsNull() {
            addCriterion("trade_p is null");
            return (Criteria) this;
        }

        public Criteria andTradePIsNotNull() {
            addCriterion("trade_p is not null");
            return (Criteria) this;
        }

        public Criteria andTradePEqualTo(Integer value) {
            addCriterion("trade_p =", value, "tradeP");
            return (Criteria) this;
        }

        public Criteria andTradePNotEqualTo(Integer value) {
            addCriterion("trade_p <>", value, "tradeP");
            return (Criteria) this;
        }

        public Criteria andTradePGreaterThan(Integer value) {
            addCriterion("trade_p >", value, "tradeP");
            return (Criteria) this;
        }

        public Criteria andTradePGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_p >=", value, "tradeP");
            return (Criteria) this;
        }

        public Criteria andTradePLessThan(Integer value) {
            addCriterion("trade_p <", value, "tradeP");
            return (Criteria) this;
        }

        public Criteria andTradePLessThanOrEqualTo(Integer value) {
            addCriterion("trade_p <=", value, "tradeP");
            return (Criteria) this;
        }

        public Criteria andTradePIn(List<Integer> values) {
            addCriterion("trade_p in", values, "tradeP");
            return (Criteria) this;
        }

        public Criteria andTradePNotIn(List<Integer> values) {
            addCriterion("trade_p not in", values, "tradeP");
            return (Criteria) this;
        }

        public Criteria andTradePBetween(Integer value1, Integer value2) {
            addCriterion("trade_p between", value1, value2, "tradeP");
            return (Criteria) this;
        }

        public Criteria andTradePNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_p not between", value1, value2, "tradeP");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNull() {
            addCriterion("trade_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(Date value) {
            addCriterion("trade_time =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<Date> values) {
            addCriterion("trade_time in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<Date> values) {
            addCriterion("trade_time not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(Date value1, Date value2) {
            addCriterion("trade_time between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("trade_time not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table trade
     *
     * @mbggenerated do_not_delete_during_merge Mon May 25 11:08:02 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table trade
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
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