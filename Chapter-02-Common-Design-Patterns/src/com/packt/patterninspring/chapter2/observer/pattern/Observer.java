/**
 * 
 */
package com.packt.patterninspring.chapter2.observer.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public interface Observer {
	
	public void update();
		
	public void setSubject(Subject sub);
}
