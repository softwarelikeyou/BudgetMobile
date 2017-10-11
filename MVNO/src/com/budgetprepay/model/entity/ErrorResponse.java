package com.budgetprepay.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.budgetprepay.model.upgrade.DatabaseConstants;

@Entity
@Table(name=DatabaseConstants.TBL_ERROR_RESPONSES)
public class ErrorResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public ErrorResponse() {}
	
	public ErrorResponse(final String xml) {
		this.xml = xml;
	}
	
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
	
	@JoinColumn(name=DatabaseConstants.COL_CREATED, nullable=false)
	private Date created = new Date();
	public Date getCreated() {
		return created;
	}
	public void setCreate(final Date create) {
		this.created = create;
	}
	
	@Column(name=DatabaseConstants.COL_XML, nullable=true, columnDefinition="varchar(max)")
	private String xml;
	public String getXML() {
		return xml;
	}
	public void setXML(final String xml) {
		this.xml = xml;
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

		ErrorResponse rhs = (ErrorResponse) obj;
        
		return new EqualsBuilder()
		.append(this.id, rhs.id)
		.isEquals();
	}
}
