package com.techelevator;
import java.math.BigDecimal;
import org.junit.*;


public class PostalServiceTest {
	PostalService p1;
	PostalService p2;
	PostalService p3;
	
	
	@Before
	public void create3PS() {
		p1 = new PostalService(1);
		p2 = new PostalService(2);
		p3 = new PostalService(3);
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull(p1);
		Assert.assertNotNull(p2);
		Assert.assertNotNull(p3);
	}
	
	@Test
	public void testRateCalculations() {
		//FirstClass
		Assert.assertEquals(45.00, p1.calculateRate(new BigDecimal(100), new BigDecimal(100), false).doubleValue(), .1);
		Assert.assertEquals(4.5, p2.calculateRate(new BigDecimal(100), new BigDecimal(100), false).doubleValue(), .1);
		Assert.assertEquals(2.6, p3.calculateRate(new BigDecimal(100), new BigDecimal(100), false).doubleValue(), .1);
	}
	
}
