package com.packt.patterninspring.chapter2.flyweight.pattern;

import com.packt.patterninspring.chapter2.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public class FlyweightPatternClient {

	public static void main(String[] args) {
		for(int i=0; i < 10; ++i) {
			Account account = (Account)AccountFlyweightFactory.getAccount("SAVING");
			account.accountType();
		}
	}
}
