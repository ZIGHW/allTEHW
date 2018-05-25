package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		boolean disTrue = true;
		while (disTrue) {
			try {
				Scanner fibN = new Scanner(System.in);
				System.out.println("Yo hit me with a whole number and I'll give you a fib sequence leading up to that number.");
				int[] numbers = new int[100];
				numbers[0] = 0;
				numbers[1] = 1;
				int n = Integer.parseInt(fibN.nextLine());
				int i;
				
				for (i = 2; numbers[i-1] < n; i++) {
					numbers[i] = numbers[i -1] + numbers[i - 2];
				}
				System.out.println(Arrays.toString(Arrays.copyOfRange(numbers, 0, i -1)).replaceAll("\\[", "").replaceAll("\\]",""));
				System.out.println("You can enter 'N' and we can stop if yeah want! Otherwise enter anything else and we'll do it again.");
				String yOrN = fibN.nextLine();
				if (yOrN.equals("N")) {
					disTrue = false;
				};
			}
			catch (NumberFormatException Err) {
				System.out.println("That input is whack.");
				
			}
			
		}
		
		
	}

}
