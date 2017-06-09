package com.packt.patterninspring.chapter2.prototype.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dinesh.Rajput
 *
 */
public class AccountCache {
	public static Map<String, Account> accountCacheMap = new HashMap<>();
	
	static{
		Account currentAccount = new CurrentAccount();
		Account savingAccount = new SavingAccount();
		accountCacheMap.put("SAVING", savingAccount);
		accountCacheMap.put("CURRENT", currentAccount);
	}
}
