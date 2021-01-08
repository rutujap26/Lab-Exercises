/**
 * Exercise 1
 * Create a method which accepts an array of integer elements and 
 * return the second smallest element in the array
 * @author rutuja pise
 */

package com.cg.Lab2Exercises.util;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Second smallest element in array is: "+getSecondSmallest(arr));
		sc.close();

	}

	public static int getSecondSmallest(int[] intArray) {
		if(intArray.length==0) {
			return 0;
		}
		else if(intArray.length>=2) {
			for (int i = 0; i < intArray.length; i++) {
				for (int j = i + 1; j < intArray.length; j++) {
					if (intArray[i] > intArray[j]) {
						int temp = intArray[i];
						intArray[i] = intArray[j];
						intArray[j] = temp;
					}
				}
			}
			return intArray[1];
		}
		return 3;
	}

}
