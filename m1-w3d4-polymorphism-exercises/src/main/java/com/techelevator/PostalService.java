package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;

public class PostalService implements DeliveryDriver {
	

	public BigDecimal calculateRate(BigDecimal distance, String weightClass) {
		HashMap<String, BigDecimal> c = new HashMap<String, BigDecimal>();
		c.put("0-21st", new BigDecimal(0.035));
		c.put("0-22nd", new BigDecimal(0.0035));
		c.put("0-23rd", new BigDecimal(0.00020));
		c.put("3-81st", new BigDecimal(0.040));
		c.put("3-82nd", new BigDecimal(0.0040));
		c.put("3-83rd", new BigDecimal(0.0022));
		c.put("9-151st", new BigDecimal(0.047));
		c.put("9-152nd", new BigDecimal(0.0047));
		c.put("9-153rd", new BigDecimal(0.0024));
		c.put("1-31st", new BigDecimal(0.195));
		c.put("1-32nd", new BigDecimal(0.0195));
		c.put("1-33rd", new BigDecimal(0.0150));
		c.put("4-81st", new BigDecimal(0.45));
		c.put("4-82nd", new BigDecimal(0.0450));
		c.put("4-83rd", new BigDecimal(0.0260));
		c.put("9+1st", new BigDecimal(0.5));
		c.put("9+2nd", new BigDecimal(0.0500));
		c.put("9+3rd", new BigDecimal(0.0170));
		
		return c.get(weightClass).multiply(distance);
		
	}

}

