package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
	Airplane a;
	
	@Before
	public void createPlane() {
		a = new Airplane(100, 50);
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull(a);
	}
	
	
	@Test
	public void testSeatOverBooking() {
		Assert.assertTrue(a.Reserve(true, 40));
		Assert.assertEquals(40, a.getAvailableFirstClassSeats());
		Assert.assertTrue(a.Reserve(false, 10));
	
		Assert.assertFalse(a.Reserve(false, 1000));
	}
	 
	

}


//is it possible to overbook seats?
//is the count for available seats accurate?
//is the count accurate after successfully booking a seat?