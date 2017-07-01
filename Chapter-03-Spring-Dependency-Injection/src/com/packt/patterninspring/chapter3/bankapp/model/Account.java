package com.packt.patterninspring.chapter3.bankapp.model;

import java.io.Serializable;

public class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
	Long accountId;
	String name;
	Amount amount;
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public Account(Long accountId, String name, Amount amount) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", amount=" + amount + "]";
	}
	
}
