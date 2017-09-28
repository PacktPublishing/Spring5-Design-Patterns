/**
 * 
 */
package com.packt.patterninspring.chapter8.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.patterninspring.chapter8.bankapp.model.Account;
import com.packt.patterninspring.chapter8.bankapp.repository.AccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class TransferServiceImpl implements TransferService{
	//1. always resolve dependency by type if failure then its try with by property name
	
	@Autowired
	@Qualifier("hibernateAccountRepository")
	AccountRepository accountRepository;
	
	//TransferRepository transferRepository;
	//As of Spring 4.3 if any class has single argument constructor then no need too define dependency definition to container
	//autowired always resolve dependency by type
	/*@Autowired 
	public TransferServiceImpl(@Qualifier("jpaAccountRepository") AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}*/
	
	@Override
	@Transactional(readOnly = false) //Demarcation
	public void transfer(Long amount, Long a, Long b){
		Account accountA = accountRepository.findAccountById(a);//update 1-OK//rollback//connect
		Account accountB = accountRepository.findAccountById(b);////update 2//rollback//connect//close
		//transferRepository.tranfer(amount, accountB); ////update 3-Not OK-
		Account account = new Account(4000l);
		account.setName("Dinesh");
		account.setBalance(2000l);
		accountRepository.save(account);
		System.out.println(accountRepository.findAll());
		System.out.println("Amount has been transfered from "+accountA +" to "+accountB);
	}
}
