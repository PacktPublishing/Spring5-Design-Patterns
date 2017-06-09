package com.packt.patterninspring.chapter2.bridge.pattern;

/**
 * @author Dinesh.Rajput
 * Refine abstraction 2 in bridge pattern
 */
public class HdfcBank extends Bank {

	public HdfcBank(Account account) {
		super(account);
	}
	@Override
	Account openAccount() {
		System.out.print("Open your account with HDFC Bank");
		return account;
	}

}
