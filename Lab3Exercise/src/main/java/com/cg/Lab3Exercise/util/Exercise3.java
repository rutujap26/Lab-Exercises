/**
 * Create a method which accepts a String and replaces all the consonants 
 * in the String with the next alphabet. 
 * 
 * @author rutuja pise
 */


package com.cg.Lab3Exercise.util;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Altered String: " + alterString(str));
		sc.close();

	}

	public static String alterString(String inputString) {
		StringBuffer sb = new StringBuffer(inputString);
		
		if(inputString.length()==0) {
			return null;			
		}
		else {
			for (int i = 0; i < inputString.length(); i++) {
				char cons = sb.charAt(i);
				if (!(cons == 'A' || cons == 'a' || cons == 'E' || cons == 'e' || cons == 'I' || cons == 'i' || cons == 'O'
						|| cons == 'o' || cons == 'U' || cons == 'u')) {
					String st = String.valueOf((char)(cons+1));
					sb.replace(i, i + 1, st);
				}
			}
			return sb.toString();
		}
	}

}
