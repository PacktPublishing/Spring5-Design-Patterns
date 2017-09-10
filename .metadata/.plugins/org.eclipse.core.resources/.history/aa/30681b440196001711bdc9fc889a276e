package com.packt.patterninspring.chapter11.web.reactive.function;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromObject;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.packt.patterninspring.chapter11.web.reactive.model.Account;
import com.packt.patterninspring.chapter11.web.reactive.repository.AccountRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Dinesh.Rajput
 *
 */
public class AccountHandler {

	private final AccountRepository repository;

	public AccountHandler(AccountRepository repository) {
		this.repository = repository;
	}

	public Mono<ServerResponse> findById(ServerRequest request) {
		Long accountId = Long.valueOf(request.pathVariable("id"));
		Mono<ServerResponse> notFound = ServerResponse.notFound().build();
		Mono<Account> accountMono = this.repository.findById(accountId);
		return accountMono
				.flatMap(account -> ServerResponse.ok().contentType(APPLICATION_JSON).body(fromObject(account)))
				.switchIfEmpty(notFound);
	}
	
	public Mono<ServerResponse> findAll(ServerRequest request) {
		Flux<Account> accounts = this.repository.findAll();
		return ServerResponse.ok().contentType(APPLICATION_JSON).body(accounts, Account.class);
	}
	
	public Mono<ServerResponse> create(ServerRequest request) {
		Mono<Account> account = request.bodyToMono(Account.class);
		return ServerResponse.ok().build(this.repository.save(account));
	}


}
