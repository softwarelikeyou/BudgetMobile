package com.budgetprepay.model.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.budgetprepay.model.upgrade.DatabaseConstants;

@Entity
@Table(name=DatabaseConstants.TBL_USERS)
public class User implements UserDetails {
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
	
	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name=DatabaseConstants.COL_GROUP_ID, nullable=false)
	private Group group;
	public Group getGroup() {
	   return group;
	}
	public void setGroup(final Group group) {
		this.group = group;
	}
	
	@Column(name=DatabaseConstants.COL_USERNAME, nullable=false, unique=true)
	private String username;
	@Override
	public String getUsername() {
		return username;
	}
	public void setUsername(final String username) {
		this.username = username;
	}
	
	@Column(name=DatabaseConstants.COL_PASSWORD, nullable=false)
	private String password = "password";
	@Override
	public String getPassword() {
	   return password;
	}
	public void setPassword(final String password) {
		this.password = password;
	}
	
	@Column(name=DatabaseConstants.COL_EMAIL, nullable=false)
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	
	@Column(name=DatabaseConstants.COL_DISPLAY, nullable=false)
	private String display;
	public String getDisplay() {
		return display;
	}
	public void setDisplay(final String display) {
		this.display = display;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Column(name=DatabaseConstants.COL_ENABLED, nullable=false)
	private boolean enabled = true;
	@Override
	public boolean isEnabled() {
		return enabled;
	}
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(final boolean enabled) {
		this.enabled = enabled;
	}
	@Override
	public boolean isAccountNonExpired() {
		return enabled;
	}
	@Override
	public boolean isAccountNonLocked() {
		return enabled;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return enabled;
	}

	public enum UserType {
		ADMINISTRATOR, 
		SALES, 
		READ_ONLY;
		
		public static UserType get(final String type) {
			for (UserType userType : UserType.values()) {
			   if (userType.toString().equals(type)) 
				   return userType;
			}
			return null;
		}
	}
	@Enumerated(EnumType.STRING)
	@Column(name=DatabaseConstants.COL_USERTYPE, nullable=false)
	private UserType type = UserType.SALES;
	public UserType getType() {
		return type;
	}
	public void setType(final UserType type) {
		this.type = type;
	}
	
	public boolean isAdministrator() { 
		return UserType.ADMINISTRATOR.equals(type);
	}

	public boolean isSales() { 
		return UserType.SALES.equals(type);
	}
	
	public boolean isReadonly() { 
		return UserType.READ_ONLY.equals(type);
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

		User rhs = (User) obj;
        
		return new EqualsBuilder()
		.append(this.id, rhs.id)
		.isEquals();
	}
}