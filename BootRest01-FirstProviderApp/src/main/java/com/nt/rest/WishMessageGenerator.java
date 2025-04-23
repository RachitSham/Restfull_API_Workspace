package com.nt.rest;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wish-api") // global path
public class WishMessageGenerator {

	@GetMapping("/wish") // method path
	public ResponseEntity<String> wishMessage() {

		LocalDateTime ldt = LocalDateTime.now();

		// get System Date and Time
		String wish_msg = null;

		// Generate Wish message
		int hour = ldt.getHour();
		if (hour < 12)
			wish_msg = "Good Morning Spring Restfull Api !!";
		else if (hour < 16)
			wish_msg = "Good Evening Spring Restfull Api !! ";
		else if (hour < 20)
			wish_msg = "Good Morning Spring Restfull Api !!";
		else
			wish_msg = "Good Night Spring Restfull Api !!";
		
		// create and return Response Entity Object having Response content and status code
		ResponseEntity<String> entity = new ResponseEntity<String>(wish_msg, HttpStatus.OK); // body status code
				
		return entity;		
	}
}
