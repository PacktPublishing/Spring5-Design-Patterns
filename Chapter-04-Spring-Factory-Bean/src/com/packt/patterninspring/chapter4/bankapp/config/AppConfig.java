package com.packt.patterninspring.chapter4.bankapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.packt.patterninspring.chapter4.bankapp.repository.AccountRepositoryFactoryBean;
import com.packt.patterninspring.chapter4.bankapp.service.TransferService;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
public class AppConfig {
	@Bean
	public TransferService transferService() throws Exception{
		return new TransferService(accountRepository().getObject());
	}
	@Bean
	public AccountRepositoryFactoryBean accountRepository(){
		return new AccountRepositoryFactoryBean();
	}
}
