package com.Customer.Controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Customer.Entity.Customer;
import com.Customer.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	@PostMapping(value = "/postOneCustomer")
	public String postOneCustomer(@RequestBody Customer c) {
		return cs.postOneCustomer(c);
	}
	@PostMapping(value = "/postAllCustomers")
	public String postAllCustomers(@RequestBody List<Customer> c) {
		return cs.postAllCustomers(c);
	}
	@GetMapping(value = "/getHighTotalAmount")
	public Map<Object, Object> getHighTotalAmount() {
		return cs.getHighTotalAmount();
	}
	
	
	
	

}
