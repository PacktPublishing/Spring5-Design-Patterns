package com.packt.patterninspring.chapter6.bankapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.packt.patterninspring.chapter6.bankapp.aspect.Auditing;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.packt.patterninspring.chapter6.bankapp.service"})
public class AppConfig {
	@Bean
	public Auditing auditing() {
		return new Auditing();
	}
}
