package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationController {

	@PostMapping("/customer")
	public ResponseEntity<String> shoewCustomerDatHub(@RequestBody Customer cust) {
		System.out.println("CustomerOperationController.shoewCustomerDatHub()");

		return new ResponseEntity<String>(cust.toString(), HttpStatus.OK);

	}
}
