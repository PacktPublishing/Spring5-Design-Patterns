package com.packt.patterninspring.chapter1.bankapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.packt.patterninspring.chapter1.bankapp.config.AppConfig;
import com.packt.patterninspring.chapter1.bankapp.model.Amount;
import com.packt.patterninspring.chapter1.bankapp.service.TransferService;

public class TransferMain {

	public static void main(String[] args) {
		//Load Spring context
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//Get TransferService bean
		TransferService transferService = applicationContext.getBean(TransferService.class);
		//Use transfer method
		transferService.transferAmmount(100l, 200l, new Amount(2000.0));
		applicationContext.close();
	}

}
