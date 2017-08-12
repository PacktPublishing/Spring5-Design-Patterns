/**
 * 
 */
package com.doj.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doj.webapp.model.Account;
import com.doj.webapp.repository.AccountRepository;
import com.doj.webapp.repository.TransferRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class TransferServiceImpl implements TransferService{
	//1. always resolve dependency by type if failure then its try with by property name
	@Autowired 
	AccountRepository accountRepository;
	
	TransferRepository transferRepository;
	//As of Spring 4.3 if any class has single argument constructor then no need too define dependency definition to container
	//autowired always resolve dependency by type
	/*@Autowired 
	public TransferServiceImpl(@Qualifier("jpaAccountRepository") AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}*/
	
	@Override
	@Transactional //Demarcation
	public void transfer(Long amount, Long a, Long b){
		Account accountA = accountRepository.findOne(a);//update 1-OK//rollback//connect
		Account accountB = accountRepository.findOne(b);////update 2//rollback//connect//close
		//transferRepository.tranfer(amount, accountB); ////update 3-Not OK-
		Account account =  new Account(4000l);
		account.setBalance(5000l);
		account.setName("Sri");
		accountRepository.save(account);
		System.out.println(accountRepository.findAccountByName("Dinesh"));
		System.out.println(accountRepository.findAll());
		System.out.println("Amount has been transfered from "+accountA +" to "+accountB);
		System.out.println(accountRepository.readRecord(2000l));
	}

	@Override
	public Account open(Account account) {
		return account = accountRepository.save(account);
	}

	@Override
	public List<Account> findAllAccounts() {
		return (List<Account>) accountRepository.findAll();
	}
}
