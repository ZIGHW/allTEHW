package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanMan = new Scanner(System.in);
		boolean forever = true;
	
		while (forever) {
				try {
					System.out.println("Please enter the length. Enter '-1' to quit");
					double l = Double.valueOf(scanMan.nextLine());
					if (l == -1) 
						break;
					System.out.println("Is the measurement (m)eter or (f)eet");
					String measureType = scanMan.nextLine();
					System.out.println(measureType);
					if (measureType.equals("m")) {
						double lF = l * 3.2808399; 
						System.out.println("Your " + l + " meters is " + lF + " in feet \n");
					} else {
						double lM = l * .3048; 
						System.out.println("Your " + l + " feet is " + lM + " in meters \n");
					}
					
				} catch (NumberFormatException Err) {
					System.out.println("That ain't no number. Try again");
				}
				
			}
	}

}
