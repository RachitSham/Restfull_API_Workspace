package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {

	@NonNull
	private Integer cno;
	@NonNull
	private String cname;
	@NonNull
	private String cadd;
	@NonNull
	private Float billAmt;
	private String[] favColors;
	private List<String> friends;
	private Set<Long> phones;
	private Map<String, Object> idDetails;
	
}
