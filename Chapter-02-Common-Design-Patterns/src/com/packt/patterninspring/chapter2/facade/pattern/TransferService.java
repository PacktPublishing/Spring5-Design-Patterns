package com.packt.patterninspring.chapter2.facade.pattern;

import com.packt.patterninspring.chapter2.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public class TransferService {

	public static void transfer(int amount, Account fromAccount, Account toAccount) {
		System.out.println("Transfering Money");
	}
}
