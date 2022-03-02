package com.foo.nextgen.domain;

public class Register {

	private ProductCatalog catalog;
	private Sale currentSale;
	
	public Register(ProductCatalog catalog) {
		this.catalog = catalog;
	}
	
	public void endSale() {
		currentSale.becomeComplete();
	}
	
	public void enterItem(ItemID id, int quantity) {
		ProductDescription desc = catalog.getDescriptions(id);
		currentSale.makeLineItem(desc, quantity);
	}
	
	public void makeNewSale() {
		currentSale = new Sale();
	}
	
	public void makePayment(Money cashTendered) {
		currentSale.makePayment(cashTendered);
	}

}

