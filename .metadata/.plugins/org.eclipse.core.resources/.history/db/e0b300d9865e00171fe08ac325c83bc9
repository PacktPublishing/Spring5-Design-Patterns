/**
 * 
 */
package com.doj.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.doj.app.repository.AccountRepositoryFactoryBean;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@ComponentScan(basePackages={"com.doj.app.service"})
public class AppConfig {
	
	/*@Bean
	public IAccountRepository accountRepository(){
		return new AccountRepository();
	}*/
	
	@Bean
	public AccountRepositoryFactoryBean accountRepository(){
		return new AccountRepositoryFactoryBean();
	}
}
