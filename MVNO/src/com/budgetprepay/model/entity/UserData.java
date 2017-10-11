package com.budgetprepay.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.budgetprepay.model.upgrade.DatabaseConstants;

@Entity
@Table(name=DatabaseConstants.TBL_USERDATA)
@XmlRootElement(name="userData")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id 
	@Column(name=DatabaseConstants.COL_USER_ID)
	@XmlAttribute(name="userId")
	private Long userId;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(final Long userId) {
		this.userId = userId;
	}
	
	@Id
	@Column(name=DatabaseConstants.COL_PROPERTY, nullable=false)
	private String property;
	public String getProperty() {
		return property;
	}
	public void setProperty(final String property) {
		this.property = property;
	}
	
	@Column(name=DatabaseConstants.COL_VALUE)
	private String value;
	public String getValue() {
		return value;
	}
	public void setValue(final String value) {
		this.value = value;
	}
}