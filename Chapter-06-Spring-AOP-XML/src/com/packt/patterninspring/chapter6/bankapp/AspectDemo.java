package com.packt.patterninspring.chapter6.bankapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.packt.patterninspring.chapter6.bankapp.service.TransferService;

/**
 * @author Dinesh.Rajput
 *
 */
public class AspectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer("accountA", "accountB", 50000l);
		applicationContext.close();
	}

}
