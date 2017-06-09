package com.packt.patterninspring.chapter2.adapter.pattern;

import com.packt.patterninspring.chapter2.model.Account;

public interface PaymentGateway {
	void doPayment(Account account1, Account account2);
}
