package com.smartdubai.billingsystem.services;

import java.util.List;

import com.smartdubai.billingsystem.domain.Customer;
import com.smartdubai.billingsystem.domain.CustomerType;
import com.smartdubai.billingsystem.domain.Item;

/**
 * <p> BillCalculatorServiceImpl class acts as an implementation layer to calculate the total amount for the retail billing system.  </p>
 * @author Vishnu Priya on 15-09-2018
 *
 */
public class BillCalculatorServiceImpl implements BillCalculatorService {

	private static final int DISCOUNT_PER_HUNDRED = 5;

	/**
	 * This method calculates the discount for each item and also calculates the total discounted amount for each item of the online retail store.
	 * @param customer is an object which contains the customer info.
	 * @param items is the list of items which are available in the online retail store.
	 */
	public double calculateTotalPayableAmount(Customer customer, List<Item> items) {
		double totalDiscountedPrice = 0;
		double discountPercentage = getDiscountPercentageForCustomer(customer);
		for(Item item:items) {
			totalDiscountedPrice = totalDiscountedPrice + item.getDiscountedPrice(discountPercentage);
		}		 
		return Math.round(totalDiscountedPrice - getDiscountBasedOnTotalAmount(totalDiscountedPrice));
	}


	/**
	 * This method calculates the discount as percentage based on the customer type.
	 * @param customer is an object which contains the customer info.
	 * @return
	 */
	private double getDiscountPercentageForCustomer(Customer customer) {
		CustomerType customerType = customer.getCustomerType();
		if(customerType == CustomerType.AFFILIATE || customerType == CustomerType.EMPLOYEE || customer.isAvailableForLoyaltyDiscount()) {
			return customerType.getDiscountPercentage();
		}
		return 0;
	}
	
	/**
	 * This method calculates the discount as a total amount. 
	 * @param totalDiscountedPrice is the amount calculated based on the discount percentage and number of items.
	 * @return
	 */
	private double getDiscountBasedOnTotalAmount(double totalDiscountedPrice) {
		return Math.floor(totalDiscountedPrice / 100) * DISCOUNT_PER_HUNDRED;
	}
}
