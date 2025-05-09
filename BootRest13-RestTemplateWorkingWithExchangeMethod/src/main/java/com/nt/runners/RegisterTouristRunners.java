package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RegisterTouristRunners implements CommandLineRunner {

    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {
        // 1. Prepare service URL
        String serviceUrl = "http://localhost:4041/RestfullApi/tourist-api/touristregister";

        // 2. Prepare JSON body
        String jsonBody = "{\"name\":\"Nikhil Singh\",\"email\":\"nikhil123singh@gmail.com\",\"mobileNo\":8899006543,\"city\":\"Bhopal\",\"packageType\":\"Nainital Tour\",\"budget\":\"85000.00\"}";

        // 3. Create HTTP headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // 4. Create HTTP entity (body + headers)
        HttpEntity<String> entity = new HttpEntity<>(jsonBody, headers);

        // 5. Make POST request
        ResponseEntity<String> response = template.exchange(
                serviceUrl,
                HttpMethod.POST,
                entity,
                String.class
        );

        // 6. Process response
        System.out.println("Response body: " + response.getBody());
        System.out.println("Response header: " + response.getHeaders());
        System.out.println("response status code" + response.getStatusCode());

    }
}
