package com.foo.nextgen.domain;

public class SalesLineItem {
	private int quantity;
	private ProductDescription description;
	
	public SalesLineItem(ProductDescription description, int quantity) {
		this.quantity = quantity;
		this.description = description;
	}
	
	public Money getSubtotal() {
		return description.getPrice().times(quantity);	
	}
	
}
