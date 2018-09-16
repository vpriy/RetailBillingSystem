package com.smartdubai.billingsystem.domain;

/**
 * <p> Item class is a bean which contains the product entity, its quantity and its total cost related information.  </p>
 * @author Vishnu Priya on 15-09-2018
 *
 */
public class Item {
	
	private Product product;
	
	private int quantity;
	
	private double totalCost;
	
	public Item(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.totalCost = product.getPrice() * quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double getTotalCost(){
		return totalCost; 
	}

	public double getDiscountedPrice(double discountPercentage) {
		if(product.isDiscountable() && discountPercentage != 0 ) {
			return (totalCost - totalCost * discountPercentage/100);
		}
		return totalCost;
	}

}
