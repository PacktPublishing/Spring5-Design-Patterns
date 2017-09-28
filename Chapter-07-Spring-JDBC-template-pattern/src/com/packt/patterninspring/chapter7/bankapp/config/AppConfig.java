package com.packt.patterninspring.chapter7.bankapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@ComponentScan(basePackages={"com.packt.patterninspring.chapter7.bankapp.repository", "com.packt.patterninspring.chapter7.bankapp.service"})//implicity bean creation
@Import({InfrastructureConfig.class, SecurityConfig.class})
public class AppConfig {
	
}
