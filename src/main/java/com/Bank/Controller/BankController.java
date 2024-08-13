package com.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Entity.Bank;
import com.Bank.Service.BankService;

@RestController
public class BankController {
	@Autowired
	BankService bs;
	
	@PostMapping(value = "/postAllBankDetails")
	public String postAllBankDetails(@RequestBody List<Bank> b) {
		return bs.postAllBankDetails(b);
	}
	
	@GetMapping(value = "/getBranchByIfsccode/{ifsccode}")
	public String getBranchByIfsccode(@PathVariable String ifsccode) {
		return bs.getBranchByIfsccode(ifsccode);
	}
	
	@GetMapping(value = "/getAllBankDetails")
	public List<Bank> getAllBankDetails() {
		return bs.getAllBankDetails();
	}
	
	@GetMapping(value = "/getBranchByIfsc/{a}")
	public List<String> getBranchByIfsccode1(@PathVariable String a) {
		return bs.getBranchByIfsccode1(a);
	}

}
