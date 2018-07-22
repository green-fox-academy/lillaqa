package com.greenfoxacademy.bankofsymba.services;

import com.greenfoxacademy.bankofsymba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BankService {

	void add(BankAccount bankAccount);
	void addSimba(BankAccount simbaAccount);
	ArrayList<BankAccount> getAllAccount();
	void createAccounts();

}
