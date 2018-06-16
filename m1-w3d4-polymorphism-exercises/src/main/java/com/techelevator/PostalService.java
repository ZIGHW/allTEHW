package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;

public abstract class PostalService implements DeliveryDriver {
	protected HashMap<Integer, BigDecimal> rates = new HashMap<Integer, BigDecimal>();
	
	public BigDecimal toOz(BigDecimal weight, boolean pounds) {
		if (pounds == true) {
			weight = weight.multiply(new BigDecimal(16));
		}
		return weight;
	}
	
	public BigDecimal calculateRate(BigDecimal distance, BigDecimal weight) {
		int intWeight = (int) Integer.valueOf(weight.intValue());
		
		if (intWeight >= 144) {
			intWeight = 144;
		} else if (intWeight >= 64) {
			intWeight = 64;
		} else if (intWeight >= 16) {
			intWeight = 16;
		} else if (intWeight >= 9) {
			intWeight = 9;
		} else if (intWeight >= 3) {
			intWeight = 3;
		} else {
			intWeight = 0;
		}
		
		return rates.get(intWeight).multiply(distance);
		
	}
	
}

