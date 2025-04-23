package com.nt.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;

@RestController
public class EmployeeOperationController {

	
	@PostMapping("/employee-api")
	public String registerCustomer(@RequestBody Employee emp) {
		System.out.println("EmployeeOperationController.registerCustomer()");
		return emp.toString();
	}
}
