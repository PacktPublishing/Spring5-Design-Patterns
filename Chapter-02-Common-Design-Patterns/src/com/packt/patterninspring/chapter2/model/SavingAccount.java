package com.packt.patterninspring.chapter2.model;

/**
 * @author Dinesh.Rajput
 *
 */
public class SavingAccount implements Account{

	@Override
	public void accountType() {
		System.out.println("SAVING ACCOUNT");
	}

}
