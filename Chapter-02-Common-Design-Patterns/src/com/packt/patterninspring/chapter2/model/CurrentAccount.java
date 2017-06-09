package com.packt.patterninspring.chapter2.model;

/**
 * @author Dinesh.Rajput
 *
 */
public class CurrentAccount implements Account {

	@Override
	public void accountType() {
		System.out.println("CURRENT ACCOUNT");
	}

}
