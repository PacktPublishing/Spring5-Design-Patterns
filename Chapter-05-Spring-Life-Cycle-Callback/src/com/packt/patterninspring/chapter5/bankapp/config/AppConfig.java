package com.packt.patterninspring.chapter5.bankapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.packt.patterninspring.chapter5.bankapp.repository.AccountRepository;
import com.packt.patterninspring.chapter5.bankapp.repository.JdbcAccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@ComponentScan("com.packt.patterninspring.chapter5.bankapp")
public class AppConfig {
	@Bean(initMethod = "populateCache")
	public AccountRepository accountRepository(){
		return new JdbcAccountRepository();
	}
}
