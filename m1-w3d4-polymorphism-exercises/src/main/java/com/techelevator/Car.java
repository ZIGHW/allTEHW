package com.techelevator;

import java.math.BigDecimal;

public class Car implements Vehicle {
	private boolean trailer;
	Car(boolean trailer) {
		this.trailer = trailer;
	}

	public BigDecimal calculateToll(BigDecimal distance) {
		BigDecimal baseToll = distance.multiply(new BigDecimal(.020));
		
		if (trailer == true) {
			return baseToll.add(new BigDecimal(1));
		}
		return baseToll;
	}

}
