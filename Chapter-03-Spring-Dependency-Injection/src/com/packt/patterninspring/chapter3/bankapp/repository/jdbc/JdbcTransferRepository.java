package com.packt.patterninspring.chapter3.bankapp.repository.jdbc;

import org.springframework.stereotype.Repository;

import com.packt.patterninspring.chapter3.bankapp.model.Account;
import com.packt.patterninspring.chapter3.bankapp.model.Amount;
import com.packt.patterninspring.chapter3.bankapp.repository.TransferRepository;
@Repository
public class JdbcTransferRepository implements TransferRepository {

	@Override
	public void transfer(Account accountA, Account accountB, Amount amount) {
		System.out.println("Transfering amount from account A to B via JDBC implementation");
	}

}
