package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;

public class PostalService implements DeliveryDriver {
	private int speed;
	PostalService(int speed) {
		this.speed = speed;
	}
	

	public BigDecimal calculateRate(BigDecimal distance, BigDecimal weight, boolean pounds) {
		HashMap<Integer, BigDecimal> c1st = new HashMap<Integer, BigDecimal>();
		HashMap<Integer, BigDecimal> c2nd = new HashMap<Integer, BigDecimal>();
		HashMap<Integer, BigDecimal> c3rd = new HashMap<Integer, BigDecimal>();
		if (pounds == true) {
			weight = weight.multiply(new BigDecimal(16));
		}
		
		int intWeight = (int) Integer.valueOf(weight.intValue());
		c1st.put(0, new BigDecimal(0.035));
		c2nd.put(0, new BigDecimal(0.0035));
		c3rd.put(0, new BigDecimal(0.00020));
		c1st.put(3, new BigDecimal(0.040));
		c2nd.put(3, new BigDecimal(0.0040));
		c3rd.put(3, new BigDecimal(0.0022));
		c1st.put(9, new BigDecimal(0.047));
		c2nd.put(9, new BigDecimal(0.0047));
		c3rd.put(9, new BigDecimal(0.0024));
		c1st.put(16, new BigDecimal(0.195));
		c2nd.put(16, new BigDecimal(0.0195));
		c3rd.put(16, new BigDecimal(0.0150));
		c1st.put(64, new BigDecimal(0.45));
		c2nd.put(64, new BigDecimal(0.0450));
		c3rd.put(64, new BigDecimal(0.0260));
		c1st.put(144, new BigDecimal(0.5));
		c2nd.put(144, new BigDecimal(0.0500));
		c3rd.put(144, new BigDecimal(0.0170));
		
		
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
		
		
		if (speed == 1) {
			return c1st.get(intWeight).multiply(distance);
		}
		if (speed == 2) {
			return c2nd.get(intWeight).multiply(distance);
		}
		else {
			return c3rd.get(intWeight).multiply(distance);
		}
	}

}

