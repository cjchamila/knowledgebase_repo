package com.chamila.kb.lsp.after;

/*Pattern 2 : 'Don't ask, Tell' - override getDiscount method and call other method from within. 
 * With this change removed the instanceof check in ProductUtils class*/

public class InHouseProduct extends Product{	
	
	public InHouseProduct(String productCode, String productName, double productPrice) {
		super(productCode, productName, productPrice);				
	}

	public String getProductCode() {
		return productCode;
	}
	
	public String getProductName() {
		return productName;
	}
	
	@Override
	public double getDiscount() {		
		return this.getSpecialDiscount();
	}
	
	private double getSpecialDiscount() {
		return this.productPrice * 0.30 ;
	}
}
