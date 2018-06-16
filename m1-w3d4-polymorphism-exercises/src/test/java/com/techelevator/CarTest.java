package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
	Car noTrailer;
	Car trailer;
	
	@Before
	public void createCars() {
		noTrailer = new Car(false);
		trailer = new Car(true);
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull(noTrailer);
		Assert.assertNotNull(trailer);
	}
	
	@Test 
	public void testRateCalculations() {
		Assert.assertEquals(2.0, noTrailer.calculateToll(new BigDecimal(100)).doubleValue(), .01);
		Assert.assertEquals(20.0, noTrailer.calculateToll(new BigDecimal(1000)).doubleValue(), .01);
		Assert.assertEquals(.66, noTrailer.calculateToll(new BigDecimal(33)).doubleValue(), .01);
		
		//Should be + $1 for each trailer toll:
		
		Assert.assertEquals(3.0, trailer.calculateToll(new BigDecimal(100)).doubleValue(), .01);
		Assert.assertEquals(21.0, trailer.calculateToll(new BigDecimal(1000)).doubleValue(), .01);
		Assert.assertEquals(1.66, trailer.calculateToll(new BigDecimal(33)).doubleValue(), .01);
	}

}
