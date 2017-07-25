package com.packt.patterninspring.chapter7.bankapp.service;

/**
 * @author Dinesh.Rajput
 *
 */
public interface TransferService {
	void transfer(Long amount, Long a, Long b);
}
