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
public class Customer {

	private Integer cno;
	private String cname;
	private String[] favColor;
	private List<String> academics;
	private Set<Long> phoneNumbers;
	private Map<String, Double> billDetails;
	private Address addrs;
}
