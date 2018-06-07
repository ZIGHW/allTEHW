package com.techelevator;
import java.math.BigDecimal;

public interface DeliveryDriver {
	BigDecimal calculateRate(BigDecimal distance, String weightClass);

}
