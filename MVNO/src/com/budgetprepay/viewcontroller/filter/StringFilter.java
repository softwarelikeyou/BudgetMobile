package com.budgetprepay.viewcontroller.filter;

public class StringFilter implements Filter<String> {

	static final long serialVersionUID = 1L;
	
	protected String value;
	protected StringFilterType filterType;
	protected Boolean caseSensitive = false;
	protected Boolean allowNull = false;
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public StringFilterType getFilterType() {
		return filterType;
	}
	
	public void setFilterType(StringFilterType filterType) {
		this.filterType = filterType;
	}
	
	public Boolean getCaseSensitive() {
		return caseSensitive;
	}
	
	public void setCaseSensitive(Boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}
	
	public Boolean getAllowNull() {
		return allowNull;
	}
	
	public void setAllowNull(Boolean allowNull) {
		this.allowNull = allowNull;
	}
	
	public boolean matches(Object obj) { 
		
		if( obj == null ) return allowNull ? true : false;
		
		if( !(obj instanceof String) ) { 
			throw new IllegalArgumentException("object:" + obj + " of type:" + obj.getClass().getName() + "; expected type: " + String.class.getName());
		}
		
		String string = (String) obj;
		String match = value;
		
		if( !caseSensitive ) {
			string = string.toLowerCase();
			match = value.toLowerCase();
		}
		
		switch(filterType) { 
			case STARTS_WITH: return string.startsWith(match);
			case ENDS_WITH: return string.endsWith(match);
			case CONTAINS: return string.matches(".*" + match + ".*");
			default: return false;
		}
		
	}
	
}
