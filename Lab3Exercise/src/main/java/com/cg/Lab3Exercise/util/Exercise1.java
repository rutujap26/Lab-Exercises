/**
 * Write a Java program that reads a line of integers and 
 * then displays each integer and the sum of all integers. 
 * (Use String Tokenizer class)
 * 
 * @author rutuja pise
 */

package com.cg.Lab3Exercise.util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum=0;
		String temp;
		System.out.println("Enter Integers: ");
		String str =sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			temp = st.nextToken();
			num = Integer.parseInt(temp);
			sum = sum + num;
		}
		System.out.println("Sum of all integers is :"+sum);
		sc.close();

	}

}
