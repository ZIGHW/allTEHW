package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		
		File dopeFile = new File ("LoveFizz.txt");
		
		try(PrintWriter fizzPrinter = new PrintWriter(dopeFile)) {
			for (int i = 1; i <= 300; i++) {
				if (i % 5 == 0 && i % 3 == 0) {
					fizzPrinter.println("FizzBuzz");
				} else if (i % 3 == 0) {
					fizzPrinter.println("Fizz");
				} else if (i % 5 == 0) {
					fizzPrinter.println("Buzz");
				} else {
					fizzPrinter.println(i);
				} 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("This is going so well.(It's not)");
		}		
	}
}

