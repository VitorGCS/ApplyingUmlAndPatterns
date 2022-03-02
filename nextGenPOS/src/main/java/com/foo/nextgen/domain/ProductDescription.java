package com.foo.nextgen.domain;

public class ProductDescription {
	private ItemID id;
	private Money price;
	private String description;
	
	public ProductDescription(ItemID id, Money price, String description) {
		super();
		this.id = id;
		this.price = price;
		this.description = description;
	}

	public ItemID getId() {
		return id;
	}

	public Money getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}
	
}
