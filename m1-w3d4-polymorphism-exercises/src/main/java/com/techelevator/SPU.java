package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;

public class SPU implements DeliveryDriver {
	private String numberOfDays;
	
	SPU(String numberOfDays){
		this.numberOfDays = numberOfDays;
	}
	
	public BigDecimal calculateRate(BigDecimal distance, BigDecimal weight, boolean pounds) {
		BigDecimal weightClassBig = weight;
		if (pounds == false) {
			weightClassBig = weightClassBig.divide(new BigDecimal(16));
		}
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
