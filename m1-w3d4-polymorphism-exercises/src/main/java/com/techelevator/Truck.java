package com.techelevator;

import java.math.BigDecimal;

public class Truck implements Vehicle {
	private int axels;
	Truck(int axels){
		this.axels = axels;
	}

	public BigDecimal calculateToll(BigDecimal distance) {
		if (axels >= 8) {
			return distance.multiply(new BigDecimal(.048));
		} else if (axels >= 6) {
			return distance.multiply(new BigDecimal(.045));
		} else {
			return distance.multiply(new BigDecimal(.040));
		}
	}
	
}


//A truck "is-a" vehicle and the tolls for trucks are based upon the number of axles.
//
//|--------|-----------|
//| Axles  | Per Mile  |
//|--------|-----------|
//|   4    |   0.040   |
//|   6    |   0.045   |
//|   8+   |   0.048   |
//|--------|-----------|
//
//toll = rate per mile * distance