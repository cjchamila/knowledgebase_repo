package com.chamila.kb.lsp.before;

import java.util.ArrayList;
import java.util.List;


public class ProductUtils {
	
public static void main(String[] args) {
	Product product1=new Product("P001", "Bag", 3000.00);
	Product product2=new Product("P002", "Shoes", 8000.00);
	Product product3=new InHouseProduct("P003", "Windows OS", 25000.00);
	Product product4=new InHouseProduct("P004", "Mac OS", 25000.00);
	
	List<Product>products = new ArrayList<>();
	products.add(product1);
	products.add(product2);
	products.add(product3);
	products.add(product4);
	
	for(Product product : products) {
		if (product instanceof InHouseProduct) {
			System.out.println("Discount for "+product.getProductName()+" : "+((InHouseProduct) product).getSpecialDiscount());
		}else {
		System.out.println("Discount for "+product.getProductName()+" : "+product.getDiscount());
		}
	}
}

}
