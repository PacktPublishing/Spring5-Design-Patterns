package com.packt.patterninspring.chapter3.bankapp.repository;

import com.packt.patterninspring.chapter3.bankapp.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
