package com.doj.springapp.repository;

import org.springframework.stereotype.Repository;

import com.doj.springapp.model.Account;

@Repository
//@Primary
//@Order(2)
public class JpaAccountRepository implements AccountRepository {

	@Override
	public Account findAccountById(Long id) {
		return new Account(id);
	}

}
