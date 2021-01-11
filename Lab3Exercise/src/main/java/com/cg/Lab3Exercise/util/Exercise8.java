/**
 * Create a method that accepts a String and checks if it is a positive string. A string is considered 
 * a positive string, if on moving from left to right each character in the String comes after 
 * the previous characters in the Alphabetical order. For Example: ANT is a positive String 
 * (Since T comes after N and N comes after A). The method should return true if the entered string is positive.
 * 
 * @author rutuja pise
 */

package com.cg.Lab3Exercise.util;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		if(positiveString(str)) {
			System.out.println("Positive String");
		}
		else {
			System.out.println("Not A Positive String");
		}
		sc.close();

	}

	private static boolean positiveString(String str) {
		int length = str.length();
		char c[] = new char[length];
		for(int i=0; i<length; i++) {
			c[i] = str.charAt(i);
		}
		Arrays.sort(c);
		for(int i=0; i<length; i++) {
			if(c[i] != str.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}

}
