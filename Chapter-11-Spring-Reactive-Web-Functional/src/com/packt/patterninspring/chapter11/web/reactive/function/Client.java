package com.packt.patterninspring.chapter11.web.reactive.function;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFunction;
import org.springframework.web.reactive.function.client.ExchangeFunctions;

import com.packt.patterninspring.chapter11.web.reactive.model.Account;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Client {

	private ExchangeFunction exchange = ExchangeFunctions.create(new ReactorClientHttpConnector());


	public static void main(String[] args) throws Exception {
		Client client = new Client();
		client.createAccount();
		client.findAllAccounts();
	}

	public void findAllAccounts() {
		URI uri = URI.create(String.format("http://%s:%d/account", Server.HOST, Server.TOMCAT_PORT));
		ClientRequest request = ClientRequest.method(HttpMethod.GET, uri).build();

		Flux<Account> account = exchange.exchange(request)
				.flatMapMany(response -> response.bodyToFlux(Account.class));

		Mono<List<Account>> accountList = account.collectList();
		System.out.println(accountList.block());
	}

	public void createAccount() {
		URI uri = URI.create(String.format("http://%s:%d/account", Server.HOST, Server.TOMCAT_PORT));
		Account account = new Account(5000l, "Arnav Rajput", 500000l, "Sector-5");

		ClientRequest request = ClientRequest.method(HttpMethod.POST, uri)
				.body(BodyInserters.fromObject(account)).build();

		Mono<ClientResponse> response = exchange.exchange(request);

		System.out.println(response.block().statusCode());
	}

}
