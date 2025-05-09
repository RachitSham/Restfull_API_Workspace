package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class FetchTouristByCityRummer implements CommandLineRunner {

	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {

		String serviceUrl = "http://localhost:4041/RestfullApi/tourist-api/touristbycity/{city1}/{city2}/{city3}";

		ResponseEntity<String> response  = template.exchange(serviceUrl,
															HttpMethod.GET,
															null,// no body for get mode request and we de not pass any header values
															String.class, // required type
															"Kanpur", "Nagpur","Mumbai");
		
		
		// display the details
		System.out.println("reaponse body(result)::" + response.getBody());
		System.out.println("response status code::" + response.getStatusCode());
		System.out.println("response status code value::" + response.getStatusCodeValue());
		System.out.println("response header values::" + response.getHeaders());
		
		System.out.println("-------------------------------------");
	}

}
