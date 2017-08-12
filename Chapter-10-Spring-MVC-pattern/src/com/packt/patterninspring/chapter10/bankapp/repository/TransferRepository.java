/**
 * 
 */
package com.packt.patterninspring.chapter10.bankapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.packt.patterninspring.chapter10.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface TransferRepository extends CrudRepository<Account, Long>{
	
}
