package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KataRomanNumerals {
	public int convertRomanToDecimal(String roman) {
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < roman.length(); i++) {
			  
		    switch (roman.substring(i, i+1)) {
		      case "M": nums.add(1000);
		      break;
		      case "D": nums.add(500);
		      break;
		      case "C": nums.add(100);
		      break;
		      case "L": nums.add(50);
		      break;
		      case "X": nums.add(10);
		      break;
		      case "V": nums.add(5);
		      break;
		      case "I": nums.add(1);
		      break;
		    }
		    
		  }
		
		for (int i = 1; i < roman.length(); i++) {
			  
		    switch (roman.substring(i -1, i+1)) {
		      case "CM": nums.add(-200);
		      break;
		      case "XC": nums.add(-20);
		      break;
		      case "IX": nums.add(-2);
		      break;
		      case "XL": nums.add(-20);
		      break;
		      case "CD": nums.add(-200);
		      break;
		      case "IV": nums.add(-2);
		      break;
		    }
		  }
		

		  int sum = nums.stream().mapToInt(Integer::intValue).sum();
		  return sum;
		  
	}
	
	public String convertDecimalToRoman(int num) {
		String roman = "";
		
		String numStr = Integer.toString(num);
		if (numStr.length() == 4) {
			//thousands place
			for (int i = 0; i < Integer.parseInt(numStr.substring(0, 1)); i++) {
				roman += "M";
			}
		}
			//switch hundreds place
		if (numStr.length() >= 3) {
			switch (numStr.substring(numStr.length() -3, numStr.length() -2)) {
				case("9"): roman += "CM";
					break;
				case("4"): roman += "CD";
					break;
				case("5"): roman += "D";
					break;
				case("6"): roman += "DC";
					break;
				case("7"): roman += "DCC";
					break;
				case("8"): roman += "DCCC";
					break;
				default: for (int i = 0; i < Integer.parseInt(numStr.substring(numStr.length() -3, numStr.length() -2)); i++) {
					roman += "C";
						}
			}
			
		}
		
		if (numStr.length() >= 2) {
			//Switch 10s place
			switch (numStr.substring(numStr.length() -2, numStr.length() -1)) {
				case("9"): roman += "XC";
					break;
				case("4"): roman += "XL";
					break;
				case("5"): roman += "L";
					break;
				case("6"): roman += "LX";
					break;
				case("7"): roman += "LXX";
					break;
				case("8"): roman += "LXXX";
					break;
				default: for (int i = 0; i < Integer.parseInt(numStr.substring(numStr.length() -2, numStr.length() -1)); i++) {
					roman += "X";
						}
			}
		}
		if (numStr.length() >= 1) {
			//singles place
			switch (numStr.substring(numStr.length()-1)) {
				case("9"): roman += "IX";
					break;
				case("4"): roman += "IV";
					break;
				case("5"): roman += "V";
					break;
				case("6"): roman += "VI";
					break;
				case("7"): roman += "VII";
					break;
				case("8"): roman += "VIII";
					break;
				default: for (int i = 0; i < Integer.parseInt(numStr.substring(numStr.length()-1)); i++) {
					roman += "I";
						}
			}
		}	
		
		return(roman);
		
		}
		
		
}
