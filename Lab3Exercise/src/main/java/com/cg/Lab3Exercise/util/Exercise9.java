/**
 * Create a method to accept date and print the duration in days, months 
 * and years with regards to current system date.
 * 
 * @author rutuja pise
 */

package com.cg.Lab3Exercise.util;

import java.time.LocalDate;
import java.time.Period;

public class Exercise9 {

	public static void main(String[] args) {
		LocalDate inputDate = LocalDate.of(2016, 4, 22);
		LocalDate sysDate = LocalDate.now();
		
		Period diff = Period.between(inputDate, sysDate);
		
		int years = diff.getYears();
		int months = diff.getMonths();
		int days = diff.getDays();
		
		System.out.println("Duration between two dates: "+years+" years, "+months+" months, "+days+"days");
	}
	
}
