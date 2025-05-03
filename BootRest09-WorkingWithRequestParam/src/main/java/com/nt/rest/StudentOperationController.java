package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentOperationController {

	@GetMapping("/student-api")
	public String showStudent(@RequestParam("sid") Integer sid, @RequestParam(required=false) String sname) {
		return sid + " " + sname;
	}

	@GetMapping("/student")
	public ResponseEntity<String> showStudentData(@RequestParam int sid,
			@RequestParam(required=true,defaultValue="King") String sname) {
		System.out.println(sid + " " + sname);
		return new ResponseEntity<String>(sid + " " + sname, HttpStatus.OK);

	}
}
