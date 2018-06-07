package com.techelevator.company;





public class Company {
	private String name;
	private int numberEmployees;
	private double revenue;
	private double expenses;
	private String companySize;
	private double profit;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfEmployees() {
		return this.numberEmployees;
	}
	public void setNumberOfEmployees(int num) {
		this.numberEmployees = num;
		setCompanySize(num);
	}
	
	private void setCompanySize(int num) {
		if (num <= 50) 
			this.companySize = "small";
		else if (num <= 250)
			this.companySize = "medium";
		else 
			this.companySize = "large";
	}
	
	public double getRevenue() {
		return this.revenue;
	}
	public void setRevenue(double num) {
		this.revenue = num;
		setProfit();
	}
	
	public double getExpenses() {
		return this.expenses;
	}
	public void setExpenses(double num) {
		this.expenses = num;
		setProfit();
	}
	
	public String getCompanySize() {
		setCompanySize(this.numberEmployees);
		return this.companySize;
	}
	
	public double getProfit() {
		setProfit();
		return this.profit;
	}
	
	private void setProfit() {
		this.profit = this.revenue - this.expenses;
	}
	
	
//	private Constructor<Company> constructor = null;
//	private Method getName = null;
//	private Method setName = null;
//	private Method getNumberOfEmployees = null;
//	private Method setNumberOfEmployees = null;
//	private Method getRevenue = null;
//	private Method setRevenue = null;
//	private Method getExpenses = null;
//	private Method setExpenses = null;
//	private Method getCompanySize = null;
//	private Method getProfit = null;
	
}
