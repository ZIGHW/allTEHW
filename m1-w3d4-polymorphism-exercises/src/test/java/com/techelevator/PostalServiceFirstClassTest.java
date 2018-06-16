package com.techelevator;
import java.math.BigDecimal;

import org.junit.*;

public class PostalServiceFirstClassTest {
	PostalServiceFirstClass p1;
	
	@Before
	public void createP1() {
		p1 = new PostalServiceFirstClass();
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull(p1);
	}
	
	
	@Test
	public void testRateCalculationsBasedOnWeight() {
		Assert.assertEquals(3.5, p1.calculateRate(new BigDecimal(100), p1.toOz(new BigDecimal(1), false)).doubleValue(), .01);
		Assert.assertEquals(4.7, p1.calculateRate(new BigDecimal(100), p1.toOz(new BigDecimal(9), false)).doubleValue(), .01);
		Assert.assertEquals(19.5, p1.calculateRate(new BigDecimal(100), p1.toOz(new BigDecimal(16), false)).doubleValue(), .01);
		Assert.assertEquals(45.0, p1.calculateRate(new BigDecimal(100), p1.toOz(new BigDecimal(64), false)).doubleValue(), .01);
		Assert.assertEquals(50.0, p1.calculateRate(new BigDecimal(100), p1.toOz(new BigDecimal(144), false)).doubleValue(), .01);
		Assert.assertEquals(50.0, p1.calculateRate(new BigDecimal(100), p1.toOz(new BigDecimal(5000), false)).doubleValue(), .01);
		Assert.assertEquals(4.0, p1.calculateRate(new BigDecimal(100), p1.toOz(new BigDecimal(3), false)).doubleValue(), .01);
		Assert.assertEquals(19.5, p1.calculateRate(new BigDecimal(100), p1.toOz(new BigDecimal(1), true)).doubleValue(), .01);

	}
	
	@Test
	public void testRateCalculationsBasedOnDistance() {
		Assert.assertEquals(.035, p1.calculateRate(new BigDecimal(1), p1.toOz(new BigDecimal(1), false)).doubleValue(), .01);
		Assert.assertEquals(.35, p1.calculateRate(new BigDecimal(10), p1.toOz(new BigDecimal(1), false)).doubleValue(), .01);
		Assert.assertEquals(3.519, p1.calculateRate(new BigDecimal(100.55), p1.toOz(new BigDecimal(1), false)).doubleValue(), .01);
		Assert.assertEquals(35.0, p1.calculateRate(new BigDecimal(1000), p1.toOz(new BigDecimal(1), false)).doubleValue(), .01);
	}

}
