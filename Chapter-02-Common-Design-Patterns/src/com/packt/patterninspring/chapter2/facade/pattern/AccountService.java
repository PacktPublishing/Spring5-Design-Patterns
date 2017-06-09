package com.packt.patterninspring.chapter2.facade.pattern;

import com.packt.patterninspring.chapter2.model.Account;
import com.packt.patterninspring.chapter2.model.SavingAccount;

/**
 * @author Dinesh.Rajput
 *
 */
public class AccountService {

	public static Account getAccount(String accountId) {
		return new SavingAccount();
	}
}
