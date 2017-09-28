package com.packt.patterninspring.chapter8.bankapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.packt.patterninspring.chapter8.bankapp.config.AppConfig;
import com.packt.patterninspring.chapter8.bankapp.service.TransferService;

/**
 * @author Dinesh.Rajput
 *
 */
public class SpringORMDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer(50000l, 1000l, 2000l);
		applicationContext.close();
	}
	
}
