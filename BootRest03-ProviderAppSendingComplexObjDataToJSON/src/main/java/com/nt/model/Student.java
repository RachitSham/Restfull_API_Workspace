package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private Integer sid;
	private String sname;
	private String addrs;
	private String courseName;
	private List<String> standards;
	private String[] favColor;
	private Set<Long> mobileNo;
	private Map<String, Object> idDetails;
	
	//HAS_A_PROPERTY
	private School school;
}
