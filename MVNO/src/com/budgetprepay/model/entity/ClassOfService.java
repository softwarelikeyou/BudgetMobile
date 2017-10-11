package com.budgetprepay.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.budgetprepay.model.upgrade.DatabaseConstants;

@Entity
@Table(name=DatabaseConstants.TBL_CLASS_OF_SERVICE)
public class ClassOfService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name=DatabaseConstants.COL_ID)
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
	
	@Column(name=DatabaseConstants.COL_RATE_PLAN, nullable=false)
	private String ratePlan;
	public String getRatePlan() {
		return ratePlan;
	}
	public void setRatePlan(final String ratePlan) {
		this.ratePlan = ratePlan;
	}

	@Column(name=DatabaseConstants.COL_ENABLED, nullable=false)
	private boolean enabled = true;
	public boolean isEnabled() {
		return enabled;
	}
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(final boolean enabled) {
		this.enabled = enabled;
	}
	
	@Transient
	protected Boolean selected = false;
	public Boolean getSelected() {
		return selected;
	}
	public void setSelected(Boolean selected) {
		this.selected = selected;
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

		ClassOfService rhs = (ClassOfService) obj;
        
		return new EqualsBuilder()
		.append(this.id, rhs.id)
		.isEquals();
	}
}