package com.techelevator;

public class KataFizzBuzz {
	public String FizzBuzz(int number) {
		if (number <= 0 || number >= 101) {
			return "";
		}
		if (number % 5 == 0 && number % 3 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else {
			return Integer.toString(number);
		}
	}
}
