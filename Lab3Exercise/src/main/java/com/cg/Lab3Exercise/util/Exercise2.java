/**
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol.
 * 
 * @author rutuja pise
 *
 */

package com.cg.Lab3Exercise.util;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println(getImage(str));
		sc.close();

	}

	public static String getImage(String inputString) {
		StringBuffer st = new StringBuffer();
		if(inputString.length()==0) {
			return null;
		}
		else {
			StringBuffer sb1 = new StringBuffer(inputString);
			sb1.append('|');
			StringBuffer sb2 = new StringBuffer(inputString);
			sb2.reverse();
			st = sb1.append(sb2);
		}
		return st.toString();
	}

}
