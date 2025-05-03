package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	private String houseNo;
	private String streetName;
	private String location;
	private Long pinCode;
	
	
	
}
