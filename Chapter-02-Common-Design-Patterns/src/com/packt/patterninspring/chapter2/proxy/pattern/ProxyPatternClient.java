package com.packt.patterninspring.chapter2.proxy.pattern;

import com.packt.patterninspring.chapter2.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public class ProxyPatternClient {

	public static void main(String[] args) {
		Account account = new ProxySavingAccount();
		account.accountType();
	}

}
