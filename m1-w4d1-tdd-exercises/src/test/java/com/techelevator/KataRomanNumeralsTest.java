package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	KataRomanNumerals r;
	@Before
	public void createR() {
		r = new KataRomanNumerals();
	}
	
	@Test
	public void testNotNull() {
		Assert.assertNotNull(r);
	}
	
	@Test
	public void testSingleNumbers() {
		Assert.assertEquals(1, r.convertRomanToDecimal("I"));
		Assert.assertEquals(5, r.convertRomanToDecimal("V"));
		Assert.assertEquals(100, r.convertRomanToDecimal("C"));
		Assert.assertEquals(1000, r.convertRomanToDecimal("M"));
		Assert.assertEquals(500, r.convertRomanToDecimal("D"));
		Assert.assertEquals(10, r.convertRomanToDecimal("X"));
	}
	
	@Test
	public void testMultipleNumbers() {
		Assert.assertEquals(6, r.convertRomanToDecimal("VI"));
		Assert.assertEquals(20, r.convertRomanToDecimal("XX"));
		Assert.assertEquals(137, r.convertRomanToDecimal("CXXXVII"));
	}
	
	@Test
	public void testSubtractionOfSmallerNumsBefore() {
		Assert.assertEquals(4, r.convertRomanToDecimal("IV"));
		Assert.assertEquals(499, r.convertRomanToDecimal("CDXCIX"));
		Assert.assertEquals(3984, r.convertRomanToDecimal("MMMCMLXXXIV"));
	}
	
	@Test
	public void testDecimalToRomanMultipleNumbers() {
		Assert.assertEquals("I", r.convertDecimalToRoman(1));
		Assert.assertEquals("XX", r.convertDecimalToRoman(20));
		Assert.assertEquals("CXXXVII", r.convertDecimalToRoman(137));
		
	}
	
	@Test
	public void testDecimalToRomanSubtractionOfSmallerNumbers() {
		Assert.assertEquals("IV", r.convertDecimalToRoman(4));
		Assert.assertEquals("CDXCIX", r.convertDecimalToRoman(499));
		Assert.assertEquals("MMMCMLXXXIV", r.convertDecimalToRoman(3984));
		
	}
	
}
