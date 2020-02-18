package com.ashutosh.employeemanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashutosh.employeemanagement.dto.Employee;

@RestController
public class EmployeeController {
	@RequestMapping("/welcome")
	public String WelcomeEmployee() {
		return "Hello Employee";
	}
	
    @RequestMapping("/employees")
	public List<Employee> getAllEmployee(){
		
		return(Arrays.asList(
				new Employee(1,"ashutosh","development"),
				new Employee(2,"shyam","hr"),
				new Employee(3,"ankit","marketing")));
		
	}

}
