package com.Customer.Entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Customer2 {
	private int id;
    private String name;
    private int age;
    private char gender;
    private int purchasedAmount;
    private int totalAmount;
    
}

