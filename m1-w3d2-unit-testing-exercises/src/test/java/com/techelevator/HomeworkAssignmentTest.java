package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class HomeworkAssignmentTest {
	
	
	HomeworkAssignment h;
	
	@Before
	public void makeHomework() {
		h = new HomeworkAssignment(100);
	}
	
	@Test
	public void testExistence() {
		Assert.assertNotNull(h);
		Assert.assertEquals(100, h.getPossibleMarks());
	}
	
	@Test
	public void testGettersAndSetter() {
		h.setSubmitterName("Boom");
		Assert.assertEquals("Boom", h.getSubmitterName());
		h.setTotalMarks(100);
		Assert.assertEquals(100, h.getTotalMarks());
	}
	
	@Test
	public void testGetLetterGrade() {
		h.setTotalMarks(65);
		Assert.assertEquals("D", h.getLetterGrade());
		
	}

}
