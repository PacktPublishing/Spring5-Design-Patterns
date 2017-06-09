package com.packt.patterninspring.chapter2.factory.pattern;

import com.packt.patterninspring.chapter2.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public class FactoryPatternMain {

	public static void main(String[] args) {
		
		AccountFactory accountFactory = new AccountFactory();
		
		//get an object of SavingAccount and call its accountType() method.
		Account savingAccount = accountFactory.getAccount("SAVING");

		//call accountType method of SavingAccount
		savingAccount.accountType();

		//get an object of CurrentAccount and call its accountType() method.
		Account currentAccount = accountFactory.getAccount("CURRENT");

		//call accountType method of CurrentAccount
		currentAccount.accountType();

	}

}
