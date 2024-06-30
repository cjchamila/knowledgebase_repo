package com.chamila.kb.ocp.before;

/*OPEN CLOSED PRINCIPLE : 
* SOFTWARE COMPONENTS SHOULD BE OPEN FOR EXTENSION BUT CLOSED FOR MODIFICATION
* */

/*THIS CODE VIOLATES THE 'CLOSED FOR MODIFICATION' CONCEPT :
EVERY TIME A NEW TYPE OF PROFILE IS INTRODUCED, THIS CODE HAS TO BE CHANGED*/

public class InsurancePremiumDiscountCalculator {
	
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
