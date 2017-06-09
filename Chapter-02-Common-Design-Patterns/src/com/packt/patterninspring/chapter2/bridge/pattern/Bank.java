package com.packt.patterninspring.chapter2.bridge.pattern;

/**
 * @author Dinesh.Rajput
 *	Abstraction in bridge pattern
 */
public abstract class Bank {
	//Composition with implementor
	protected Account account;
	
	public Bank(Account account){
		this.account = account;
	}
	
	abstract Account openAccount();
}
