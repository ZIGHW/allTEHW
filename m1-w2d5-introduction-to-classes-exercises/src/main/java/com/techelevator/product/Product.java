package com.techelevator.product;

public class Product {

	private String name;
	private double price;
	private double weightInOunces;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public void setWeightInOunces(double weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getWeightInOunces() {
		return weightInOunces;
	}
	
//	| Attribute | Data Type | Get | Set | Description |
//	|----------|-----------|-----|-----|-------------|
//	| name | String | X | X | The name of the product.  |
//	| price | double | X | X | The price of the product. |
//	| weightInOunces | double | X | X | The weight (in ounces) of the product. |
//
//	### Methods
//
//	**Notes**
//	- There are no additional methods beyond the basic getters and setters.
//
//	### Constructors
//
//	The `Product` uses the default constructor.
	
}
