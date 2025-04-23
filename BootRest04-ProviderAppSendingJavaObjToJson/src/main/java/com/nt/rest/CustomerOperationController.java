package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
@RequestMapping("/json-api")
public class CustomerOperationController {

	public ResponseEntity<Customer> showCustomerData() {
		System.out.println("CustomerOperationController.showCustomerData()");

		Customer cust = new Customer(1001, "Ankit Sharma", "Punjab", 79000.00f);
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);

	}
}
