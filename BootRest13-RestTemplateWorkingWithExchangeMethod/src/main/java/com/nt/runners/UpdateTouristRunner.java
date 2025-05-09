package com.nt.runners;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;

//@Component
public class UpdateTouristRunner implements CommandLineRunner{

	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
		
		// prepare base url
		String serviceUrl = "http://localhost:4041/RestfullApi/tourist-api/updatetouristdata";
		
		// prepare json body
		String json_body = "{\"id\":\"9\",\"name\":\"Nikhil Singh\",\"email\":\"snikhil321@gmail.com\",\"mobileNo\":8899006543,\"city\":\"Bhopal\",\"packageType\":\"Nainital Tour\",\"budget\":\"90000.00\"}";

		// Http Headers
		HttpHeaders headers = new  HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		// prepare HttpEntity Obj having headers body
		HttpEntity<String> entity = new HttpEntity<String>(json_body, headers);
		
		// use put()method
		ResponseEntity<String> response = template.exchange(serviceUrl,
															HttpMethod.PUT,
															entity,
															String.class);
		
		// process the response
		System.out.println("Response body: " + response.getBody());
        System.out.println("Response header: " + response.getHeaders());
        System.out.println("response status code" + response.getStatusCode());
        
        System.exit(0);
	}

}
