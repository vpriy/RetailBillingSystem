package com.smartdubai.billingsystem.services;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.smartdubai.billingsystem.base.RetailBillingSystemBaseTest;
import com.smartdubai.billingsystem.domain.Customer;
import com.smartdubai.billingsystem.domain.Item;

/**
 * This is the test class for the implementation of Retail billing system.
 * @author Vishnu Priya on 15-09-2018
 *
 */

public class BillCalculatorServiceImplITest {
	
	private BillCalculatorService billCalculatorService;
	private List<Item> items;
	
	@Before
	public void setUp() {
		billCalculatorService = new BillCalculatorServiceImpl();
		items = RetailBillingSystemBaseTest.getItemListWithMultipleProducts();
	}
	
	@Test
	public void shouldCalculateBillForDiscountEligibleCustomer() {
		Customer customer = RetailBillingSystemBaseTest.getCustomerWithMoreThanTwoYearOldRegistration();
		Assert.assertEquals(761.00, billCalculatorService.calculateTotalPayableAmount(customer, items), 0);
	}
	
	@Test
	public void shouldCalculateBillForNonEligibleCustomer() {
		Customer customer = RetailBillingSystemBaseTest.getCustomerWithLessThanTwoYearOldRegistration();
		Assert.assertEquals(790.00, billCalculatorService.calculateTotalPayableAmount(customer, items), 0);
	}
	
	@Test
	public void shouldCalculateBillforAffiliateCustomer() {
		Customer affiliateCustomer = RetailBillingSystemBaseTest.getAffiliateCustomer();
		Assert.assertEquals(737.00, billCalculatorService.calculateTotalPayableAmount(affiliateCustomer, items), 0);
	}
	
	@Test
	public void shouldCalculateBillForEmployeeCustomer() {
		Customer employeeCustomer = RetailBillingSystemBaseTest.getEmployeeCustomer();
		Assert.assertEquals(626.00, billCalculatorService.calculateTotalPayableAmount(employeeCustomer, items), 0);
	}
}
