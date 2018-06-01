package com.techelevator.shoppingcart;

public class ShoppingCart {
	int totalNumberOfItems = 0;
	double totalAmountOwed = 0.0;
	
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}
	
	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	
	public int getTotalNumberOfItems() {
		return this.totalNumberOfItems;
	}
	
	public double getTotalAmountOwed() {
		return this.totalAmountOwed;
	}
	
	public double getAveragePricePerItem() {
		if (this.getTotalNumberOfItems() == 0) {
			return 0.00;
		}
		return this.totalAmountOwed / this.totalNumberOfItems;
	}
	
	public void addItems(int numberOfItems, double pricePerItem) {
		int num = this.getTotalNumberOfItems();
		setTotalNumberOfItems(num + numberOfItems);
		double num2 = this.getTotalAmountOwed();
		double cashMoney = numberOfItems * pricePerItem;
		setTotalAmountOwed(num2 + cashMoney);
	}
	
	public void empty() {
		setTotalNumberOfItems(0);
		setTotalAmountOwed(0);
	}
	

//	| Attribute | Data Type | Get | Set | Description |
//	|----------|-----------|-----|-----|-------------|
//	| totalNumberOfItems | int | X | X | The number of items in the shopping cart.  |
//	| totalAmountOwed | double | X | X | The total amount owed. |
//
//	**Notes**
//	- All shopping carts have total 0 items and 0.0 amount owed by default.
//
//	### Methods
//
//	    public double getAveragePricePerItem()
//	    public void addItems(int numberOfItems, double pricePerItem)
//	    public void empty()
//
//	**Notes**
//	- `getAveragePricePerItem()` returns the result of `totalAmountOwed / totalNumberOfItems`.
//	- `addItems(int numberOfItems, double pricePerItem)` updates `totalNumberOfItems` and increases `totalAmountOwed` by `(pricePerItem * numberOfItems)`
//	- `empty()` resets `totalNumberOfItems` to 0 and `totalAmountOwed` to 0.0.
//	
}
