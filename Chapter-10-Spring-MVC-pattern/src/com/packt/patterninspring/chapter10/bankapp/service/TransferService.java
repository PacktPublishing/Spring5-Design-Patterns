/**
 * 
 */
package com.packt.patterninspring.chapter10.bankapp.service;

/**
 * @author Dinesh.Rajput
 *
 */
public interface TransferService {
	
	void transfer(Long amount, Long a, Long b);
	
}
