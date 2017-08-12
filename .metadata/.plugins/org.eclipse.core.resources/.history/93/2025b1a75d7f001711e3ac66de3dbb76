package com.packt.patterninspring.chapter9.bankapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.packt.patterninspring.chapter9.bankapp.model.Account;
import com.packt.patterninspring.chapter9.bankapp.service.AccountService;

/**
 * @author Dinesh.Rajput
 *
 */
public class SpringCacheDemo {

	public static void main(String[] args) {
		//ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		AccountService transferService = applicationContext.getBean(AccountService.class);
		Account account = transferService.findOne(1l);
		System.out.println(account);
		account = transferService.findOne(1l);
		System.out.println(account);
		applicationContext.close();
	}
	
}
