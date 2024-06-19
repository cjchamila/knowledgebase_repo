package com.chamila.kb.lsp.after;

public class Product {
	
	protected String productCode;
	
	protected double productPrice;
	
	protected String productName;
	
	protected double discount;	
	
	public Product() {}		
	
	public Product(String productCode, String productName,double productPrice) {
		super();
		this.productCode = productCode;
		this.productName = productName;		
		this.productPrice = productPrice;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getDiscount() {
		discount = this.productPrice * 0.15;
		return discount;
	}
	
	public double getProductPrice() {
		return this.productPrice;
	}
	

}
