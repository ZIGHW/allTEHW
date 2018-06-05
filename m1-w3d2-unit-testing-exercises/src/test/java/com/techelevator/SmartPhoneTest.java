package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmartPhoneTest {
	
	private SmartPhone s;
	
	@Before
	public void createSmartPhone() {
		s = new SmartPhone("6037595030", "Verizon");
	}
	@Test
	public void testExistence() {
		Assert.assertNotNull(s);
	}
	@Test
	public void testBattery() {
		Assert.assertEquals(100, s.getBatteryCharge());
		s.Call("4444444444", 50);
		Assert.assertEquals(50, s.getBatteryCharge());
		s.RechargeBattery();
		Assert.assertEquals(95, s.getBatteryCharge());
	}
	@Test
	public void testCalling() {
		Assert.assertFalse(s.isOnCall());
		s.AnswerPhone();
		Assert.assertTrue(s.isOnCall());
		s.HangUp();
		Assert.assertFalse(s.isOnCall());
		
	}
	 

}
//does the battery return to 100% after recharging?
//are there any methods that change the state of the object when repeatedly called?
//is it possible to spend too much time on a call that there isn't enough battery power remaining?
//what happens if we dial a 7-digit number and not a 10 digit number?
