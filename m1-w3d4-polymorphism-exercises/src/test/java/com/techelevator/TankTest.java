package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TankTest {
	Tank boom;
	
	@Before
	public void createTank() {
		boom = new Tank();
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull(boom);
	}
	
	@Test 
	public void testRateCalculations() {
		Assert.assertEquals(0, boom.calculateToll(new BigDecimal(100)).doubleValue(), .01);
		Assert.assertEquals(0, boom.calculateToll(new BigDecimal(1000)).doubleValue(), .01);
		Assert.assertEquals(0, boom.calculateToll(new BigDecimal(33)).doubleValue(), .01);
	}
}
