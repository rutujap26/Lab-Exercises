/**
 * Exercise 2
 * Create a method that can accept an array of String objects and sort in alphabetical 
 * order. The elements in the left half should be completely in uppercase and the elements 
 * in the right half should be completely in lower case. Return the resulting array.
 * Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
 * 
 * @author rutuja pise
 */

package com.cg.Lab2Exercises.util;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		String[] array = new String[size];
		System.out.println("Enter Strings: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.next();
		}
		System.out.println("Sorted Array: " + sortString(array));
		sc.close();

	}

	public static String sortString(String[] inputArray) {
		int length = inputArray.length;
		String result = new String();
		StringBuilder sb = new StringBuilder();
		if (length == 0) {
			throw new RuntimeException("No Input");
		} else if (length == 1) {
			result = inputArray[0].toUpperCase();
			return result;
		} else if (length > 1) {

			Arrays.sort(inputArray);
			int size = inputArray.length;
			if (size % 2 != 0) {
				for (int i = 0; i < size; i++) {
					if (i < (size / 2) + 1) {
						inputArray[i] = inputArray[i].toUpperCase();
						sb.append(inputArray[i] + " ");
					} else {
						inputArray[i] = inputArray[i].toLowerCase();
						sb.append(inputArray[i] + " ");
					}
				}
			} else {
				for (int i = 0; i < size; i++) {
					if (i < (size / 2)) {
						inputArray[i] = inputArray[i].toUpperCase();
						sb.append(inputArray[i] + " ");
					} else {
						inputArray[i] = inputArray[i].toLowerCase();
						sb.append(inputArray[i] + " ");
					}
				}
			}
		}
		return sb.toString();

	}
}
