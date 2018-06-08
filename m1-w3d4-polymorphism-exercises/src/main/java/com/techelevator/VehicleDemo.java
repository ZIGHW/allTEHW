package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VehicleDemo {
	public static void main (String args[]) {
		Truck truck4Axels = new Truck(4);
		Truck truck6Axels = new Truck(6);
		Truck truck10Axels = new Truck(10);
		Car coolCar = new Car(false);
		Car trailerCar = new Car(true);
		Tank boomBoom = new Tank();
		
		BigDecimal distance1 = new BigDecimal(Math.random() * 230 + 10).setScale(2, RoundingMode.CEILING);
		BigDecimal distance2 = new BigDecimal(Math.random() * 230 + 10).setScale(2, RoundingMode.CEILING);
		BigDecimal distance3 = new BigDecimal(Math.random() * 230 + 10).setScale(2, RoundingMode.CEILING);
		BigDecimal distance4 = new BigDecimal(Math.random() * 230 + 10).setScale(2, RoundingMode.CEILING);
		BigDecimal distance5 = new BigDecimal(Math.random() * 230 + 10).setScale(2, RoundingMode.CEILING);
		BigDecimal distance6 = new BigDecimal(Math.random() * 230 + 10).setScale(2, RoundingMode.CEILING);
		
		
		String tollTruck4 = Double.toString((truck4Axels.calculateToll(distance1)).doubleValue());
		String tollTruck6 = Double.toString((truck6Axels.calculateToll(distance2).doubleValue()));
		String tollTruck10 = Double.toString((truck10Axels.calculateToll(distance3).doubleValue()));
		String tollCoolCar = Double.toString((coolCar.calculateToll(distance4).doubleValue()));
		String tollTrailerCar = Double.toString((trailerCar.calculateToll(distance5)).doubleValue());
		String tollBoomBoom = Double.toString((boomBoom.calculateToll(distance6)).doubleValue());
		
		System.out.printf("Vehicle \t Distance Traveled \t Toll $\nTruck4 \t\t\t%s \t\t%s\nTruck6 \t\t\t%s \t\t%s\nTruck8 \t\t\t%s \t\t%s\nCoolCar"
				+ "\t\t\t%s \t\t%s\nTrailerCar \t\t%s \t\t%s\nBoomBoom \t\t%s \t\t%s", Double.toString(distance1.doubleValue()), tollTruck4,
						Double.toString(distance2.doubleValue()), tollTruck6, 
						Double.toString(distance3.doubleValue()), tollTruck10,
						Double.toString(distance4.doubleValue()),tollCoolCar, 
						Double.toString(distance5.doubleValue()), tollTrailerCar, 
						Double.toString(distance6.doubleValue()), tollBoomBoom);
	}
}
//Vehicle          Distance Traveled      Toll $
//----------------------------------------------
//Car              100                    $2.00
//Car              75                     $2.50
//Tank             240                    $0.00
//Truck            150                    $6.75




