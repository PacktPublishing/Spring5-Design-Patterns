package com.packt.patterninspring.chapter2.bridge.pattern;

/**
 * @author Dinesh.Rajput
 * Refine abstraction 1 in bridge pattern
 */
public class IciciBank extends Bank {

	public IciciBank(Account account) {
		super(account);
	}

	@Override
	Account openAccount() {
		System.out.print("Open your account with ICICI Bank");
		return account;
	}

}
