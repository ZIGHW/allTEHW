package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {
	
	FruitTree f;

	@Before
	public void createTree() {
		f = new FruitTree("DoomBerry", 9001);
	}
	
	@Test
	public void testConstructorAndExistence() {
		Assert.assertNotNull(f);
		Assert.assertEquals("DoomBerry", f.getTypeOfFruit());
		Assert.assertEquals(9001, f.getPiecesOfFruitLeft());
		
	}
	
	@Test
	public void testPickFruit() {
		f.PickFruit(1000);
		Assert.assertEquals(8001, f.getPiecesOfFruitLeft());
	}
}
