package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class DeleteTouristByIdRunner implements CommandLineRunner{

	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
		
		// create the base url
		String serviceUrl = "http://localhost:4041/RestfullApi/tourist-api/deleteid/{id}";
		
		// use exchange(-,-) method
		ResponseEntity<String> response = template.exchange(serviceUrl, 
															HttpMethod.DELETE,
															null, 
															String.class, 
															9);
		// process the message
		System.out.println("response body(result)::" + response.getBody());
		System.out.println("response header::" + response.getHeaders());
		System.out.println("response status code" + response.getStatusCode());
	}

}
