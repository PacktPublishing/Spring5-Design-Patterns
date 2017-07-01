/**
 * 
 */
package com.doj.app.service;

import org.springframework.stereotype.Service;

import com.doj.app.repository.IAccountRepository;

/**
 * @author Manzoor Alam
 *
 */
@Service("service")
public class TransferService {
	
	IAccountRepository accountRepository;
	
	public TransferService(IAccountRepository accountRepository){
		this.accountRepository = accountRepository;
	}
	
	public void transfer(String accountA, String accountB, Double amount){
		System.out.println("Amount has been tranferred");
	}

	public void setAccountRepository(IAccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	
}
