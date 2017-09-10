/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.web.reactive.function;

import java.net.URI;
import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.http.HttpMethod;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFunction;
import org.springframework.web.reactive.function.client.ExchangeFunctions;

/**
 * @author Arjen Poutsma
 */
public class Client {

	private ExchangeFunction exchange = ExchangeFunctions.create(new ReactorClientHttpConnector());


	public static void main(String[] args) throws Exception {
		Client client = new Client();
		client.createPerson();
		client.printAllPeople();
	}

	public void printAllPeople() {
		URI uri = URI.create(String.format("http://%s:%d/person", Server.HOST, Server.PORT));
		ClientRequest request = ClientRequest.method(HttpMethod.GET, uri).build();

		Flux<Person> people = exchange.exchange(request)
				.flatMapMany(response -> response.bodyToFlux(Person.class));

		Mono<List<Person>> peopleList = people.collectList();
		System.out.println(peopleList.block());
	}

	public void createPerson() {
		URI uri = URI.create(String.format("http://%s:%d/person", Server.HOST, Server.PORT));
		Person jack = new Person("Jack Doe", 16);

		ClientRequest request = ClientRequest.method(HttpMethod.POST, uri)
				.body(BodyInserters.fromObject(jack)).build();

		Mono<ClientResponse> response = exchange.exchange(request);

		System.out.println(response.block().statusCode());
	}

}
