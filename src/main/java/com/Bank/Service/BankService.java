package com.Bank.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Bank.Dao.BankDao;
import com.Bank.Entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bd;
	
	public String postAllBankDetails(List<Bank> b) {
		return bd.postAllBankDetails(b);
	}
	
	public String getBranchByIfsccode(String ifsccode) {
		return bd.getBranchByIfsccode(ifsccode);
	}
	
	public List<Bank> getAllBankDetails() {
		return bd.getAllBankDetails();
	}
	
	public List<String> getBranchByIfsccode1(String a) {
		List<Bank> x = bd.getAllBankDetails();
		List<String> branches = x.stream().filter(y -> y.getIfsccode().equals(a)).map(z -> z.getBranch()).collect(Collectors.toList());
		return branches;
	}
	

}
