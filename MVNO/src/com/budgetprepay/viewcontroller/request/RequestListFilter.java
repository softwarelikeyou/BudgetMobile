package com.budgetprepay.viewcontroller.request;

import com.budgetprepay.model.entity.Request;
import com.budgetprepay.viewcontroller.filter.AbstractListFilter;

public class RequestListFilter extends AbstractListFilter<Request> {

	@Override
	protected Class<?> getListClass() {
		return Request.class;
	}

}
