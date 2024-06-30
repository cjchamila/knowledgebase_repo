package com.chamila.kb.ocp.after;

/*OPEN CLOSED PRINCIPLE : 
Software components should be closed for modification, but open for extension*/

public class InsurancePremiumDiscountCalculator {

	public int calculatePremiumDiscountPercent(CustomerProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
}
