/**
 * 
 */
package com.doj.webapp.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.doj.webapp.config.ApplicationConfig;
import com.doj.webapp.web.config.SpringMvcConfig;

/**
 * @author Dinesh.Rajput
 * like as web.xml
 * AbstractAnnotationConfigDispatcherServletInitializer - internally configured DispatcherServlet
 */
public class SpringApplicationInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {
	//ApplicationContext
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class <?>[]{ApplicationConfig.class};
	}
	//WebApplicationContext
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class <?>[]{SpringMvcConfig.class};
	}
	
	//This method responsible for URL pattern as like in web.xml file <url-pattern>/</url-pattern>
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
