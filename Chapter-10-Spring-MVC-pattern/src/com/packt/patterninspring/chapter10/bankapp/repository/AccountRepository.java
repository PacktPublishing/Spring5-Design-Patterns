/**
 * 
 */
package com.packt.patterninspring.chapter10.bankapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.packt.patterninspring.chapter10.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository extends CrudRepository<Account, Long>{
	
	Account findAccountByName(String name);
	
	@Query("FROM Account where id=?1")
	Account readRecord(Long id);
}
