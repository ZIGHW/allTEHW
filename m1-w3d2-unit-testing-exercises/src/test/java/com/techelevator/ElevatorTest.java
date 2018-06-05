package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	
	private Elevator el;
	
	@Before
	public void CreateElevator() {
		el = new Elevator(1, 20);
	}
	
	@Test
	public void testExistenceAndBuild() {
		Assert.assertNotNull("Elevator should create an object", el);
		Assert.assertEquals(20, el.getNumberOfLevels());
		Assert.assertFalse("door shouldn't be moving at this point", el.isMoving());
	}
	
	@Test
	public void testShaftNumber() {
		Assert.assertEquals(1, el.getShaftNumber());
	}
	
	@Test
	public void testFloorChanging() {
		el.CloseDoor();
		Assert.assertEquals(1, el.getCurrentLevel());
		el.GoUp(10);
		Assert.assertEquals(10, el.getCurrentLevel());
		el.GoDown(5);
		Assert.assertEquals(5, el.getCurrentLevel());
	
		
		el.OpenDoor();
		//Shouldn't change
		Assert.assertEquals(5, el.getCurrentLevel());
		el.GoUp(10);
		Assert.assertEquals(10, el.getCurrentLevel());
		el.GoDown(5);
		Assert.assertEquals(10, el.getCurrentLevel());
	}
	

}
