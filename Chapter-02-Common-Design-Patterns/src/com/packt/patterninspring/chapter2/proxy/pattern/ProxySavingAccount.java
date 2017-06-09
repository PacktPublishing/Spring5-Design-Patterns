package com.packt.patterninspring.chapter2.proxy.pattern;

import com.packt.patterninspring.chapter2.model.Account;
import com.packt.patterninspring.chapter2.model.SavingAccount;

/**
 * @author Dinesh.Rajput
 *
 */
public class ProxySavingAccount implements Account{
	
	private Account savingAccount;
	
	@Override
	public void accountType() {
		if(savingAccount == null){
			savingAccount = new SavingAccount();
		}
		savingAccount.accountType();
	}

}
