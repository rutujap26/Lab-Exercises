/**
 * Exercise 1
 * Create a method which accepts an array of integer elements and 
 * return the second smallest element in the array
 * @author rutuja pise
 */

package com.cg.Lab2Exercises.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SecondSmallestTest {
	private SecondSmallest secondSmallest; 
	private int[] TWO_INTEGER_ARRAY = {3,5};

	@Before
	public void setUp(){
		secondSmallest = new SecondSmallest();
	}

	@Test
	public void test_getSecondSmallest_GivenEmptyIntegerArray_ShouldReturn0AsInteger() {
		int[] intArray = {};
		int result = secondSmallest.getSecondSmallest(intArray);
		assertEquals(0, result);
		
	}
	@Test
	public void test_getSecondSmallest_GivenSingleIntegerArray_ShouldReturn3AsInteger() {
		int[] intArray = {3};
		int result = secondSmallest.getSecondSmallest(intArray);
		assertEquals(3, result);
	}
	@Test
	public void test_getSecondSmallest_GivenTwoIntegerArray_ShouldReturn5AsInteger() {
		int result = secondSmallest.getSecondSmallest(TWO_INTEGER_ARRAY);
		assertEquals(5, result);
	}
	@Test
	public void test_getSecondSmallest_GivenMuThreeIntegerArray_ShouldReturn5AsInteger() {
		int[] intArray = {1,3,5,8};
		int result = secondSmallest.getSecondSmallest(intArray);
		assertEquals(3, result);
	}

}
