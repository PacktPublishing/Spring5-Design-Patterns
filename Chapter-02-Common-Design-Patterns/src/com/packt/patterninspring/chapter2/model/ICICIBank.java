package com.packt.patterninspring.chapter2.model;

/**
 * @author Dinesh.Rajput
 *
 */
public class ICICIBank implements Bank {

	@Override
	public void bankName() {
		System.out.println("ICICI Bank Ltd.");
	}

}
