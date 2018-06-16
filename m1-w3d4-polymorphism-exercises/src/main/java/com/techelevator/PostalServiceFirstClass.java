package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;

public class PostalServiceFirstClass extends PostalService {
	
	PostalServiceFirstClass(){
		rates.put(0, new BigDecimal(0.035));
		rates.put(3, new BigDecimal(0.040));
		rates.put(9, new BigDecimal(0.047));
		rates.put(16, new BigDecimal(0.195));
		rates.put(64, new BigDecimal(0.45));
		rates.put(144, new BigDecimal(0.5));
	}
	
}
