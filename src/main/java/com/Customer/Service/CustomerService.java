package com.Customer.Service;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Customer.Dao.CustomerDao;
import com.Customer.Entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDao cd;
	
	public String postOneCustomer(Customer c) {
		return cd.postOneCustomer(c);
	}
	
	public String postAllCustomers(List<Customer> c) {
		return cd.postAllCustomers(c);
	}
	
	public Map<Object, Object> getHighTotalAmount() { 
		List<Customer> custo = cd.getAllCustomers();
		Map<Object, Object> highAmount = custo.stream().sorted(Comparator.comparingInt(Customer::getTotalAmount).reversed())
				.collect(Collectors.toMap(y -> y.getId(), x -> x,(existing, replacement) -> existing,LinkedHashMap::new));
		return highAmount;
	}
	
	

}
