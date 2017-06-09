package com.packt.patterninspring.chapter2.decorator.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class SavingAccount implements Account {

	@Override
	public String getTotalBenefits() {
		return "This account has 4% interest rate with per day $5000 withdrwal limit";
	}

}
