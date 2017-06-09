package com.packt.patterninspring.chapter2.builder.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class CarLoanBuilder implements LoanBuilder {
	private Loan loan;
	
	public CarLoanBuilder() {
		super();
		this.loan = new Loan();
	}

	@Override
	public void loanApply() {
		loan.setLoanAmount(Double.valueOf(500000));
		loan.setLoanName("Car Loan");
		System.out.println("CarLoanBuilder: Applied for Car Loan for Amount 500000");
	}

	@Override
	public void loanApproval() {
		loan.setApproved(true);
		System.out.println("CarLoanBuilder: Car Loan has been Approved...");
	}

	@Override
	public void loanSanction() {
		loan.setLoanAccount(30000l);
		loan.setLoanFee(Double.valueOf(5000));
		loan.setRoi(Double.valueOf(10.3));
		System.out.println("CarLoanBuilder: Car Loan has been processed and sanctioned...");
		System.out.println("Details: Total processing fee 5000 and interest rate 10.3 and loan account 30000...");
	}

	@Override
	public Loan loanDisburse() {
		return this.loan;
	}

}
