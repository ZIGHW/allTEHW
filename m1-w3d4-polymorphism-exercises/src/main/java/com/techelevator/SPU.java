package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;

public class SPU implements DeliveryDriver {
	String numberOfDays;
	
	SPU(String numberOfDays){
		this.numberOfDays = numberOfDays;
	}
	
	public BigDecimal toPounds(BigDecimal weight, boolean pounds) {
		if (pounds == false) {
			weight = weight.divide(new BigDecimal(16));
		}
		return weight;
		
	}
	
	public BigDecimal calculateRate(BigDecimal distance, BigDecimal weight) {
		BigDecimal weightClassBig = weight;
		HashMap<String, BigDecimal> rates = new HashMap<String, BigDecimal>();
		rates.put("four",  new BigDecimal(0.0050));
		rates.put("two",  new BigDecimal(0.050));
		rates.put("next",  new BigDecimal(0.0750));
		
		return (weightClassBig.multiply(rates.get(numberOfDays))).multiply(distance);
		
//		PU
//
//		SPU "is-a" DeliveryDriver and follows a simple formula based upon class, weight (in lbs) and distance.
//
//		If four-day ground then rate = (weight * 0.0050) * distance
//		If two-day business then rate = (weight * 0.050) * distance
//		if next day then rate = (weight * 0.075) * distance
	}

}
