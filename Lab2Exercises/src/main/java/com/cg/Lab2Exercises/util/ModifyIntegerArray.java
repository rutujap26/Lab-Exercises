/**
 * Exercise 4
 * Create a method which accepts an integer array and removes all the duplicates in the array. 
 * Return the resulting array in descending order
 * 
 * @author rutuja pise
 */

package com.cg.Lab2Exercises.util;

import java.util.Scanner;

public class ModifyIntegerArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter numbers in array: ");
		int[] array = new int[size];
		for(int i=0; i<size;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Modified Array: ");
		int[] result = modifyArray(array);
		for(int j=0; j<size; j++) {
			System.out.println(result[j]);
		}
		sc.close();
	}

	public static int[] modifyArray(int[] arr) {
		int temp;
		for(int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int[] output = new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				output[j++] = arr[i];
			}
		}
		output[j++] = arr[arr.length-1];
		for(int k=0; k<j; k++) {
			arr[k] = output[k];
		}
		return arr;
	}

}
