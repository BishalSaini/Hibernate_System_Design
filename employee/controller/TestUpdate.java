package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class TestUpdate {
	
	public static void main(String[] args) {
	
		EmployeeService employeeService = new EmployeeService(); 
		Employee e = employeeService.updateEmployeeById(1,87698765,"vishu0607@mail.com");
		
		if(e!= null) {
			System.out.println(e.getId() + " Updated");
		}
	}

}