package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;

public class PostalServiceSecondClass extends PostalService {
	
	PostalServiceSecondClass(){
		
		rates.put(0, new BigDecimal(0.0035));
		rates.put(3, new BigDecimal(0.0040));
		rates.put(9, new BigDecimal(0.0047));
		rates.put(16, new BigDecimal(0.0195));
		rates.put(64, new BigDecimal(0.0450));
		rates.put(144, new BigDecimal(0.0500));
	}

}
