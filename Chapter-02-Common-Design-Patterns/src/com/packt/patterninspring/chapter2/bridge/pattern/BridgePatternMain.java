package com.packt.patterninspring.chapter2.bridge.pattern;

/**
 * @author Dinesh.Rajput
 * Demonstration of bridge design pattern
 */
public class BridgePatternMain {

	public static void main(String[] args) {
		Bank icici = new IciciBank(new CurrentAccount());
		Account current = icici.openAccount();
		current.accountType();
		
		Bank hdfc = new HdfcBank(new SavingAccount());
		Account saving = hdfc.openAccount();
		saving.accountType();
	}

}
