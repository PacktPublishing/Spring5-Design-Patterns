package com.packt.patterninspring.chapter2.builder.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class Loan {
	
	private Double roi;
	private Double loanAmount;
	private String loanName;
	private Long loanAccount;
	private Double loanFee;
	private boolean approved;
	
	public Double getRoi() {
		return roi;
	}
	public void setRoi(Double roi) {
		this.roi = roi;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public Long getLoanAccount() {
		return loanAccount;
	}
	public void setLoanAccount(Long loanAccount) {
		this.loanAccount = loanAccount;
	}
	public Double getLoanFee() {
		return loanFee;
	}
	public void setLoanFee(Double loanFee) {
		this.loanFee = loanFee;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	@Override
	public String toString() {
		return "Loan [roi=" + roi + ", loanAmount=" + loanAmount + ", loanName=" + loanName + ", loanAccount="
				+ loanAccount + ", loanFee=" + loanFee + ", approved=" + approved + "]";
	}
}
