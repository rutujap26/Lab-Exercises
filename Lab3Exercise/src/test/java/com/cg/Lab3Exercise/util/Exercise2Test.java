/**
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol.
 * 
 * @author rutuja pise
 *
 */
package com.cg.Lab3Exercise.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Exercise2Test {
	private Exercise2 object;

	@Before
	public void setUp(){
		object = new Exercise2();
	}

	@Test
	public void test_getImage_GivenEmptyString_ShouldReturnNullAsString() {
		String inputString = "";
		String result = object.getImage(inputString);
		assertEquals(null, result);
	}
	@Test
	public void test_getImage_GivenEARTHString_ShouldReturnImageAsString() {
		String inputString = "EARTH";
		String expected = "EARTH|HTRAE";
		String result = object.getImage(inputString);
		assertEquals(expected, result);
	}
	@Test
	public void test_getImage_GivenNORMALString_ShouldReturnImageAsString() {
		String inputString = "NORMAL";
		String expected = "NORMAL|LAMRON";
		String result = object.getImage(inputString);
		assertEquals(expected, result);
	}

}
