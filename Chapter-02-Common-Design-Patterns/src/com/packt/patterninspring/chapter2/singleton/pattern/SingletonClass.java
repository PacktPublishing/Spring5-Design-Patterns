package com.packt.patterninspring.chapter2.singleton.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class SingletonClass {
	private static SingletonClass instance = null;
    private SingletonClass() {
    }
    public static SingletonClass getInstance() {
        if (instance == null) {
        	synchronized(SingletonClass.class){  
        		if (instance == null) {
        			instance = new SingletonClass();
        		}
        	}
        }
        return instance;
    }
}
