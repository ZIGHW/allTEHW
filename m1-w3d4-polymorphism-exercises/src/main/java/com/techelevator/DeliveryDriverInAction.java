package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;
public class DeliveryDriverInAction {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		boolean q = false;
		PostalServiceFirstClass goinPostal1 = new PostalServiceFirstClass();
		PostalServiceSecondClass goinPostal2 = new PostalServiceSecondClass();
		PostalServiceThirdClass goinPostal3 = new PostalServiceThirdClass();
		Fedex forTheFeds = new Fedex();
		SPU seattle4 = new SPU("four");
		SPU seattle2 = new SPU("two");
		SPU seattleNext = new SPU("next");
		while(!q) {
			boolean pounds = false;
			
			System.out.println("Please enter the weight of the package");
			BigDecimal weight = new BigDecimal(input.nextLine());
			System.out.println("(P)ounds or (O)unces");
			String pOrOz = input.nextLine();
			System.out.println(pOrOz);
			if (pOrOz.equals("P") || pOrOz.equals("p")) {
				pounds = true;
			}
			System.out.println(pounds);
			
			System.out.println("How far we sending this baby?");
			BigDecimal distance = new BigDecimal(input.nextLine());
			
			
			String p1 = Double.toString(goinPostal1.calculateRate(distance, goinPostal1.toOz(weight, pounds)).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String p2 = Double.toString(goinPostal2.calculateRate(distance, goinPostal2.toOz(weight, pounds)).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String p3 = Double.toString(goinPostal3.calculateRate(distance, goinPostal3.toOz(weight, pounds)).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String spu4 = Double.toString(seattle4.calculateRate(distance, seattle4.toPounds(weight, pounds)).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String spu2 = Double.toString(seattle2.calculateRate(distance, seattle2.toPounds(weight, pounds)).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String spuNext = Double.toString(seattleNext.calculateRate(distance, seattleNext.toPounds(weight, pounds)).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			String fedex = Double.toString(forTheFeds.calculateRate(distance, forTheFeds.toOz(weight, pounds)).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
			
			System.out.printf(" Delivery Method \t \t$ Cost\n Postal Service (1st Class) \t%s\n Postal Service (2nd Class) \t%s\n"
					+ " Postal Service (3rd Class) \t%s\n FedEx \t \t \t \t%s\n SPU (4-day ground) \t \t%s\n SPU (2-day business) \t \t%s\n"
					+ " SPU (next-day) \t \t%s\n\n", p1, p2, p3, fedex, spu4, spu2, spuNext);
			
		}
		
		input.close();
		
		
	}

}
