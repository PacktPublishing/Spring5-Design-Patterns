package com.packt.patterninspring.chapter10.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.patterninspring.chapter10.bankapp.model.Account;
import com.packt.patterninspring.chapter10.bankapp.repository.AccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public Account open(Account account) {
		return account = accountRepository.save(account);
	}

	@Override
	public List<Account> findAllAccounts() {
		return (List<Account>) accountRepository.findAll();
	}

	@Override
	public Account findOne(Long accountId) {
		return accountRepository.findOne(accountId);
	}
	
}
