package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	KataFizzBuzz ka;
	
	@Before
	public void createKa() {
		ka = new KataFizzBuzz();
	}
	
	@Test
	public void testOutsideInputs() {
		Assert.assertEquals("", ka.FizzBuzz(0));
		Assert.assertEquals("", ka.FizzBuzz(101));
		
	}
	
	@Test
	public void testNormalCases() {
		Assert.assertEquals("Fizz", ka.FizzBuzz(9));
		Assert.assertEquals("Buzz", ka.FizzBuzz(20));
		Assert.assertEquals("7", ka.FizzBuzz(7));
		
	}

}
