package com.smartdubai.billingsystem.services;

import java.util.List;

import com.smartdubai.billingsystem.domain.Customer;
import com.smartdubai.billingsystem.domain.Item;

/**
 * <p> BillCalculatorService class acts as an interface layer to calculate the total amount for the retail billing system.  </p>
 * @author Vishnu Priya on 15-09-2018
 *
 */
public interface BillCalculatorService {
	
	double calculateTotalPayableAmount(Customer customer, List<Item> items);

}
