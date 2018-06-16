package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostalServiceThirdClassTest {
PostalServiceThirdClass p3;
	
	@Before
	public void createP1() {
		p3 = new PostalServiceThirdClass();
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull(p3);
	}
	
	
	@Test
	public void testRateCalculationsBasedOnWeight() {
		Assert.assertEquals(.02, p3.calculateRate(new BigDecimal(100), p3.toOz(new BigDecimal(1), false)).doubleValue(), .01);
		Assert.assertEquals(.24, p3.calculateRate(new BigDecimal(100), p3.toOz(new BigDecimal(9), false)).doubleValue(), .01);
		Assert.assertEquals(1.5, p3.calculateRate(new BigDecimal(100), p3.toOz(new BigDecimal(16), false)).doubleValue(), .01);
		Assert.assertEquals(2.6, p3.calculateRate(new BigDecimal(100), p3.toOz(new BigDecimal(64), false)).doubleValue(), .01);
		Assert.assertEquals(1.70, p3.calculateRate(new BigDecimal(100), p3.toOz(new BigDecimal(144), false)).doubleValue(), .01);
		Assert.assertEquals(1.70, p3.calculateRate(new BigDecimal(100), p3.toOz(new BigDecimal(5000), false)).doubleValue(), .01);
		Assert.assertEquals(.22, p3.calculateRate(new BigDecimal(100), p3.toOz(new BigDecimal(3), false)).doubleValue(), .01);
		Assert.assertEquals(1.5, p3.calculateRate(new BigDecimal(100), p3.toOz(new BigDecimal(1), true)).doubleValue(), .01);

	}
	
	@Test
	public void testRateCalculationsBasedOnDistance() {
		Assert.assertEquals(.026, p3.calculateRate(new BigDecimal(1), p3.toOz(new BigDecimal(100), false)).doubleValue(), .01);
		Assert.assertEquals(.26, p3.calculateRate(new BigDecimal(10), p3.toOz(new BigDecimal(100), false)).doubleValue(), .01);
		Assert.assertEquals(2.61, p3.calculateRate(new BigDecimal(100.55), p3.toOz(new BigDecimal(100), false)).doubleValue(), .01);
		Assert.assertEquals(26.0, p3.calculateRate(new BigDecimal(1000), p3.toOz(new BigDecimal(100), false)).doubleValue(), .01);
	}


}
