package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostalServiceSecondClassTest {
PostalServiceSecondClass p2;
	
	@Before
	public void createP1() {
		p2 = new PostalServiceSecondClass();
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull(p2);
	}
	
	
	@Test
	public void testRateCalculationsBasedOnWeight() {
		Assert.assertEquals(.35, p2.calculateRate(new BigDecimal(100), p2.toOz(new BigDecimal(1), false)).doubleValue(), .01);
		Assert.assertEquals(.47, p2.calculateRate(new BigDecimal(100), p2.toOz(new BigDecimal(9), false)).doubleValue(), .01);
		Assert.assertEquals(1.95, p2.calculateRate(new BigDecimal(100), p2.toOz(new BigDecimal(16), false)).doubleValue(), .01);
		Assert.assertEquals(4.50, p2.calculateRate(new BigDecimal(100), p2.toOz(new BigDecimal(64), false)).doubleValue(), .01);
		Assert.assertEquals(5.00, p2.calculateRate(new BigDecimal(100), p2.toOz(new BigDecimal(144), false)).doubleValue(), .01);
		Assert.assertEquals(5.00, p2.calculateRate(new BigDecimal(100), p2.toOz(new BigDecimal(5000), false)).doubleValue(), .01);
		Assert.assertEquals(.40, p2.calculateRate(new BigDecimal(100), p2.toOz(new BigDecimal(3), false)).doubleValue(), .01);
		Assert.assertEquals(1.95, p2.calculateRate(new BigDecimal(100), p2.toOz(new BigDecimal(1), true)).doubleValue(), .01);

	}
	
	@Test
	public void testRateCalculationsBasedOnDistance() {
		Assert.assertEquals(.0035, p2.calculateRate(new BigDecimal(1), p2.toOz(new BigDecimal(1), false)).doubleValue(), .01);
		Assert.assertEquals(.035, p2.calculateRate(new BigDecimal(10), p2.toOz(new BigDecimal(1), false)).doubleValue(), .01);
		Assert.assertEquals(.3519, p2.calculateRate(new BigDecimal(100.55), p2.toOz(new BigDecimal(1), false)).doubleValue(), .01);
		Assert.assertEquals(3.50, p2.calculateRate(new BigDecimal(1000), p2.toOz(new BigDecimal(1), false)).doubleValue(), .01);
	}


}
