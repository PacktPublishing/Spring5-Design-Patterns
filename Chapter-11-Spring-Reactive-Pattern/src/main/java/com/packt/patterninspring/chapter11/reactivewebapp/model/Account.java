/**
 * 
 */
package com.packt.patterninspring.chapter11.reactivewebapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh.Rajput
 *
 */
@Table
@Entity
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9050672799345744358L;
	@Id
	Long id;
	
	String name;
	
	Long balance;
	
	String branch;

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
	
	public Account(Long id, String name, Long balance, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", branch=" + branch + "]";
	}
	
}
