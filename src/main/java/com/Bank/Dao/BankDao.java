package com.Bank.Dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Bank.Entity.Bank;
import com.Bank.Repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository br;
	
	public String postAllBankDetails(List<Bank> b) {
		br.saveAll(b);
		return "Posted All Details Successfully";
	}
	
	public String getBranchByIfsccode(String ifsccode) {
		return br.getBranchByIfsccode(ifsccode);
	}
	
	public List<Bank> getAllBankDetails() {
		return br.findAll();
	}

}
