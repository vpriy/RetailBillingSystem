package com.smartdubai.billingsystem.domain;


/**
 * <p> CustomerType class is an enum which defines whether the customer type is affliate or an employee or a customer.  </p>
 * @author Vishnu Priya on 15-09-2018
 *
 */
public enum CustomerType {
	
	AFFILIATE(10),EMPLOYEE(30),CUSTOMER(5);
	
	private double discountPercentage;
	
	CustomerType(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public double getDiscountPercentage() {
		return discountPercentage;
	}

}
