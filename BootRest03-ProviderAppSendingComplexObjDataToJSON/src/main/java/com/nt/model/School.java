package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {

	private Integer registrationNo;
	private String sname;
	private String addrs;
	private String board;
	
}
