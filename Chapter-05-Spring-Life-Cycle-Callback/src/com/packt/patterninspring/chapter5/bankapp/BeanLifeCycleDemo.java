package com.packt.patterninspring.chapter5.bankapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.packt.patterninspring.chapter5.bankapp.config.AppConfig;

/**
 * @author Dinesh Rajput
 *
 */
public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		//ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		applicationContext.close();
	}
}
