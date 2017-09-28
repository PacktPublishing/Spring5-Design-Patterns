package com.packt.patterninspring.chapter8.bankapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@ComponentScan(basePackages={"com.packt.patterninspring.chapter8.bankapp.repository", "com.packt.patterninspring.chapter8.bankapp.service"})
@Import({InfrastructureConfig.class})
public class AppConfig {
	
}
