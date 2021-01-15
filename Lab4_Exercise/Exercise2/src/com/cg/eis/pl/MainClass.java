package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.EmployeeServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter Designation: ");
		String designation = sc.next();
		
		emp.userDetails(id, name, salary, designation);
		emp.displayDetails();

		sc.close();
	}

}
