package com.techelevator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {
	
	
	Television tele;
	
	@Before
	public void creation() {
		tele = new Television();
	}
	
	@Test
	public void testTeleIsNotNull() {
		Assert.assertNotNull("tele shouldn't be null", tele);
	}
	
	@Test
	public void testOnOff() {
		tele.TurnOn();
		Assert.assertTrue("Tv should start off", tele.IsOn());
		tele.TurnOff();
		Assert.assertFalse("Tv should start off", tele.IsOn());
	}
	
	@Test
	public void testChannelSelect() {
		tele.TurnOn();
		tele.ChangeChannel(7);
		Assert.assertEquals(7, tele.getSelectedChannel());
	}
	
	@Test 
	public void TestVolumeUpDown() {
		tele.TurnOn();
		tele.RaiseVolume();
		tele.RaiseVolume();
		Assert.assertEquals(2, tele.getCurrentVolume());
		tele.LowerVolume();
		tele.LowerVolume();
		Assert.assertEquals(0, tele.getCurrentVolume());
	}
	
	
	
	
	

}