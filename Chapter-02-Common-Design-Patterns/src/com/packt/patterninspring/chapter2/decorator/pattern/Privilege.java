package com.packt.patterninspring.chapter2.decorator.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class Privilege extends AccountDecorator {
	
	Account account;
	
	public Privilege(Account account) {
		super();
		this.account = account;
	}

	@Override
	public String getTotalBenefits() {
		return account.getTotalBenefits() + " other benefits are "+applyOtherBenefits();
	}

	@Override
	String applyOtherBenefits() {
		return " an accident insurance of up to $1,600 and an overdraft facility of $84";
	}

}
