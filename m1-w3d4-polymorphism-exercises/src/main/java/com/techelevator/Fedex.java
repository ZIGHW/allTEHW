package com.techelevator;

import java.math.BigDecimal;

public class Fedex implements DeliveryDriver {
	
	public BigDecimal toOz(BigDecimal weight, boolean pounds) {
		if (pounds == true) {
			weight = weight.multiply(new BigDecimal(16));
		}
		return weight;
	}

	public BigDecimal calculateRate(BigDecimal distance, BigDecimal weight) {
		BigDecimal rate = new BigDecimal(20.00);
		BigDecimal over500miles = new BigDecimal(5.00);
		BigDecimal over48Ounces = new BigDecimal(3.00);
		
		if (distance.compareTo(new BigDecimal(500)) == 1) {
			rate = rate.add(over500miles);
		}
		if (weight.compareTo(new BigDecimal(48)) == 1) {
			rate = rate.add(over48Ounces);
		}
		return rate;
	}

}

//FexEd
//
//FexEd "is-a" DeliveryDriver and charges a flat rate for all packages, but may apply extra charges based upon weight and distance
//
//rate = 20.00
//if distance > 500 miles then rate = rate + 5.00
//if weight > 48 ounces then rate = rate + 3.00