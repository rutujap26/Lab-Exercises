/**
 * Exercise 3
 * Create a method which accepts an integer array, reverse the numbers in the array and 
 * returns the resulting array in sorted order
 * 
 * @author rutuja pise
 */

package com.cg.Lab2Exercises.util;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntegerArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter numbers: ");
		int[] numArray = new int[size];
		for(int i=0; i<size; i++) {
			numArray[i] = sc.nextInt();
		}
		getSorted(numArray);
		sc.close();

	}

	public static int[] getSorted(int[] array) {
		int length = array.length;
		int result[] = new int[length];
		StringBuilder sb = new StringBuilder();
		if(length==0) {
			return null;
		}
		else if(length==1) {
			sb.append(array[0]);
			sb.reverse();
			result[0] = Integer.parseInt(sb.toString());
			return result;
		}
		else {
			int j = length;
			for(int i=0; i<length; i++) {
				result[j-1] = array[i];
				j--;
			}
			System.out.println("Reversed array: ");
			for(int k=0; k<length; k++) {
				System.out.println( result[k]);
			}
			
			Arrays.sort(result);
			System.out.println("Sorted Array: "+Arrays.toString(result));
		}
		return result;
		
	}

}
