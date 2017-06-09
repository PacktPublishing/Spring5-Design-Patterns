package com.packt.patterninspring.chapter1.bankapp.repository;

import com.packt.patterninspring.chapter1.bankapp.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
