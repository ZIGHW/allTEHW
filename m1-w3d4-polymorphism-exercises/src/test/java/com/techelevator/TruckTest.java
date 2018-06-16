package com.techelevator;

import java.math.BigDecimal;

import org.junit.*;

public class TruckTest {
	Truck truck4Axels;
	Truck truck6Axels;
	Truck truck10Axels;
	
	@Before
	public void createTrucks() {
		truck4Axels = new Truck(4);
		truck6Axels = new Truck(6);
		truck10Axels = new Truck(10);
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull(truck4Axels);
		Assert.assertNotNull(truck6Axels);
		Assert.assertNotNull(truck10Axels);
	}
	
	@Test 
	public void testRateCalculations() {
		Assert.assertEquals(4.0, truck4Axels.calculateToll(new BigDecimal(100)).doubleValue(), .01);
		Assert.assertEquals(40.0, truck4Axels.calculateToll(new BigDecimal(1000)).doubleValue(), .01);
		Assert.assertEquals(1.32, truck4Axels.calculateToll(new BigDecimal(33)).doubleValue(), .01);
		
		Assert.assertEquals(4.5, truck6Axels.calculateToll(new BigDecimal(100)).doubleValue(), .01);
		Assert.assertEquals(45.0, truck6Axels.calculateToll(new BigDecimal(1000)).doubleValue(), .01);
		Assert.assertEquals(1.48, truck6Axels.calculateToll(new BigDecimal(33)).doubleValue(), .01);
		
		Assert.assertEquals(4.8, truck10Axels.calculateToll(new BigDecimal(100)).doubleValue(), .01);
		Assert.assertEquals(48.0, truck10Axels.calculateToll(new BigDecimal(1000)).doubleValue(), .01);
		Assert.assertEquals(1.584, truck10Axels.calculateToll(new BigDecimal(33)).doubleValue(), .01);
	}
	
}
