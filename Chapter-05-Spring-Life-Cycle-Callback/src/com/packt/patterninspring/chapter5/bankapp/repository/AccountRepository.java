package com.packt.patterninspring.chapter5.bankapp.repository;

import com.packt.patterninspring.chapter5.bankapp.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
