package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;
public class DeliveryDriverInAction {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		boolean pounds = false;
		boolean q = false;
		PostalService goinPostal1 = new PostalService(1);
		PostalService goinPostal2 = new PostalService(2);
		PostalService goinPostal3 = new PostalService(3);
		Fedex forTheFeds = new Fedex();
		SPU seattle4 = new SPU("four");
		SPU seattle2 = new SPU("two");
		SPU seattleNext = new SPU("next");
		while(!q) {
			
			
			System.out.println("Please enter the weight of the package");
			BigDecimal weight = new BigDecimal(input.nextLine());
			System.out.println("(P)ounds or (O)unces");
			String pOrOz = input.nextLine();
			if (pOrOz == "P" || pOrOz == "p") {
				pounds = true;
			}
			
			System.out.println("How far we sending this baby?");
			BigDecimal distance = new BigDecimal(input.nextLine());
			
			
			String p1 = Double.toString(goinPostal1.calculateRate(distance, weight, pounds).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String p2 = Double.toString(goinPostal2.calculateRate(distance, weight, pounds).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String p3 = Double.toString(goinPostal3.calculateRate(distance, weight, pounds).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String spu4 = Double.toString(seattle4.calculateRate(distance, weight, pounds).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String spu2 = Double.toString(seattle2.calculateRate(distance, weight, pounds).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String spuNext = Double.toString(seattleNext.calculateRate(distance, weight, pounds).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String fedex = Double.toString(forTheFeds.calculateRate(distance, weight, pounds).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			
			System.out.printf(" Delivery Method \t \t$ Cost\n Postal Service (1st Class) \t%s\n Postal Service (2nd Class) \t%s\n"
					+ " Postal Service (3rd Class) \t%s\n FedEx \t \t \t \t%s\n SPU (4-day ground) \t \t%s\n SPU (2-day business) \t \t%s\n"
					+ " SPU (next-day) \t \t%s\n\n", p1, p2, p3, fedex, spu4, spu2, spuNext);
			
		}
		
		input.close();
		
		
	}

}
