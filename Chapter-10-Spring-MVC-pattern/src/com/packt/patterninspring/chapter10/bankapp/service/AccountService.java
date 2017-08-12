/**
 * 
 */
package com.packt.patterninspring.chapter10.bankapp.service;

import com.packt.patterninspring.chapter10.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountService {
	
	Account findOne(Long id);
	
	Account save(Account account);
	
	void remove(Long id);
}
