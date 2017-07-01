package com.packt.patterninspring.chapter1.bankapp.service;

import org.springframework.stereotype.Component;

import com.packt.patterninspring.chapter1.bankapp.model.Account;
import com.packt.patterninspring.chapter1.bankapp.model.Amount;
import com.packt.patterninspring.chapter1.bankapp.repository.AccountRepository;
import com.packt.patterninspring.chapter1.bankapp.repository.TransferRepository;
@Component
public class TransferServiceImpl implements TransferService {

	AccountRepository accountRepository;
	
	TransferRepository transferRepository;
	
	public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
		super();
		this.accountRepository = accountRepository;
		this.transferRepository = transferRepository;
	}

	@Override
	public void transferAmmount(Long a, Long b, Amount amount) {
		Account accountA = accountRepository.findByAccountId(a);
		Account accountB = accountRepository.findByAccountId(b);
		transferRepository.transfer(accountA, accountB, amount);
	}

}
