package com.smartdubai.billingsystem.domain;

/**
 * <p> Product class is a bean which contains the product entity, its quantity and its total cost related information.  </p>
 * @author Vishnu Priya on 15-09-2018
 *
 */
public class Product {
	
	private String name;
	
	private String sku;
	
	private boolean isDiscountable;
	
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public boolean isDiscountable() {
		return isDiscountable;
	}

	public void setDiscountable(boolean isDiscountable) {
		this.isDiscountable = isDiscountable;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
