package com.packt.patterninspring.chapter1.bankapp.service;

import com.packt.patterninspring.chapter1.bankapp.model.Amount;

public interface TransferService {
	
	void transferAmmount(Long a, Long b, Amount amount);
}
