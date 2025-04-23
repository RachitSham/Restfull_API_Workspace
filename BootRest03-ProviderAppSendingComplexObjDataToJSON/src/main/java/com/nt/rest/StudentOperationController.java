package com.nt.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.School;
import com.nt.model.Student;

@RestController
@RequestMapping("/json-api")
public class StudentOperationController {

	@GetMapping("/student")
	public ResponseEntity<Student> showStudentData() {
		System.out.println("StudentOperationController.showStudentData()");

		Student stud = new Student(101, "Sakshi", "Chandighar", "Financial Accounting", List.of("10th", "12th", "MBA"),
				new String[] { "Olive", "Royal Blue", "Black" }, Set.of(8989898989L, 7878787878L, 5656565656L),
				Map.of("aadhar", 78965498L, "panNo", 876543209L),
				new School(9876548, "Delhi Public School", "Delhi", "ICSC"));
		return new ResponseEntity<Student>(stud, HttpStatus.OK);
	}
}
