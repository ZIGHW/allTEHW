package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
		Scanner scanMan = new Scanner(System.in);
		boolean forever = true;
		while (forever) {
			try {
				System.out.println("Please enter a temperature. Enter '-10000' to quit");
				double T = Double.valueOf(scanMan.nextLine());
				if (T == -10000) 
					break;
				System.out.println("Is the temp (C)elcius or (F)arenheit?");
				String tempType = scanMan.nextLine();
				System.out.println(tempType);
				if (tempType.equals("F")) {
					double Tc = (T - 32) / 1.8; 
					System.out.println("Your " + T + "F is " + Tc + " in Celcius \n");
				} else if (tempType.equals("C")) {
					double Tf = T / 1.8 + 32; 
					System.out.println("Your " + T + "C is " + Tf + "F in Farenheit \n");
				} else {
					System.out.println("It needs to be a C or an F. Let's take if from the top!");
				}
			} catch (NumberFormatException Err) {
				System.out.println("Needs to be a number");
			}
			
			
		}

	}

}
