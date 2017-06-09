package com.packt.patterninspring.chapter2.abstractfactory.pattern;

import com.packt.patterninspring.chapter2.model.Account;
import com.packt.patterninspring.chapter2.model.Bank;

/**
 * @author Dinesh.Rajput
 *
 */
public abstract class AbstractFactory {
	
	abstract Bank getBank(String bankName);
	
	abstract Account getAccount(String accountType);
}
