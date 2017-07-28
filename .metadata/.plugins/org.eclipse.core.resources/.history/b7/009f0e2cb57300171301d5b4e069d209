package com.packt.patterninspring.chapter7.bankapp.repository;

import org.springframework.stereotype.Repository;

import com.packt.patterninspring.chapter7.bankapp.model.Account;

@Repository
//@Primary
//@Order(2)
public class JpaAccountRepository implements AccountRepository {

	@Override
	public Account findAccountById(Long id) {
		return new Account(id);
	}

}
