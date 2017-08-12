/**
 * 
 */
package com.doj.webapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.doj.webapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository extends CrudRepository<Account, Long>{
	
	Account findAccountByName(String name);
	
	@Query("FROM Account where id=?1")
	Account readRecord(Long id);
}
