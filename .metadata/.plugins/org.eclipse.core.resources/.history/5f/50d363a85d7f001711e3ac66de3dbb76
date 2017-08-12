package com.packt.patterninspring.chapter9.bankapp.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@EnableCaching
@ComponentScan(basePackages={"com.packt.patterninspring.chapter9.bankapp"})
public class AppConfig {
	
	@Bean
	public CacheManager cacheManager() {
		CacheManager cacheManager = new ConcurrentMapCacheManager();
		return cacheManager;
	}
}
