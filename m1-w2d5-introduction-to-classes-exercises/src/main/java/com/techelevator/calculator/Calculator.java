package com.techelevator.calculator;

public class Calculator {
	private int currentValue = 0;
	
	public int getCurrentValue() {
		return this.currentValue;
	}
	
	public void reset() {
		this.currentValue = 0;
	}
	
	
	
	public int add(int addend) {
		this.currentValue += addend;
		return this.currentValue;
	}
	
	public int subtract(int subtrahend) {
		this.currentValue -= subtrahend;
		return this.currentValue;
	}
	
	public int multiply(int multiplier) {
		this.currentValue *= multiplier;
		return this.currentValue;
	}
	
	public int divide(int divider) {
		this.currentValue /= divider;
		return this.currentValue;
	}
	
	public int power(int exponent) {
		this.currentValue = (int) Math.pow(this.currentValue, exponent);
		return this.currentValue;
	}
	
}
