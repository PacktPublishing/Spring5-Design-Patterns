package com.packt.patterninspring.chapter2.builder.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class LoanManager {
	private LoanBuilder loanBuilder;

	public LoanManager(LoanBuilder loanBuilder) {
		super();
		this.loanBuilder = loanBuilder;
	}
	
	public Loan buildLoan(){
		this.loanBuilder.loanApply();
		this.loanBuilder.loanApproval();
		this.loanBuilder.loanSanction();
		return this.loanBuilder.loanDisburse();
	}
}
