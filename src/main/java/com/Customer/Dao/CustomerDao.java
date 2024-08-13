package com.Customer.Dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Customer.Entity.Customer;
import com.Customer.Repository.CustomerRepository;


@Repository
public class CustomerDao {
	
	@Autowired
	CustomerRepository cr;
	
	// To Post One Customer Details: 
	public String postOneCustomer(Customer c) {
		cr.save(c);
		return "Posted the Customer details successfully";
	}
	
	//To Post Bulk Customer Details:
	public String postAllCustomers(List<Customer> c) {
		cr.saveAll(c);
		return "Posted all the Customers details Successfully";
	}
	
	//To Get All Customers:
	public List<Customer> getAllCustomers() {
		return cr.findAll();
	}

}
