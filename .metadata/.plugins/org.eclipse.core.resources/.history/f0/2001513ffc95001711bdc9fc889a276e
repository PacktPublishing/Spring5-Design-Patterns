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

import java.util.HashMap;
import java.util.Map;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Arjen Poutsma
 */
public class DummyPersonRepository implements PersonRepository {

	private final Map<Integer, Person> people = new HashMap<>();

	public DummyPersonRepository() {
		this.people.put(1, new Person("John Doe", 42));
		this.people.put(2, new Person("Jane Doe", 36));
	}

	@Override
	public Mono<Person> getPerson(int id) {
		return Mono.justOrEmpty(this.people.get(id));
	}

	@Override
	public Flux<Person> allPeople() {
		return Flux.fromIterable(this.people.values());
	}

	@Override
	public Mono<Void> savePerson(Mono<Person> personMono) {
		return personMono.doOnNext(person -> {
			int id = people.size() + 1;
			people.put(id, person);
			System.out.format("Saved %s with id %d%n", person, id);
		}).thenEmpty(Mono.empty());
	}
}
