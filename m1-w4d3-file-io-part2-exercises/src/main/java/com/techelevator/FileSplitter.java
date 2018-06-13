package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		Scanner aliceInput;
		Scanner userInput;
		boolean trying = true;
		PrintWriter writeAlice;
		File newFile;
		
		try {
			newFile = new File("AliceSplit/split1.txt");
			newFile.createNewFile();
			System.out.println("created split1");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("it's ruined");
		}
		
		
		try {
			 userInput = new Scanner(System.in);
			
			 aliceInput = new Scanner(new File("AliceSplit/alices_adventures_in_wonderland copy.txt"));
			 writeAlice = new PrintWriter("AliceSplit/split1.txt");
			
		} catch (FileNotFoundException exc) {
			exc.printStackTrace();
			System.out.println("Alles ist verlassen");
			return;
		}
		int whereToSplit = 0;
		while(trying) {
			try {
				System.out.println("How many lines should be in each output file??");
				whereToSplit = Integer.parseInt(userInput.nextLine());	
				System.out.println("Alright cool here we go!");
				trying = false;
			} catch(NumberFormatException e) {
				e.printStackTrace();
				System.out.println("That response is invalid please try again.");
				continue;
			}
		}
		int count = 0;
		int fileCount = 2;
		while (aliceInput.hasNextLine()) {
			//Since count is greater than whereToSplit after creating last file to write in you create one more file
			if (count > whereToSplit && aliceInput.hasNextLine()) { 
				try {
					newFile = new File("AliceSplit/split" + Integer.toString(fileCount) + ".txt");
					newFile.createNewFile();
					writeAlice = new PrintWriter(newFile);
					fileCount++;
					count = 0;
					
					System.out.println("newfile created: " + newFile.toString());
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Couldn't make the new file?");
				}
			}
			writeAlice.println(aliceInput.nextLine());
			count++;
		}

	}

}


