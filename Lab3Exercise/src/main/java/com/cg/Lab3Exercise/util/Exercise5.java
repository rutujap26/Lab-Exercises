/**
 * Write a Java program that displays the number of characters, lines and words in a text
 * 
 * @author rutuja pise
 */

package com.cg.Lab3Exercise.util;

public class Exercise5 {

	public static void main(String[] args) {
		
		String str = "Good Morning Everyone, Have a great day ahead";
		String words[] = str.split(",.");
		String lines[] = str.split("\n");
		System.out.println("Number of characters: "+str.length());
		System.out.println("Number of words: "+words.length);
		System.out.println("Number of lines: "+lines.length);

	}

}
