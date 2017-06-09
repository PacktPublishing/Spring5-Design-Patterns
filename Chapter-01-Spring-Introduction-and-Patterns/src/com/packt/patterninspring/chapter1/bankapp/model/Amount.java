package com.packt.patterninspring.chapter1.bankapp.model;

public class Amount {
	
	Double balance;

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Amount(Double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Amount [balance=" + balance + "]";
	}
	
}
