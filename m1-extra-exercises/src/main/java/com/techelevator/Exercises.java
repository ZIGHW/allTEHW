package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercises {

    /*
    Given an integer array, return the array with all of the duplicate values removed.
    arrayDeduplication([8, 13, 13, 9, 11, 12]) → [8, 13, 9, 11, 12]
    arrayDeduplication([]) → []        
    arrayDeduplication([1, 1, 1]) → [1]
    */
    public int[] arrayDeduplication(int[] nums) {
    	List<Integer> noDupes = new ArrayList<Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		int checking = nums[i];
    		if (!noDupes.contains(checking)){
    			noDupes.add(checking);
    		}
    	}
    	
    	int[] noDupesArr = new int[noDupes.size()];
    	for (int c = 0; c < noDupesArr.length; c++) {
    		noDupesArr[c] = noDupes.get(c);
    	}
    	return noDupesArr;
    }
    
    /*
    CHALLENGE: Using array A and array B, return an array that is the intersection of both A and B.
    The intersection includes numbers that appear in both arrays.
        arrayIntersection([1, 3, 5], [1, 5, 7]) → [1, 5]
        arrayIntersection([1], [1, 5, 7]) → [1]
        arrayIntersection([1, 1, 1], [1, 5, 7]) → [1]
        arrayIntersection([], []) → []
    */
    public int[] arrayIntersection(int[] a, int[] b) {
    	List<Integer> aList  = Arrays.stream( a ).boxed().collect( Collectors.toList() );
    	List<Integer> bList  = Arrays.stream( b ).boxed().collect( Collectors.toList() );
    	
    	Set<Integer> setA = new HashSet<Integer>(aList);
    	Set<Integer> setB = new HashSet<Integer>(bList);
    	setA.retainAll(setB);
    	
    	Integer[] crossSection = setA.toArray(new Integer[setA.size()]);
    	int[] crossSectionCorrect = new int[crossSection.length];
    	for (int i = 0; i < crossSection.length; i++) {
    		crossSectionCorrect[i] = (int) crossSection[i];
    	}
    	return crossSectionCorrect;
    }
    	
    	
    	
    
    /*
    Given an integer array, return the array sorted lowest to highest.
    CHALLENGE: Write the Sort algorithm, don't use the .Sort() method provided to an array. 
    arraySort([8, 13, 9, 12]) → [8, 9, 12, 13]        
    */
    public int[] arraySort(int[] nums) {
        return null;
    }

    /*
    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
    Return 0 if they both go over.
    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19
    */
    public int blackjack(int a, int b) {
    	if (a > 21 && b > 21) {
    		return 0;
    	} else if (((21 - a) <= (21 - b) && (21 - a) >= 0) || b > 21) {
    		return a;
    	} else {
    		return b;
    	}
    }
    
    /*
    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), 
    while the other is "far", differing from both other values by 2 or more.
    Note: Math.abs(num) computes the absolute value of a number.
    closeFar(1, 2, 10) → true
    closeFar(1, 2, 3) → false
    closeFar(4, 1, 3) → true
    */
    public boolean closeFar(int a, int b, int c) {
    	if (Math.abs(a - b) <= 1 && Math.abs(a-c) >= 2 && Math.abs(b-c) >= 2  ) {
    		return true;
    	} else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(c-b) >= 2  )
    		return true;
    	
    	return false;
    }
    /*
    CHALLENGE: Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
    Return the number of clumps in the given array.
    countClumps([1, 2, 2, 3, 4, 4]) → 2
    countClumps([1, 1, 2, 1, 1]) → 2
    countClumps([1, 1, 1, 1, 1]) → 1
    */
    public int countClumps(int[] nums) {
    	//System.out.println(Arrays.toString(nums));
    	
    	int tail = 0;
    	
    	int count = 0;
    	boolean startAgain = true;
    	
    	
    	for (int i = 1; i < nums.length; i++) {
    		
    		
//    		if (startAgain == true) {
//    			tail++;
//    			if (nums[tail] == nums[i]) {
//            		count++;
//            		startAgain = false;
//    		}
//    			
//    		} else if (startAgain == false && nums[tail] != nums[i]) {
//    			tail = i;
//    			i++;
//    			startAgain = true;
//    			
//    		} else {
//    			tail++;
//    		}
//    		System.out.println(nums[tail] + "   i= " + nums[i]);
//    	}
        return count;
    }

    /*
    CHALLENGE: Write the algorithm to find a sorted list of all the unique permutations of a string.  
    There should be no duplicates in the sorted list.
    If the string is null or empty, return an empty list;
    findPermutations(null) → {}
    findPermutations("") → {}
    findPermutations("A") → {"A"}
    findPermutations("ABC") → {"ABC","ACB","BAC","BCA","CAB","CBA"}
    */
    public List<String> findPermutations(String str)
    {            
        return null;
    }

    /*
    * Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by 
    * the value plus 5, followed by the value minus 1. 
    * Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
    * has271([1, 2, 7, 1]) → true
    * has271([1, 2, 8, 1]) → false
    * has271([2, 7, 1]) → true     
    */
    public boolean has271(int[] nums) {
    //This test is garbage or I don't understand the directions.
    	int tail = 0;
    //	System.out.println(Arrays.toString((nums)));
    	for (int i = 1; i < nums.length; i++) {
    		if (nums[tail] == nums[i] - 5) {
    		//	System.out.println("first part met");
    		
    			if (i + 1 == nums.length) {
    				return false;
    			} else if (Math.abs(nums[tail] - nums[i+1]) <= 1) {
    				return true;
    			}
  
    		}
    		tail++;
    		
    	}
    	
        return false;
    }

    /*
    Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
    The ints are non-negative. 
    Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
    lastDigit(23, 19, 13) → true
    lastDigit(23, 19, 12) → false
    lastDigit(23, 19, 3) → true
    */
    public boolean lastDigit(int a, int b, int c) {
    	String aStr = Integer.toString(a);
    	String bStr = Integer.toString(b);
    	String cStr = Integer.toString(c);
    	
    	char aLastDigit = aStr.charAt(aStr.length() -1);
    	char bLastDigit = bStr.charAt(bStr.length() -1);
    	char cLastDigit = cStr.charAt(cStr.length() -1);
    	return (aLastDigit == bLastDigit || aLastDigit == cLastDigit || bLastDigit == cLastDigit);
    	 
    }

    /*
    We want to make a row of bricks that is goal inches long. 
    We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
    Return true if it is possible to make the goal by choosing from the given bricks. 
    This is a little harder than it looks and can be done without any loops.
    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
    */
    public boolean makeBricks(int small, int big, int goal) {
 
        return false;
    }

    /*
    CHALLENGE: Given a string, return the length of the largest "block" in the string. 
    A block is a run of adjacent chars that are the same.
    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
    */
    public int maxBlock(String str) {
    	if (str.length() == 0)
    		return 0;
    	int maxCount = 1;
    	int count = 1;
    	int tail = 0;
    	for (int i = 1; i < str.length(); i++) {
    		if (str.charAt(tail) == str.charAt(i)) {
    			count += 1;
    			if (count >= maxCount) 
    				maxCount = count;
    		} else {
    			count = 1;
    			tail = i;
    		}
    		
    	}
        return maxCount;
    }

    /*
    CHALLENGE: Consider the leftmost and righmost appearances of some value in an array.
    We'll say that the "span" is the number of elements between the two inclusive. 
    A single value has a span of 1. 
    Returns the largest span found in the given array. (Efficiency is not a priority.)
    maxSpan([1, 2, 1, 1, 3]) → 4
    maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
    maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
    */
    public int maxSpan(int[] nums) {
        return 0;
    }

    /*
    * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
    * mixStart("mix snacks") → true
    * mixStart("pix snacks") → true
    * mixStart("piz snacks") → false        
    */
    public boolean mixStart(String str) {
    	return ( str.length() !=  str.replaceAll(".ix", "").length());
    }

    /*
    Given an array of ints, return true if the number of 1's is greater than the number of 4's
    more14([1, 4, 1]) → true
    more14([1, 4, 1, 4]) → false
    more14([1, 1]) → true
    */
    public boolean more14(int[] nums) {
    	int count1 = 0;
    	int count4 = 0;
    	for (int num : nums)	{
    		if (num == 4) {
    			count4++;
    		} else if (num == 1) {
    			count1++;
    		}
    	}
        return (count4 < count1);
    }
    
    /*
    * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in 
    * the array. Return true if the array does not contain any triples.        
    *
    * noTriples([1, 1, 2, 2, 1]) → true
    * noTriples([1, 1, 2, 2, 2, 1]) → false
    * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
    */
    public boolean noTriples(int[] nums) {
    	int tail;
    	int middle;
    	for (int i = 2; i < nums.length; i++) {
    		tail = i - 2;
    		middle = i - 1;
    		if (nums[tail] == nums[middle] && nums[middle] == nums[i]) {
    			return false;
    		}
    	}
    	return true;
    }

    /*
    * Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". 
    * Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". 
    * Ignore any group of fewer than 3 chars at the end.
    * oneTwo("abc") → "bca"
    * oneTwo("tca") → "cat"
    * oneTwo("tcagdo") → "catdog"
    */
    public String oneTwo(String str) {
    	int num3s = str.length() / 3;
    	String oneTwoed = "";
    	for (int i = 0; i < num3s * 3; i+=3) {
    		oneTwoed += str.substring(i + 1, i + 3) + str.substring(i, i+1);
    	}
        return oneTwoed;
    }
    
    /*
    * Given two strings, word and a separator sep, return a big string made of count occurrences 
    * of the word, separated by the separator string.
    * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    * repeatSeparator("This", "And", 2) → "ThisAndThis"
    * repeatSeparator("This", "And", 1) → "This"
    */
    public String repeatSeparator(String word, String sep, int count) {
    	String bigStr = "";
    	
    	for (int i = 0; i < count; i++) {
    		bigStr += word; 
    				
    		if (i + 1 != count) {
    			bigStr += sep;
    		}
    	}
        return bigStr;
    }

    /*
    * Return true if the given string contains between 1 and 3 'e' chars.
    * ("Hello") → true
    * ("Heelle") → true
    * ("Heelele") → false
    */
    public boolean stringE(String str) {
    	int eCount = 0;
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == 'e') {
    			eCount++;
    		}
    	}
        return (eCount >= 1 && eCount <= 3);
    }
    
    /*
    * Given 2 strings, a and b, return the number of the positions where they contain the same length 
    * 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" 
    * substrings appear in the same place in both strings.        * 
    * stringMatch("xxcaazz", "xxbaaz") → 3
    * stringMatch("abc", "abc") → 2
    * stringMatch("abc", "axc") → 0  
    */
    public int stringMatch(String a, String b) {
        return 0;
    }

    /*
    Return true if the array contains, somewhere, three increasing adjacent numbers like 
    .... 4, 5, 6, ... or 23, 24, 25.
    tripleUp([1, 4, 5, 6, 2]) → true
    tripleUp([1, 2, 3]) → true
    tripleUp([1, 2, 4]) → false
    */
    public boolean tripleUp(int[] nums) {
    	for (int i = 2; i < nums.length; i++) {
    		int tail = i - 2;
    		int middle = i - 1;
    		if (nums[i] - nums[middle] == 1 && nums[middle] - nums[tail] == 1) {
    			return true;
    		}
    	}
        return false;
    }

    /*
    * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and 
    * ending with 'p'. Return a string where for all such words, the middle letter is gone. 
    * "zipXzap" yields "zpXzp".
    * zipZap("zipXzap") → "zpXzp"
    * zipZap("zopzop") → "zpzp"
    * zipZap("zzzopzop") → "zzzpzp"
    */
    public String zipZap(String str) {
    	return str.replaceAll("z.p", "zp");
    }
}
