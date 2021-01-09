/**
 * Exercise 3
 * Create a method which accepts an integer array, reverse the numbers in the array and 
 * returns the resulting array in sorted order
 * 
 * @author rutuja pise
 */


package com.cg.Lab2Exercises.util;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class SortIntegerArrayTest {
	private SortIntegerArray integerArray;

	@Before
	public void setUp() {
		integerArray = new SortIntegerArray();
	}
	
	@Test
	public void testCalculate_GivenEmptyIntegerArray_ShouldReturnNullAsInteger(){
		int[] numArray = {};
		int[] result = integerArray.getSorted(numArray);
		assertEquals(null, result);
	}
	@Test
	public void testCalculate_GivenSingleIntegerArray_ShouldReturn5AsInteger(){
		int[] numArray = {5};
		int[] result = integerArray.getSorted(numArray);
		assertArrayEquals(numArray, result);
	}
	@Test
	public void testCalculate_GivenThreeIntegerArray_ShouldReturn5AsInteger(){
		int[] numArray = {5,2,9};
		int[] expected = {2,5,9};
		int[] result = integerArray.getSorted(numArray);
		assertArrayEquals(expected, result);
	}
	
	
}
