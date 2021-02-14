package com.ukrohit.singleton;

/**
 * @author Umesh Rohit
 *
 */
public class SingletonEager {

	// private static variable 
	private static SingletonEager INSTANCE = new SingletonEager();

	// private constructor that will restrict to create object outside the class
	private SingletonEager() {
	}

	
	// only one  globle access point to get the instance of class
	// this is also known as utility method can access with the help of class name 
	public static SingletonEager getInstance() {
		return INSTANCE;
	}
}
