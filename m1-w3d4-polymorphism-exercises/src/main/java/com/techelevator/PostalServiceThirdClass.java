package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;

public class PostalServiceThirdClass extends PostalService {
	
	PostalServiceThirdClass(){
		rates.put(0, new BigDecimal(0.00020));
		rates.put(3, new BigDecimal(0.0022));
		rates.put(9, new BigDecimal(0.0024));
		rates.put(16, new BigDecimal(0.0150));
		rates.put(64, new BigDecimal(0.0260));
		rates.put(144, new BigDecimal(0.0170));
	}


}
