package com.packt.patterninspring.chapter2.adapter.pattern;

import com.packt.patterninspring.chapter2.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public class PaymentGatewayImpl implements PaymentGateway{
	@Override
	public void doPayment(Account account1, Account account2){
		System.out.println("Do payment using Payment Gateway");
	}
	
}
