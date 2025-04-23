package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOpertaionsController {

	@GetMapping("show")
	public ResponseEntity<String> showCustomerData() {
		System.out.println("CustomerOpertaionsController.showCustomerData()");

		return new ResponseEntity<String>("Customer Data Successfully Retrieved !! ", HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerCustomerData() {
		System.out.println("CustomerOpertaionsController.registerCustomerData()");
		return new ResponseEntity<String>("Customer Data Successfully Registered !! ", HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateCustomerData() {
		System.out.println("CustomerOpertaionsController.updateCustomerData()");
		return new ResponseEntity<String>("Customer Data Successfully Updated !! ", HttpStatus.OK);
	}

	@DeleteMapping("delete")
	public ResponseEntity<String> deleteCustomerData() {
		System.out.println("CustomerOpertaionsController.deleteCustomerData()");
		return new ResponseEntity<String>("Customer Data Successfully Deleted !! ", HttpStatus.OK);
	}

	@PatchMapping("/emailUpdate")
	public ResponseEntity<String> updateCustomerByEmail() {
		System.out.println("CustomerOpertaionsController.updateCustomerByEmail()");
		return new ResponseEntity<String>("Customer Email Successfully Updated !! ", HttpStatus.OK);
	}
}
