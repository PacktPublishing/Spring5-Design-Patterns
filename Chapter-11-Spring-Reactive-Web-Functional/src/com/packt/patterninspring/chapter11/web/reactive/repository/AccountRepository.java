/**
 * 
 */
package com.packt.patterninspring.chapter11.web.reactive.repository;

import com.packt.patterninspring.chapter11.web.reactive.model.Account;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository {
	
	Mono<Account> findById(Long id);
	 
	Flux<Account> findAll();
	 
	Mono<Void> save(Mono<Account> account);
}
