package com.packt.patterninspring.chapter2.abstractfactory.pattern;

import com.packt.patterninspring.chapter2.model.Account;
import com.packt.patterninspring.chapter2.model.Bank;

/**
 * @author Dinesh.Rajput
 *
 */
public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
		//get bank factory
		AbstractFactory bankFactory = FactoryProducer.getFactory("BANK");
		//get an object of BANK ICICI
		Bank iciciBank = bankFactory.getBank("ICICI");
		//call bankName method of Bank ICICI
		iciciBank.bankName();
		//get an object of BANK YES
		Bank yesBank = bankFactory.getBank("YES");
		//call bankName method of  Bank YES
		yesBank.bankName();
	   
		//get account factory
		AbstractFactory accountFactory = FactoryProducer.getFactory("ACCOUNT");
		//get an object of Saving Account
		Account	savingAccount = accountFactory.getAccount("SAVING");
		//call accountType method of SavingAccount
		savingAccount.accountType();
		//get an object of Current Account
		Account currentAccount = accountFactory.getAccount("CURRENT");
		//call accountType method of CurrentAccount
		currentAccount.accountType();
	}
}
