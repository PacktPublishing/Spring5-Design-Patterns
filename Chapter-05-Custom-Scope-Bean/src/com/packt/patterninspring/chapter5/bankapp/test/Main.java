package com.packt.patterninspring.chapter5.bankapp.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.packt.patterninspring.chapter5.bankapp.bean.MyBean;

/**
 * @author Dinesh.Rajput
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBean myBean = applicationContext.getBean(MyBean.class);
		System.out.println(myBean.getName());
		System.out.println("All registered Scopes are : ");
		for(String scope : applicationContext.getBeanFactory().getRegisteredScopeNames()){
			System.out.println(scope);
		}
		applicationContext.close();
	}

}
