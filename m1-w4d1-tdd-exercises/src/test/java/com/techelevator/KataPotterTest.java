package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {
	KataPotter k;
	@Before
	public void createK() {
		k = new KataPotter();
	}
	
	@Test
	public void testNotNull() {
		Assert.assertNotNull(k);
	}
	
	@Test 
	public void test0Books() {
		int[] books = {};
		Assert.assertEquals(0, k.getCost(books), .001);
	}
	
	@Test
	public void testSingleOccurenceOfDifferentOfBooks() {
		int[] books1 = {1};
		Assert.assertEquals("one book alone should cost $8", 8.00, k.getCost(books1), .1);
		int[] books2 = {1, 2};
		Assert.assertEquals("two books should get a 5% discount on both books", 15.20, k.getCost(books2), .01);
		int[] books3 = {1, 2, 3};
		Assert.assertEquals("3books should have 10% discount on 3 books", 21.6, k.getCost(books3), .01);
		int[] books4 = {1, 2, 3, 4};
		Assert.assertEquals("4books should have 20% discount on 4 books", 25.6, k.getCost(books4), .01);
		int[] books5 = {1, 2, 3, 4, 5};
		Assert.assertEquals("4books should have 20% discount on 4 books", 30.0, k.getCost(books5), .01);	
	}
	
	@Test
	public void testMultipleOccurenceOfDifferentBooks() {
		int[] books11 = {1, 1};
		Assert.assertEquals("both books should be full price", 16.0, k.getCost(books11), .1);
		int[] books112 = {1, 1, 2};
		Assert.assertEquals("two books should be discounted, one full price", 23.20, k.getCost(books112), .1);
		int[] books11223345 = {1, 1, 2, 2, 3, 3, 4, 5};
		Assert.assertEquals("Should return 51.20", 51.60, k.getCost(books11223345), .01);
		
	}

}
