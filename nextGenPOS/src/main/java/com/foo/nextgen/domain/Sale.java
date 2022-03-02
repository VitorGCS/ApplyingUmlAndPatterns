package com.foo.nextgen.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sale {
	private List<SalesLineItem> lineItems = new ArrayList<SalesLineItem>();

	private Date date = new Date();
	private boolean isComplete = false;
	private Payment payment;

	public Money getBalance() {
		return payment.getAmount().minus(getTotal());
	}

	public void becomeComplete() {
		this.isComplete = true;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void makeLineItem(ProductDescription desc, int quantity) {
		lineItems.add( new SalesLineItem(desc, quantity));
	}

	public Money getTotal() {
		Money total = new Money();
		Money subtotal = null;

		for (SalesLineItem lineItem : lineItems) {
			subtotal = lineItem.getSubtotal();
			total.add(subtotal);
		}
		return total;
	}

	public void makePayment(Money cashTendered) {
		payment = new Payment(cashTendered);
	}

}
