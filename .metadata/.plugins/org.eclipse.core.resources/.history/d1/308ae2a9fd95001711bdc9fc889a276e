/**
 * 
 */
package com.packt.patterninspring.chapter11.reactivewebapp.repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.packt.patterninspring.chapter11.reactivewebapp.model.Account;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Dinesh.Rajput
 *
 */
@Repository
public class AccountRepositoryImpl implements AccountRepository {
	
	private final Map<Long, Account> accountMap = new ConcurrentHashMap<>(); 
	
	public AccountRepositoryImpl() {
        this.accountMap.put(1000l, new Account(1000l, "Dinesh Rajput",  50000l, "Sector-1"));
        this.accountMap.put(2000l, new Account(2000l, "Anamika Rajput", 60000l, "Sector-2"));
        this.accountMap.put(3000l, new Account(3000l, "Arnav Rajput",   70000l, "Sector-3"));
        this.accountMap.put(4000l, new Account(4000l, "Adesh Rajput",   80000l, "Sector-4"));
    }
	
	@Override
	public Mono<Account> findById(Long id) {
		return Mono.justOrEmpty(this.accountMap.get(id));
	}

	@Override
	public Flux<Account> findAll() {
		return Flux.fromIterable(this.accountMap.values());
	}

	@Override
	public Mono<Account> save(Mono<Account> account) {
		Mono<Account> accountMono = account.doOnNext(a -> {
            accountMap.put(a.getId(), a);
            System.out.format("Saved %s with id %d%n", a, a.getId());
        });
        return accountMono;
	}

}
