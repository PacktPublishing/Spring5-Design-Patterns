package com.packt.patterninspring.chapter1.bankapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.packt.patterninspring.chapter1.bankapp.aspect.LoggingAspect;
import com.packt.patterninspring.chapter1.bankapp.repository.AccountRepository;
import com.packt.patterninspring.chapter1.bankapp.repository.TransferRepository;
import com.packt.patterninspring.chapter1.bankapp.repository.jdbc.JdbcAccountRepository;
import com.packt.patterninspring.chapter1.bankapp.repository.jdbc.JdbcTransferRepository;
import com.packt.patterninspring.chapter1.bankapp.service.TransferService;
import com.packt.patterninspring.chapter1.bankapp.service.TransferServiceImpl;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	
	@Bean
	public TransferService transferService(){
		return new TransferServiceImpl(accountRepository(), transferRepository());
	}
	@Bean
	public AccountRepository accountRepository() {
		return new JdbcAccountRepository();
	}
	@Bean
	public TransferRepository transferRepository() {
		return new JdbcTransferRepository();
	}
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
