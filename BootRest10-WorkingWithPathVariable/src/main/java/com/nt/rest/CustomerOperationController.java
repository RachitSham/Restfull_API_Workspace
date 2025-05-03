package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOperationController {

	/*@GetMapping("/customer/{id}/{name}")
	public String customerData(@PathVariable Integer id, @PathVariable("name") String cname) {
		return id + "<--->" + cname;
	
	}
	
	
	 *If both params are taken as string values but the wrong value will be stored in method params so the b.logic will be distrube 
	 
	@GetMapping("/report/{id}/{name}")
	public String showCustomer(@PathVariable String id, @PathVariable("name") String cname) {
		return id + "<------->" + cname;
	}*/

	/*
	 *If Multiple methods are having similar request paths having same no. of levels then the request that is having  
	 * more static level matchings will get high priority
	 * 
	 */
	@GetMapping("/report/id/name")
	public String fetchData1(@PathVariable(name ="name",required=false) String cname,
			@PathVariable(required=false) Integer id) {
		return "FetchFromData1";
	}

	@GetMapping("/report/id/{name}")
	public String fetchData2(@PathVariable(name ="name", required=false) String cname,
			@PathVariable(required=false) Integer id) {
		return "FetchFromData2";

	}

	@GetMapping("/report/{id}/{name}")
	public String fetchData3(@PathVariable(name="name",required=false) String cname,
			@PathVariable(required=false) Integer id) {
		return "FetchFromData3";

	}

	@GetMapping("report/{id}/name")
	public String fetchData4(@PathVariable(name="name", required=false) String cname,
			@PathVariable(required = false) Integer id) {
		return "FetchFromData4";
	}
}
