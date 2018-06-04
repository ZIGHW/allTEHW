package com.techelevator;

public class HomeworkAssignment {
	int totalMarks;
	int possibleMarks;
	String submitterName;
	String letterGrade;
	
	public HomeworkAssignment(int possibleMarks){
		this.possibleMarks = possibleMarks;
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int possibleMarks() {
		return possibleMarks;
	}
	
	public String getSubmitterName() {
		return submitterName;
	}
	
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public String getLetterGrade() {
		double totalMarksd = totalMarks;
		double possibleMarksd = possibleMarks;
		double grade = ((totalMarksd / possibleMarksd) * 100);
		
		if (grade >= 90) {
			letterGrade = "A";
		} else if (grade >= 80) {
			letterGrade = "B";
		} else if (grade >= 70) {
			letterGrade = "C";
		} else if (grade > 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		return letterGrade;
	}
	
	
}
