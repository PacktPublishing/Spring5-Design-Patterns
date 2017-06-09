package com.packt.patterninspring.chapter1.bankapp.repository.jdbc;

import com.packt.patterninspring.chapter1.bankapp.model.Account;
import com.packt.patterninspring.chapter1.bankapp.model.Amount;
import com.packt.patterninspring.chapter1.bankapp.repository.TransferRepository;

public class JdbcTransferRepository implements TransferRepository {

	@Override
	public void transfer(Account accountA, Account accountB, Amount amount) {
		System.out.println("Transfering amount from account A to B via JDBC implementation");
	}

}
