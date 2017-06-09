package com.packt.patterninspring.chapter1.bankapp.repository;

import com.packt.patterninspring.chapter1.bankapp.model.Account;
import com.packt.patterninspring.chapter1.bankapp.model.Amount;

public interface TransferRepository {
	
	void transfer(Account accountA, Account accountB, Amount amount);
}
