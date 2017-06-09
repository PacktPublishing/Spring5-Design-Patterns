package com.packt.patterninspring.chapter2.decorator.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class CurrentAccount implements Account{
	
	@Override
	public String getTotalBenefits() {
		return "There is no withdrwal limit for current account";
	}

}
