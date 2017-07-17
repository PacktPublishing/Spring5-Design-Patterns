package com.packt.patterninspring.chapter6.bankapp.service;

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
}
