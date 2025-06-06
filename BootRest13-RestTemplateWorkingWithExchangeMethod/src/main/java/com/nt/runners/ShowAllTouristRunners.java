package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class ShowAllTouristRunners implements CommandLineRunner {

	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {

		// prepare base url
		String serviceUrl = "http://localhost:4041/RestfullApi/tourist-api/getalltourist";

		// use getForEntity(-,-) message
		ResponseEntity<String> response = template.exchange(serviceUrl,
															HttpMethod.GET, 
															null, // no body for get mode request and we de not pass any header values 
															String.class);

		// process the response
		System.out.println("response body(result)::" + response.getBody());
		System.out.println("response header::" + response.getHeaders());
		System.out.println("response status code:: " + response.getStatusCode().value());
		
		System.out.println("---------------------------------");
	}
 
}
