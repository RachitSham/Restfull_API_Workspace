package com.nt.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationController {

	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> showCustomerData() {
		System.out.println("CustomerOperationController.showCustomerData()");

		Customer cust1 = new Customer(1001, "Raja", "Hyderabad", 9800.09f);
		Customer cust2 = new Customer(1002, "Shivam", "Chandighar", 77800.29f);
		Customer cust3 = new Customer(1003, "Yash", "Varanasi", 22800.00f);

		return new ResponseEntity<List<Customer>>(List.of(cust1, cust2, cust3), HttpStatus.OK);
	}
}
