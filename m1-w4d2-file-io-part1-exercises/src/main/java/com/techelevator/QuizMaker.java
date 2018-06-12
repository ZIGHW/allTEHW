package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		Scanner userInput;
		Scanner quizInput;
		try {
			 userInput = new Scanner(System.in);
			
			 quizInput = new Scanner(new File("test_quiz.txt"));
			
		} catch (FileNotFoundException exc) {
			System.out.println("Alles ist verlassen");
			
			return;
		}
		int correct = 0;
		while(quizInput.hasNextLine()) {
			System.out.println("Alright so we're going to do a pretty boring two question Quiz... here we go:");
			quizQuestionHolder q = new quizQuestionHolder(quizInput.nextLine());
			System.out.println("The question is " + q.question);
			System.out.printf("1. %s \n2. %s \n3. %s \n4. %s \n", q.questions[1], q.questions[2], q.questions[3], q.questions[4]);
			System.out.println("Enter the answer number you think is correct:");
			String answer = userInput.nextLine();
			boolean stayInHere = true;
			while (stayInHere) {
				try {
					if (Integer.parseInt(answer) == q.correct) {
						System.out.println("Nice work!\n");
						correct++;
						stayInHere = false;
					} else if (Integer.parseInt(answer) > 4 || Integer.parseInt(answer) < 1) {
						System.out.println("That's not a valid answer please try again.");
						continue;
					} else {
						System.out.println("Sorry that's wrong. Maybe next time!");
						stayInHere = false;
						
					}
				} catch (NumberFormatException exc) {
					System.out.println("That's no a valid answer please try again.");
					continue;
				}	
				
			}
			System.out.println("Alright so you got " + correct + " out of 2 correct. Thanks for playing pal.");
			
		}
		userInput.close();
		quizInput.close();
	}
	

}
