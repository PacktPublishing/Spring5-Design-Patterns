package com.packt.patterninspring.chapter2.model;

/**
 * @author Dinesh.Rajput
 *
 */
public class YesBank implements Bank{

	@Override
	public void bankName() {
		System.out.println("Yes Bank Pvt. Ltd.");
	}

}
