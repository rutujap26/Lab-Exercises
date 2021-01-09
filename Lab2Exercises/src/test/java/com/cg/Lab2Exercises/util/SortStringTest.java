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

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortStringTest {
	private SortString sortStringArray;

	@Before
	public void setUp() {
		sortStringArray = new SortString();
	}
	
	@Test
	public void testCalculate_GivenEmptyString_ShouldReturnNullAsResult(){
		String[] inputString = {};
		String[] result = sortStringArray.sortString(inputString);
		assertArrayEquals(null, result);
	}
	@Test
	public void testCalculate_GivenSingleString_ShouldReturnSingleStringAsResult(){
		String[] inputString = {"cat"};
		String[] expected = {"CAT"};
		String[] result = sortStringArray.sortString(inputString);
		assertArrayEquals(expected, result);
	}
	@Test
	public void testCalculate_GivenMutipleString_ShouldReturnSortedStringAsResult(){
		String[] inputString = {"cat","dog","peacock","owl","parrot","cow"};
		String[] expected = {"CAT","COW","DOG","owl","parrot","peacock"};
		String[] result = sortStringArray.sortString(inputString);
		assertArrayEquals(expected, result);
	}
	

}
