package com.chamila.kb.lsp.before;

public class InHouseProduct extends Product{

	public InHouseProduct(String productCode, String productName, double productPrice ){
		super(productCode, productName, productPrice);
		
	}

	public String getProductCode() {
		return productCode;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getSpecialDiscount() {
		discount = this.productPrice * 0.30 ;
		return discount;
	}
}
