package com.packt.patterninspring.chapter2.builder.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class BuilderPatternMain {

	public static void main(String[] args) {
		LoanManager loanManager = new LoanManager(new HomeLoanBuilder());
		Loan homeLoan = loanManager.buildLoan();
		System.out.println(homeLoan);
		
		loanManager = new LoanManager(new CarLoanBuilder());
		Loan carLoan = loanManager.buildLoan();
		System.out.println(carLoan);
		
		loanManager = new LoanManager(new PersonalLoanBuilder());
		Loan personalLoan = loanManager.buildLoan();
		System.out.println(personalLoan);
	}

}
