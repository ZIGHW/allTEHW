package com.techelevator;
import java.math.BigDecimal;
import org.junit.*;
public class SPUTest {
	SPU s2days;
	SPU s4days;
	SPU sNext;
	
	@Before
	public void createSPU() {
		s4days = new SPU("four");
		s2days = new SPU("two");
		sNext = new SPU("next");
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull(s2days);
		Assert.assertNotNull(s4days);
		Assert.assertNotNull(sNext);
		
	}
	
	@Test 
	public void testRateCalculations() {
		Assert.assertEquals(500.0, s2days.calculateRate(new BigDecimal(100), s2days.toPounds(new BigDecimal(100), true)).doubleValue(), .1);
		Assert.assertEquals(50.0, s4days.calculateRate(new BigDecimal(100), s4days.toPounds(new BigDecimal(100), true)).doubleValue(), .1);
		Assert.assertEquals(750.0, sNext.calculateRate(new BigDecimal(100), sNext.toPounds(new BigDecimal(100), true)).doubleValue(), .1);
	}

}
