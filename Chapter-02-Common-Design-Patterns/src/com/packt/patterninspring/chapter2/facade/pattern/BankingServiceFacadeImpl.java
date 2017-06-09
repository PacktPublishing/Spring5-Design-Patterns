package com.packt.patterninspring.chapter2.facade.pattern;

import com.packt.patterninspring.chapter2.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public class BankingServiceFacadeImpl implements BankingServiceFacade{

	@Override
	public void moneyTransfer() {
		if(PaymentService.doPayment()){
			Account fromAccount = AccountService.getAccount("1");
			Account toAccount   = AccountService.getAccount("2");
			TransferService.transfer(1000, fromAccount, toAccount);
		}
	}
}
