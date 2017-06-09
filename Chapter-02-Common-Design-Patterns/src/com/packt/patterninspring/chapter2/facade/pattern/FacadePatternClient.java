package com.packt.patterninspring.chapter2.facade.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class FacadePatternClient {
	public static void main(String[] args) {
		BankingServiceFacade serviceFacade = new BankingServiceFacadeImpl();
		serviceFacade.moneyTransfer();
	}

}
