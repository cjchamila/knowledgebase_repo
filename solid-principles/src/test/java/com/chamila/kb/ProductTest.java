package com.chamila.kb.lsp.after;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void getDiscountTest() {
		//given
		Product product1=new Product("P001", "Bag", 4000);
		Product product2=new InHouseProduct("P002", "Computer", 200000);
		
		//when
		double productPrice1=product1.getProductPrice();
		double productPrice2=product2.getProductPrice();
		double normalDiscount = product1.getDiscount();
		double specialDiscount = product2.getDiscount();
		
		//then
		assertAll(
			()->assertEquals(productPrice1 * 0.15, normalDiscount),
			()->assertEquals(productPrice2 * 0.30, specialDiscount)
				);
	}

}
