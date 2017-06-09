package com.packt.patterninspring.chapter2.builder.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class HomeLoanBuilder implements LoanBuilder {
	
	private Loan loan;
	
	public HomeLoanBuilder() {
		super();
		this.loan = new Loan();
	}

	@Override
	public void loanApply() {
		loan.setLoanAmount(Double.valueOf(4000000));
		loan.setLoanName("Home Loan");
		System.out.println("HomeLoanBuilder: Applied for Home Loan for Amount 4000000");
	}

	@Override
	public void loanApproval() {
		loan.setApproved(true);
		System.out.println("HomeLoanBuilder: Home Loan has been Approved...");
	}

	@Override
	public void loanSanction() {
		loan.setLoanAccount(10000l);
		loan.setLoanFee(Double.valueOf(40000));
		loan.setRoi(Double.valueOf(8.30));
		System.out.println("HomeLoanBuilder: Home Loan has been processed and sanctioned...");
		System.out.println("Details: Total processing fee 40000 and interest rate 8.3 and loan account 1000...");
	}

	@Override
	public Loan loanDisburse() {
		return this.loan;
	}
	
}
