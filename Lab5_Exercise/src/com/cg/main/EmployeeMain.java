/**
 * 
 * 
 * @author rutuja pise
 */

package com.cg.main;

import java.util.Scanner;

import com.cg.Exception.InvalidAgeException;
import com.cg.Exception.InvalidNameException;
import com.cg.Exception.InvalidSalaryException;

public class EmployeeMain {

	
	public static void validateAge(int age) throws InvalidAgeException  {
		if(age<15) {
			throw new InvalidAgeException("Invalid Age....Enter Valid Age");
		}
		else {
			System.out.println("Valid Age");
		}

	}

	public static void validateName(String firstName, String lastName) throws InvalidNameException {
		if(firstName.isEmpty() || lastName.isEmpty()) {
			throw new InvalidNameException("Invalid Name....Enter Valid Name");
		}
		else {
			System.out.println("Valid Name");
		}

	}

	public static void validateSalary(double salary) throws InvalidSalaryException {
		if(salary<3000) {
			throw new InvalidSalaryException("Invalid Salary....Enter Valid Salary");
		}
		else {
			System.out.println("Valid Salary");
		}

	}


	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		try {
			validateAge(age);
		} catch (InvalidAgeException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
		try {
			validateName(firstName, lastName);
		} catch (InvalidNameException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("Enter Salary: ");
		double salary = sc.nextDouble();
		try {
			validateSalary(salary);
		} catch (InvalidSalaryException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
