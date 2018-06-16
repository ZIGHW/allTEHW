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
