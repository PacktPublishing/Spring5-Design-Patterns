package com.packt.patterninspring.chapter2.builder.pattern;

public interface LoanBuilder {
	void loanApply();
	void loanApproval();
	void loanSanction();
	Loan loanDisburse();
}
