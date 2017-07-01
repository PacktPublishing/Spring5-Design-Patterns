package com.packt.patterninspring.chapter3.bankapp.repository;

import com.packt.patterninspring.chapter3.bankapp.model.Account;
import com.packt.patterninspring.chapter3.bankapp.model.Amount;

public interface TransferRepository {
	
	void transfer(Account accountA, Account accountB, Amount amount);
}
