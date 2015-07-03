package com.wirecard.ezlinkwebservices.dto;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class EMerchantDetailsDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EMerchantDetailsDtoExample() {
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

        public Criteria andMerchantNoIsNull() {
            addCriterion("MERCHANT_NO is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("MERCHANT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("MERCHANT_NO =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("MERCHANT_NO <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("MERCHANT_NO >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NO >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("MERCHANT_NO <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NO <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("MERCHANT_NO like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("MERCHANT_NO not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("MERCHANT_NO in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("MERCHANT_NO not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("MERCHANT_NO between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_NO not between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andReturnUrlIsNull() {
            addCriterion("RETURN_URL is null");
            return (Criteria) this;
        }

        public Criteria andReturnUrlIsNotNull() {
            addCriterion("RETURN_URL is not null");
            return (Criteria) this;
        }

        public Criteria andReturnUrlEqualTo(String value) {
            addCriterion("RETURN_URL =", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotEqualTo(String value) {
            addCriterion("RETURN_URL <>", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlGreaterThan(String value) {
            addCriterion("RETURN_URL >", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_URL >=", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlLessThan(String value) {
            addCriterion("RETURN_URL <", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlLessThanOrEqualTo(String value) {
            addCriterion("RETURN_URL <=", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlLike(String value) {
            addCriterion("RETURN_URL like", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotLike(String value) {
            addCriterion("RETURN_URL not like", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlIn(List<String> values) {
            addCriterion("RETURN_URL in", values, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotIn(List<String> values) {
            addCriterion("RETURN_URL not in", values, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlBetween(String value1, String value2) {
            addCriterion("RETURN_URL between", value1, value2, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotBetween(String value1, String value2) {
            addCriterion("RETURN_URL not between", value1, value2, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("IP_ADDRESS =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("IP_ADDRESS <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("IP_ADDRESS >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("IP_ADDRESS <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("IP_ADDRESS like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("IP_ADDRESS not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("IP_ADDRESS in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("IP_ADDRESS not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressValIsNull() {
            addCriterion("IP_ADDRESS_VAL is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressValIsNotNull() {
            addCriterion("IP_ADDRESS_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressValEqualTo(String value) {
            addCriterion("IP_ADDRESS_VAL =", value, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValNotEqualTo(String value) {
            addCriterion("IP_ADDRESS_VAL <>", value, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValGreaterThan(String value) {
            addCriterion("IP_ADDRESS_VAL >", value, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS_VAL >=", value, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValLessThan(String value) {
            addCriterion("IP_ADDRESS_VAL <", value, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS_VAL <=", value, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValLike(String value) {
            addCriterion("IP_ADDRESS_VAL like", value, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValNotLike(String value) {
            addCriterion("IP_ADDRESS_VAL not like", value, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValIn(List<String> values) {
            addCriterion("IP_ADDRESS_VAL in", values, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValNotIn(List<String> values) {
            addCriterion("IP_ADDRESS_VAL not in", values, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS_VAL between", value1, value2, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andIpAddressValNotBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS_VAL not between", value1, value2, "ipAddressVal");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoIsNull() {
            addCriterion("BUSINESS_REFNO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoIsNotNull() {
            addCriterion("BUSINESS_REFNO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoEqualTo(String value) {
            addCriterion("BUSINESS_REFNO =", value, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoNotEqualTo(String value) {
            addCriterion("BUSINESS_REFNO <>", value, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoGreaterThan(String value) {
            addCriterion("BUSINESS_REFNO >", value, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_REFNO >=", value, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoLessThan(String value) {
            addCriterion("BUSINESS_REFNO <", value, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_REFNO <=", value, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoLike(String value) {
            addCriterion("BUSINESS_REFNO like", value, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoNotLike(String value) {
            addCriterion("BUSINESS_REFNO not like", value, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoIn(List<String> values) {
            addCriterion("BUSINESS_REFNO in", values, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoNotIn(List<String> values) {
            addCriterion("BUSINESS_REFNO not in", values, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoBetween(String value1, String value2) {
            addCriterion("BUSINESS_REFNO between", value1, value2, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andBusinessRefnoNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_REFNO not between", value1, value2, "businessRefno");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsNull() {
            addCriterion("USER_INFO is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsNotNull() {
            addCriterion("USER_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoEqualTo(String value) {
            addCriterion("USER_INFO =", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotEqualTo(String value) {
            addCriterion("USER_INFO <>", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoGreaterThan(String value) {
            addCriterion("USER_INFO >", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_INFO >=", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoLessThan(String value) {
            addCriterion("USER_INFO <", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoLessThanOrEqualTo(String value) {
            addCriterion("USER_INFO <=", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoLike(String value) {
            addCriterion("USER_INFO like", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotLike(String value) {
            addCriterion("USER_INFO not like", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoIn(List<String> values) {
            addCriterion("USER_INFO in", values, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotIn(List<String> values) {
            addCriterion("USER_INFO not in", values, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoBetween(String value1, String value2) {
            addCriterion("USER_INFO between", value1, value2, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotBetween(String value1, String value2) {
            addCriterion("USER_INFO not between", value1, value2, "userInfo");
            return (Criteria) this;
        }

        public Criteria andAccessCodeIsNull() {
            addCriterion("ACCESS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeIsNotNull() {
            addCriterion("ACCESS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeEqualTo(String value) {
            addCriterion("ACCESS_CODE =", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotEqualTo(String value) {
            addCriterion("ACCESS_CODE <>", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeGreaterThan(String value) {
            addCriterion("ACCESS_CODE >", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_CODE >=", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeLessThan(String value) {
            addCriterion("ACCESS_CODE <", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_CODE <=", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeLike(String value) {
            addCriterion("ACCESS_CODE like", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotLike(String value) {
            addCriterion("ACCESS_CODE not like", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeIn(List<String> values) {
            addCriterion("ACCESS_CODE in", values, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotIn(List<String> values) {
            addCriterion("ACCESS_CODE not in", values, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeBetween(String value1, String value2) {
            addCriterion("ACCESS_CODE between", value1, value2, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotBetween(String value1, String value2) {
            addCriterion("ACCESS_CODE not between", value1, value2, "accessCode");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyIsNull() {
            addCriterion("HASH_SECREAT_KEY is null");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyIsNotNull() {
            addCriterion("HASH_SECREAT_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyEqualTo(String value) {
            addCriterion("HASH_SECREAT_KEY =", value, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyNotEqualTo(String value) {
            addCriterion("HASH_SECREAT_KEY <>", value, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyGreaterThan(String value) {
            addCriterion("HASH_SECREAT_KEY >", value, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyGreaterThanOrEqualTo(String value) {
            addCriterion("HASH_SECREAT_KEY >=", value, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyLessThan(String value) {
            addCriterion("HASH_SECREAT_KEY <", value, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyLessThanOrEqualTo(String value) {
            addCriterion("HASH_SECREAT_KEY <=", value, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyLike(String value) {
            addCriterion("HASH_SECREAT_KEY like", value, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyNotLike(String value) {
            addCriterion("HASH_SECREAT_KEY not like", value, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyIn(List<String> values) {
            addCriterion("HASH_SECREAT_KEY in", values, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyNotIn(List<String> values) {
            addCriterion("HASH_SECREAT_KEY not in", values, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyBetween(String value1, String value2) {
            addCriterion("HASH_SECREAT_KEY between", value1, value2, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyNotBetween(String value1, String value2) {
            addCriterion("HASH_SECREAT_KEY not between", value1, value2, "hashSecreatKey");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValIsNull() {
            addCriterion("HASH_SECREAT_KEY_VAL is null");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValIsNotNull() {
            addCriterion("HASH_SECREAT_KEY_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValEqualTo(String value) {
            addCriterion("HASH_SECREAT_KEY_VAL =", value, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValNotEqualTo(String value) {
            addCriterion("HASH_SECREAT_KEY_VAL <>", value, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValGreaterThan(String value) {
            addCriterion("HASH_SECREAT_KEY_VAL >", value, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValGreaterThanOrEqualTo(String value) {
            addCriterion("HASH_SECREAT_KEY_VAL >=", value, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValLessThan(String value) {
            addCriterion("HASH_SECREAT_KEY_VAL <", value, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValLessThanOrEqualTo(String value) {
            addCriterion("HASH_SECREAT_KEY_VAL <=", value, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValLike(String value) {
            addCriterion("HASH_SECREAT_KEY_VAL like", value, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValNotLike(String value) {
            addCriterion("HASH_SECREAT_KEY_VAL not like", value, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValIn(List<String> values) {
            addCriterion("HASH_SECREAT_KEY_VAL in", values, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValNotIn(List<String> values) {
            addCriterion("HASH_SECREAT_KEY_VAL not in", values, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValBetween(String value1, String value2) {
            addCriterion("HASH_SECREAT_KEY_VAL between", value1, value2, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andHashSecreatKeyValNotBetween(String value1, String value2) {
            addCriterion("HASH_SECREAT_KEY_VAL not between", value1, value2, "hashSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyIsNull() {
            addCriterion("ACCESS_CODE_SECREAT_KEY is null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyIsNotNull() {
            addCriterion("ACCESS_CODE_SECREAT_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY =", value, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyNotEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY <>", value, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyGreaterThan(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY >", value, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY >=", value, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyLessThan(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY <", value, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY <=", value, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyLike(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY like", value, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyNotLike(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY not like", value, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyIn(List<String> values) {
            addCriterion("ACCESS_CODE_SECREAT_KEY in", values, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyNotIn(List<String> values) {
            addCriterion("ACCESS_CODE_SECREAT_KEY not in", values, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyBetween(String value1, String value2) {
            addCriterion("ACCESS_CODE_SECREAT_KEY between", value1, value2, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyNotBetween(String value1, String value2) {
            addCriterion("ACCESS_CODE_SECREAT_KEY not between", value1, value2, "accessCodeSecreatKey");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValIsNull() {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL is null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValIsNotNull() {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL =", value, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValNotEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL <>", value, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValGreaterThan(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL >", value, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL >=", value, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValLessThan(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL <", value, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL <=", value, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValLike(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL like", value, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValNotLike(String value) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL not like", value, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValIn(List<String> values) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL in", values, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValNotIn(List<String> values) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL not in", values, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValBetween(String value1, String value2) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL between", value1, value2, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecreatKeyValNotBetween(String value1, String value2) {
            addCriterion("ACCESS_CODE_SECREAT_KEY_VAL not between", value1, value2, "accessCodeSecreatKeyVal");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltIsNull() {
            addCriterion("ACCESS_CODE_SECRET_SALT is null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltIsNotNull() {
            addCriterion("ACCESS_CODE_SECRET_SALT is not null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECRET_SALT =", value, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltNotEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECRET_SALT <>", value, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltGreaterThan(String value) {
            addCriterion("ACCESS_CODE_SECRET_SALT >", value, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECRET_SALT >=", value, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltLessThan(String value) {
            addCriterion("ACCESS_CODE_SECRET_SALT <", value, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_CODE_SECRET_SALT <=", value, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltLike(String value) {
            addCriterion("ACCESS_CODE_SECRET_SALT like", value, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltNotLike(String value) {
            addCriterion("ACCESS_CODE_SECRET_SALT not like", value, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltIn(List<String> values) {
            addCriterion("ACCESS_CODE_SECRET_SALT in", values, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltNotIn(List<String> values) {
            addCriterion("ACCESS_CODE_SECRET_SALT not in", values, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltBetween(String value1, String value2) {
            addCriterion("ACCESS_CODE_SECRET_SALT between", value1, value2, "accessCodeSecretSalt");
            return (Criteria) this;
        }

        public Criteria andAccessCodeSecretSaltNotBetween(String value1, String value2) {
            addCriterion("ACCESS_CODE_SECRET_SALT not between", value1, value2, "accessCodeSecretSalt");
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