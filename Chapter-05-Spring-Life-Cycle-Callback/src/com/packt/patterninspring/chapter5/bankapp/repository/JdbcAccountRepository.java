package com.packt.patterninspring.chapter5.bankapp.repository;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.packt.patterninspring.chapter5.bankapp.model.Account;
import com.packt.patterninspring.chapter5.bankapp.model.Amount;
import com.packt.patterninspring.chapter5.bankapp.repository.AccountRepository;
@Repository
public class JdbcAccountRepository implements AccountRepository {

	@Override
	public Account findByAccountId(Long accountId) {
		return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
	}
	
	@PostConstruct
	void populateCache(){
		System.out.println("Called populateCache() method");
	}
}
