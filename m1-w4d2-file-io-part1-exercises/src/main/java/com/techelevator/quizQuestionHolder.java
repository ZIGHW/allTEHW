package com.techelevator;


public class quizQuestionHolder {
	public String[] questions;
	public String question = "";
	public int correct;
	
	quizQuestionHolder(String newLine){
		this.questions = newLine.split("\\|");
		this.question = questions[0];
		findCorrectAndRemove(questions);
	}
	
	public void findCorrectAndRemove(String[] questions) {
		for (int i = 0; i < questions.length; i++) {
			String question = questions[i];
			if (question.contains("*")) {
				this.correct = i;
				questions[i] = question.replaceAll("\\*", "");
			}
		}
	}
	

}

//What color is the sky?|yellow|blue*|green|red