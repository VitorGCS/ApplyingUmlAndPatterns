package com.foo.nextgen.domain;

public class Money {
	private int value;
	private String currency;
	
	public Money() {
		
	}
	
	public Money(int value) {
		this.value = value;
		this.currency = "EUR";
	}
	
	public Money(int value, String currency) {
		this.value = value;
		this.currency = currency;
	}
	
	public Money times(int quantity) {
		this.value *=quantity;
		return this;
		
	}

	
	public String getCurrency() {
		return currency;
	}

	//Ignoring the currency 
	public void add(Money subtotal) {
		this.value += subtotal.value;
		
	}

	public Money minus(Money payment) {
		this.value -= payment.value;
		return this;
	}

}
