package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class TestSave { 
	public static void main(String[] args) {
		Employee employee=new Employee(); 
		employee.setName("Vishu"); 
		employee.setDesignation("Software Engineer"); 
		employee.setSal(50000); 
		employee.setCno(86557000);
		employee.setEmail("vishu@mail"); 
		
		EmployeeService employeeService=new EmployeeService();
		employeeService.saveEmployee(employee);
	} 
}
