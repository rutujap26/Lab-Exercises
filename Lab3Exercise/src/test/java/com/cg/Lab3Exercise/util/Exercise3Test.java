/**
 * Create a method which accepts a String and replaces all the consonants 
 * in the String with the next alphabet. 
 * 
 * @author rutuja pise
 */


package com.cg.Lab3Exercise.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Exercise3Test {
	private Exercise3 object;

	@Before
	public void setUp() {
		object = new Exercise3();
	}

	@Test
	public void test_alterString_GivenEmptyStringAsInput_ShouldReturnNullAsResult() {
		String inputString = "";
		String result = object.alterString(inputString);
		assertEquals(null, result);
	}

	@Test
	public void test_alterString_GivenRUTUJAStringAsInput_ShouldReturnSUUUKAAsResult() {
		String inputString = "RUTUJA";
		String expected = "SUUUKA";
		String result = object.alterString(inputString);
		assertEquals(expected, result);
	}
}
