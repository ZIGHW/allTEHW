package com.techelevator;

import java.math.BigDecimal;


import org.junit.*;

public class FedexTest {
	Fedex f;
	
	@Before
	public void createF() {
		f = new Fedex();
	}
	
	@Test
	public void testNotNull() {
		Assert.assertNotNull(f);
	}
	
	@Test
	public void test3RateVariations() {
		//Base rate
		Assert.assertEquals(new BigDecimal(20), f.calculateRate(new BigDecimal(40), new BigDecimal(1), true));
		//Over 500 miles rate
		Assert.assertEquals(new BigDecimal(25), f.calculateRate(new BigDecimal(800), new BigDecimal(1), true));
		//Over 48 ounces rate
		Assert.assertEquals(new BigDecimal(23), f.calculateRate(new BigDecimal(40), new BigDecimal(1000), true));
		//Both
		Assert.assertEquals(new BigDecimal(28), f.calculateRate(new BigDecimal(1000), new BigDecimal(1000), true));
		
	}
}
