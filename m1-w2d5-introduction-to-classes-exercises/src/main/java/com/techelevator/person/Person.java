package com.techelevator.person;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFullName() {
		return (lastName + ", " + firstName);
	}
	
	public boolean isAdult() {
		return (this.age >= 18);
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
//
//	 Attribute | Data Type | Get | Set | Description |
//	 |----------|-----------|-----|-----|-------------|
//	 | firstName | String | X | X | The first name of the person.  |
//	 | lastName | String | X | X | The last name of the person. |
//	 | age | int | X | X | The age of the person. |
//
//	 ### Methods
//
//	     public String getFullName()
//	     public boolean isAdult()
//
//	 **Notes**
//	 - `getFullName()` returns the `lastName` + ", " + `firstName`.
//	 - `isAdult()` returns `true` if the person is 18 or older.
//
//	 ### Constructors
//
//	 The `Person` class uses the default constructor.

	
}
