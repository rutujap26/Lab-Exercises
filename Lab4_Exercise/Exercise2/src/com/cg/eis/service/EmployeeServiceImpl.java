package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	Employee employee = new Employee();
	
	@Override
	public void userDetails(int id, String name, double salary, String designation) {
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDesignation(designation);

	}

	@Override
	public void displayDetails() {
		System.out.println("-----Employee Details-----");
		System.out.println("Name : "+employee.getName());
		System.out.println("ID : "+employee.getId());
		System.out.println("Salary : "+employee.getSalary());
		System.out.println("Designation : "+employee.getDesignation());
		System.out.println("Insurance Scheme : "+findInsuranceScheme(employee.getSalary(),employee.getDesignation()));

	}

	@Override
	public String findInsuranceScheme(double salary, String designation) {
		String insuranceScheme = null;
		if(salary<20000 && designation=="Associate") {
			insuranceScheme = "Personal Insurance";
		}
		else if(salary<50000 && designation=="Analyst") {
			insuranceScheme = "Health Insurance";
		}
		else if(salary>50000 && designation=="Manager") {
			insuranceScheme = "Propery Insurance";
		}
		return insuranceScheme;
	}

}
