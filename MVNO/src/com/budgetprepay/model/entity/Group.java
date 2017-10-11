package com.budgetprepay.model.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.budgetprepay.model.upgrade.DatabaseConstants;

@Entity
@Table(name=DatabaseConstants.TBL_GROUPS)
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id 
	@Column(name=DatabaseConstants.COL_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(final Long id) {
		this.id = id;
	}
	
	@Column(name=DatabaseConstants.COL_NAME, nullable=false, unique=true)
	private String name;
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	
	@Column(name=DatabaseConstants.COL_DISPLAY, nullable=false)
	private String display;
	public String getDisplay() {
		return display;
	}
	public void setDisplay(final String display) {
		this.display = display;
	}
	
	@Column(name=DatabaseConstants.COL_ACCOUNT_NUMBER, nullable=false, unique=true)
	private String accountNumber;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(final String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name = DatabaseConstants.TBL_GROUP_CLASS_OF_SERVICE, joinColumns = { 
	@JoinColumn(name = DatabaseConstants.COL_GROUP_ID) }, inverseJoinColumns = { 
	@JoinColumn(name = DatabaseConstants.COL_CLASS_OF_SERVICE_ID) })
	private Set<ClassOfService> classOfServices = new HashSet<ClassOfService>(0);
	public Set<ClassOfService> getClassOfServices() {
		return this.classOfServices;
	}
	public void setClassOfServices(Set<ClassOfService> classOfServices) {
		this.classOfServices = classOfServices;
	}

	@Column(name=DatabaseConstants.COL_RESELLER_ID)
	private Integer resellerId = 0;
	public Integer getResellerId() {
		return resellerId;
	}
	public void setRellerId(final Integer resellerId) {
		this.resellerId = resellerId;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
		.append(id)
		.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if( obj == null ) return false;
		if( this == obj ) return true;
		if( getClass() != obj.getClass() ) return false;

		Group rhs = (Group) obj;
        
		return new EqualsBuilder()
		.append(this.id, rhs.id)
		.isEquals();
	}
}
