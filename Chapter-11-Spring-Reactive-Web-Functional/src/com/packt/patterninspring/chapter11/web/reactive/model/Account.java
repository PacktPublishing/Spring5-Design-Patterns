package com.packt.patterninspring.chapter11.web.reactive.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Dinesh.Rajput
 *
 */
public class Account {

	Long id;
	String name;
	Long balance;
	String branch;

	public Account(@JsonProperty("id") Long id, @JsonProperty("name") String name, 
			@JsonProperty("age") Long balance, @JsonProperty("branch") String branch) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", branch=" + branch + "]";
	}

}
