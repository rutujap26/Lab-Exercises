/**
 * Create a method that accepts a number and modifies it such that the each 
 * of the digit in the newly formed number is equal to the difference 
 * between two consecutive digits in the original number. 
 * The digit in the units place can be left as it is. 
 * Note: Take the absolute value of the difference. Ex: 6-8 = 2
 * 
 * @author rutuja pise
 */

package com.cg.Lab3Exercise.util;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Modified Number: "+modifyNumber(num));
		sc.close();
	}
	static int modifyNumber(int n) {
		String str = Integer.toString(n);
		int diff[] = new int[str.length()];
		for (int i=0; i<str.length()-1; i++) {
			char c1 = str.charAt(i);
			int number1 = Integer.parseInt(String.valueOf(c1));
			char c2 = str.charAt(i+1);
			int number2 = Integer.parseInt(String.valueOf(c2));
			diff[i] = Math.abs(number1-number2);	
		}
		int mNum = 0;
		for(int j=0; j<diff.length-1; j++) {
			mNum = 10*mNum+diff[j];
		}
		return mNum;
		
	}

}
