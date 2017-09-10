/**
 * 
 */
package com.packt.patterninspring.chapter11.reactivewebapp.repository;

import com.packt.patterninspring.chapter11.reactivewebapp.model.Account;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository {
	
	Mono<Account> findById(Long id);
	 
	Flux<Account> findAll();
	 
	Mono<Account> save(Mono<Account> account);
}
