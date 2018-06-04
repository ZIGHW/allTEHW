package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int bookedFirstClassSeats = 0;
	private int availableFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats = 0;
	private int availableCoachSeats;
	private int totalCoachSeats;
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
		this.availableFirstClassSeats = totalFirstClassSeats;
		this.availableCoachSeats = totalCoachSeats;
	}
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	public int getAvailableCoachSeats() {
		availableCoachSeats = totalCoachSeats - bookedCoachSeats;
//		System.out.println("total " + totalCoachSeats + " booked " + bookedCoachSeats +
//				" availableCoachSeats " + availableCoachSeats);
		return availableCoachSeats;
	}
	public int getAvailableFirstClassSeats() {
		availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
		return availableFirstClassSeats;
	}

	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		availableCoachSeats = totalCoachSeats - bookedCoachSeats;
		availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
		if (forFirstClass == true) {
			if (availableFirstClassSeats - totalNumberOfSeats >= 0) {
				bookedFirstClassSeats += totalNumberOfSeats;
				availableFirstClassSeats -= totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
			
		} else {
			if (availableCoachSeats - totalNumberOfSeats >= 0) {
				bookedCoachSeats += totalNumberOfSeats;
				availableCoachSeats -= totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
		}

	}
	
}
	

