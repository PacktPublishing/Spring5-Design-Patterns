/**
 * 
 */
package com.doj.aopapp.service;

import org.springframework.stereotype.Service;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class TransferServiceImpl implements TransferService {

	@Override
	public void transfer(String accountA, String accountB, Long amount) {
		System.out.println(amount+" Amount has been tranfered from "+accountA+" to "+accountB);
	}

	@Override
	public Double checkBalance(String account) {
		return new Double(50000);
	}

	@Override
	public Long withdrawal(String account, Long amount) {
		return amount;
	}

	@Override
	public void diposite(String account, Long amount) {
		System.out.println(amount+" Amount has been diposited to "+account);
	}

}
