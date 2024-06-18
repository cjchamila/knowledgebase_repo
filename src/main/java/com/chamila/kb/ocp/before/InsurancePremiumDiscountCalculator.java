package com.chamila.kb.ocp.before;

public class InsurancePremiumDiscountCalculator {//Violates "closed for modification"
	
	public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
	
	public int calculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}

}
