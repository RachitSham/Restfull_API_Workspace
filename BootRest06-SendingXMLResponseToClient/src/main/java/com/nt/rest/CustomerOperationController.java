package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
@RequestMapping("/json-api")
public class CustomerOperationController {

	@GetMapping("/customer")
	public Customer showData() {
		System.out.println("CustomerOperationController.showData()");
		Customer cust = new Customer(1001, "Rohan", "Lucknow", 60980.80f);
		return cust;
	}
	
	@GetMapping("/customer-api")
	public ResponseEntity<Customer> showCustomerData() {
		System.out.println("CustomerOperationController.showCustomerData() ");
		Customer customer = new Customer(1002, "Akshat", "Uttrakhand", 80900.80f);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
}
