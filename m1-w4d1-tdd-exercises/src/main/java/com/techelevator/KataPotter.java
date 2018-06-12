package com.techelevator;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KataPotter {
	
	public double getCost(int[] books) {
		
		List<Integer> bookList = new ArrayList<Integer>();
		for (Integer i : books){
		    bookList.add(i);
		}
		int countDat = 0;
		List<Integer> splitBookList = new ArrayList<Integer>();
		Map<Integer, Integer > occurences = new HashMap<Integer, Integer>();
		
		occurences.put(0, 0);
		occurences.put(1, 0);
		occurences.put(2, 0);
		occurences.put(3, 0);
		occurences.put(4, 0);
		occurences.put(5, 0);
		
		for (int i = 0; i < books.length; i++) {
			occurences.put(books[i], occurences.get(books[i]) + 1);	
		}

		for (Integer key : occurences.keySet()) {
			if (occurences.get(key) >= 2) {
				countDat++;
			}
		}
		
		if (countDat >= 2) {
			for (Integer key : occurences.keySet()){
				if (occurences.get(key) >= 2) {
					splitBookList.add(key);
					bookList.remove(key);
				}
			}
		}
		double bookListCost = giveMeDatCost(bookList);
		double splitListCost = giveMeDatCost(splitBookList);
		double totalCost = bookListCost + splitListCost;
		return totalCost;
		
		
	}
	
	

	public double giveMeDatCost(List<Integer> bookList) {
		int count = 0;
		int howBig = bookList.size();
		while(bookList.size() > 0) {
			count++;
			int bookSave = bookList.get(0);
			bookList.remove(new Integer (bookSave));
			if (bookList.contains(bookSave)) {
				while(bookList.contains(bookSave)) {
					bookList.remove(new Integer(bookSave));
				}
			}
		}
		double percent = 0;
		
		switch (count) {
		case 1: percent = 0;
				break;
		case 2: percent = .05;
			break;
		case 3: percent = .10;
			break;
		case 4: percent = .20;
			break;
		case 5: percent = .25;
			break;
		}
		
		double moneySaved = (count * 8) * percent;
		double totalCost = (howBig * 8) - moneySaved;
		return totalCost;
	}
}


