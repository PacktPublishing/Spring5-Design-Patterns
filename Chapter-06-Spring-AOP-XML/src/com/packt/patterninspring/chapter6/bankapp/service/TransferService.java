package com.packt.patterninspring.chapter6.bankapp.service;

/**
 * @author Dinesh.Rajput
 *    
 */
public interface TransferService {
	
	void transfer(String accountA, String accountB, Long amount);
	
}
