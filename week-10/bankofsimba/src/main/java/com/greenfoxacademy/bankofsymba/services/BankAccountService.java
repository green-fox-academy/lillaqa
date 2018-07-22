package com.greenfoxacademy.bankofsymba.services;

import com.greenfoxacademy.bankofsymba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankAccountService implements BankService {

	private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

	@Override
	public void add(BankAccount bankAccount) {
		bankAccounts.add(bankAccount);
	}

	@Override
	public void addSimba(BankAccount simbaAccount) {
		bankAccounts.add(new BankAccount());
	}

	@Override
	public ArrayList<BankAccount> getAllAccount() {
		return bankAccounts;
	}


	@Override
	public void createAccounts() {
		bankAccounts.add(new BankAccount("Zebra", 2000.0, "zebra"));
		bankAccounts.add(new BankAccount("Zazu", 1500.0, "red-billed hornbill"));
		bankAccounts.add(new BankAccount("Mufasa", 3000.0, "lion"));
		bankAccounts.add(new BankAccount("Nala", 2000.0, "lioness"));
	}


}

