package com.packt.patterninspring.chapter1.bankapp.repository.jdbc;

import com.packt.patterninspring.chapter1.bankapp.model.Account;
import com.packt.patterninspring.chapter1.bankapp.model.Amount;
import com.packt.patterninspring.chapter1.bankapp.repository.AccountRepository;

public class JdbcAccountRepository implements AccountRepository {

	@Override
	public Account findByAccountId(Long accountId) {
		return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
	}

}
