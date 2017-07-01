package com.packt.patterninspring.chapter4.bankapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.packt.patterninspring.chapter4.bankapp.service.TransferService;

/**
 * @author Dinesh Rajput
 *
 */
public class FactoryBeanDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer("A", "B", 3000.1);
		applicationContext.close();
	}

}
