package com.packt.patterninspring.chapter2.decorator.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class SeniorCitizen extends AccountDecorator {
	
	Account account;
	
	public SeniorCitizen(Account account) {
		super();
		this.account = account;
	}

	@Override
	public String getTotalBenefits() {
		return account.getTotalBenefits() + " other benefits are "+applyOtherBenefits();
	}

	@Override
	String applyOtherBenefits() {
		return " an medical insurance of up to $1,000 for Senior Citizen";
	}

}
