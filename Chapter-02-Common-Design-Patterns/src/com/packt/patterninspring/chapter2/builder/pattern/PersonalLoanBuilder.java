package com.packt.patterninspring.chapter2.builder.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class PersonalLoanBuilder implements LoanBuilder {
	private Loan loan;
	
	public PersonalLoanBuilder() {
		super();
		this.loan = new Loan();
	}

	@Override
	public void loanApply() {
		loan.setLoanAmount(Double.valueOf(200000));
		loan.setLoanName("Personal Loan");
		System.out.println("PersonalLoanBuilder: Applied for Personal Loan for Amount 200000");
	}

	@Override
	public void loanApproval() {
		loan.setApproved(true);
		System.out.println("PersonalLoanBuilder: Personal Loan has been Approved...");
	}

	@Override
	public void loanSanction() {
		loan.setLoanAccount(20000l);
		loan.setLoanFee(Double.valueOf(2000));
		loan.setRoi(Double.valueOf(14.3));
		System.out.println("PersonalLoanBuilder: Personal Loan has been processed and sanctioned...");
		System.out.println("Details: Total processing fee 2000 and interest rate 14.3 and loan account 20000...");
	}

	@Override
	public Loan loanDisburse() {
		return this.loan;
	}

}
