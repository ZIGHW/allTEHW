package com.techelevator;

public class Employee {
	int employeeId;
	String firstName;
	String lastName;
	String fullName;
	String department;
	double annualSalary;
	
	public Employee(int employeeId, String firstName, String lastName, double Salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = Salary;
		this.fullName = lastName + ", " + firstName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public String getDepartment() {
		return department;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		this.fullName = lastName + ", " + firstName;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public void raiseSalary(double percent) {
		annualSalary = annualSalary * ((100 + percent) / 100);
	}
	
	

}
