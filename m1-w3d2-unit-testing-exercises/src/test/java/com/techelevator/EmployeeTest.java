package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 

public class EmployeeTest {
	Employee j;
	 
	@Before
	public void createEmployee() {
		j = new Employee(007, "James", "Bond", 3.2);
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull("The man is here", j);
		
	}
	
	@Test
	public void testGettersAndFullName() {
		Assert.assertEquals("Bond", j.LastName());
		Assert.assertEquals("James", j.FirstName());
		Assert.assertEquals("Bond, James Bond", j.FullName());
		Assert.assertEquals(3.2, j.getAnnualSalary(), .0001);
	}
	@Test
	public void testRaiseSalary() {
		j.RaiseSalary(100);
		Assert.assertEquals(6.4, j.getAnnualSalary(), .0001);
	}
	
	
	

}
