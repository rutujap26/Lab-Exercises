/**
 * Write a Java program that displays the number of characters, lines and words in a text
 * 
 * @author rutuja pise
 */

package com.cg.Lab3Exercise.util;

import java.io.*;

public class Exercise5 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\rutuj\\Desktop\\Capgemini\\STS Assignments\\Lab3Exercise\\test.txt");
		int lines = 1, words = 1;
		int length = file.available();
		char ch;
		for(int i=0; i<=length; i++) {
			ch = (char)file.read();
			if(ch=='\n') {
				lines++;
			}
			else if(ch == ' '){
				words++;
			}
		}
		System.out.println("Number of Characters: "+length);
		System.out.println("Number of Lines: "+lines);
		System.out.println("Number of Words: "+words);
		
	}

}
