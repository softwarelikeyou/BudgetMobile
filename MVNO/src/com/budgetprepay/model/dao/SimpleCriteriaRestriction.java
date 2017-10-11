package com.budgetprepay.model.dao;

import java.util.Collection;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class SimpleCriteriaRestriction {

	public enum RestrictionType {
		EQUAL,
		GREATER_THAN_OR_EQUAL,
		GREATER_THAN,
		IN,
		IS_EMPTY,
		IS_NOT_EMPTY,
		IS_NOT_NULL,
		IS_NULL,
		LESS_THAN_OR_EQUAL,
		LIKE,
		LIKE_CASE_INSENSITIVE,
		LESS_THAN,
		NOT_EQUAL,
		IS_NOT_IN
	}
	
	protected String propertyName;
	protected Object value;
	protected RestrictionType restrictionType;
	
	protected SimpleCriteriaRestriction() {
		
	}
	
	public SimpleCriteriaRestriction(String propertyName, RestrictionType restrictionType) {
		this(propertyName, null, restrictionType);
	}
	
	public SimpleCriteriaRestriction(String propertyName, Object value, RestrictionType restrictionType) {
		this.propertyName = propertyName;
		this.value = value;
		this.restrictionType = restrictionType;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public RestrictionType getRestrictionType() {
		return restrictionType;
	}
	
	public Criterion getCriteria() {
		
		switch(restrictionType) {
			case EQUAL: return Restrictions.eq(propertyName, value);
			case GREATER_THAN_OR_EQUAL: return Restrictions.ge(propertyName, value);
			case GREATER_THAN: return Restrictions.gt(propertyName, value);
			case IN: return Restrictions.in(propertyName, (Collection<?>) value);
			case IS_EMPTY: return Restrictions.isEmpty(propertyName);
			case IS_NOT_EMPTY: return Restrictions.isNotEmpty(propertyName);
			case IS_NOT_NULL: return Restrictions.isNotNull(propertyName);
			case IS_NULL: return Restrictions.isNull(propertyName);
			case LESS_THAN: return Restrictions.lt(propertyName, value);
			case LESS_THAN_OR_EQUAL: return Restrictions.le(propertyName, value);
			case LIKE: return Restrictions.like(propertyName, value);
			case LIKE_CASE_INSENSITIVE: return Restrictions.ilike(propertyName, value);
			case NOT_EQUAL: return Restrictions.ne(propertyName, value);
			case IS_NOT_IN: return Restrictions.not( Restrictions.in(propertyName, (Collection<?>) value));
			default: throw new IllegalStateException("Restriction type has not been set");
		}
	}
}
