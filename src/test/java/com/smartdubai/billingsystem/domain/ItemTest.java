package com.smartdubai.billingsystem.domain;

import org.junit.Assert;
import org.junit.Test;

import com.smartdubai.billingsystem.base.RetailBillingSystemBaseTest;

public class ItemTest {	
	
	@Test
	public void shouldGetNoDiscountForNonDiscountableProduct() {
		Product product = RetailBillingSystemBaseTest.getNonDiscountableProduct();
		Item item = new Item(product, 4);
		Assert.assertEquals(199.96, item.getDiscountedPrice(5), 0);
	}
	
	@Test
	public void shouldGetDiscountedPriceForDiscountableProduct() {
		Product product = RetailBillingSystemBaseTest.getDiscountableProduct();
		Item item = new Item(product, 4);
		Assert.assertEquals(220.36, item.getDiscountedPrice(5), 0.1);
	}
	
	@Test
	public void shouldGetNoDiscountForZeroDiscountPercentage() {
		Product product = RetailBillingSystemBaseTest.getDiscountableProduct();
		Item item = new Item(product, 4);
		Assert.assertEquals(231.96, item.getDiscountedPrice(0), 0);
		
	}

}
