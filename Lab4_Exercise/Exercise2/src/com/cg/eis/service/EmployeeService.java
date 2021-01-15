package com.cg.eis.service;

public interface EmployeeService {
	
	void userDetails(int id, String name, double salary, String designation);
	
	void displayDetails();
	
	String findInsuranceScheme(double salary, String designation);
}
