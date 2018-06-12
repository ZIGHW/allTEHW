package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WordSearch {

	public static void main(String[] args) {
		List<String> allLines = new ArrayList<String>();
		Scanner userInput;
		Scanner aliceInput;
		try {
			 userInput = new Scanner(System.in);
			
			 aliceInput = new Scanner(new File("alices_adventures_in_wonderland.txt"));
			
		} catch (FileNotFoundException exc) {
			System.out.println("Alles ist verlassen");
			return;
		}
		System.out.println("Enter the word or character that we should search Alice in Wonderland for:");
		String searchFor = userInput.nextLine();
		boolean theyTryin = true;
		String caseSensitiveReply;
		boolean caseSensitive = false;
		
		while (theyTryin) {
			System.out.println("Should the search be case sensitive?? (Y)es or (N)o?");
			caseSensitiveReply = userInput.nextLine();
			if (caseSensitiveReply.equals("Y") || caseSensitiveReply.equals("y")) {
				caseSensitive = true;
				theyTryin = false;
			}else if (caseSensitiveReply.equals("N") || caseSensitiveReply.equals("n")) {
				caseSensitive = false;
				theyTryin = false;
			} else {
				System.out.println("That's not vail input try again!");
				continue;
			}
		}
		
		
		
		int lineCounter = 0;
		
		while(aliceInput.hasNextLine()) {
			String line = aliceInput.nextLine();
			lineCounter++;
			if (caseSensitive) {
				if (Pattern.compile(Pattern.quote(searchFor), Pattern.CASE_INSENSITIVE).matcher(line).find()) {
					allLines.add(Integer.toString(lineCounter) + ") " + line);
				}
			} else {
				if (line.contains(searchFor)) {
					allLines.add(Integer.toString(lineCounter) + ") " + line);
				}
			}
				
		}
		
		System.out.println("So we found " + allLines.size() + " occurences of where " + searchFor + " appeared. Here they are:\n");
		for (String eachLine : allLines) {
			System.out.println(eachLine);
		}
	}

}
