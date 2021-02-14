package com.ukrohit.singleton;

/**
 * @author Umesh Rohit
 *
 */
public class StaticInitialization {

	// private static variable
	private static StaticInitialization INSTANCE = null;

	// private constructor that will restrict to create object outside the class
	private StaticInitialization() {
	}

	// object initialization in station block we can also handle the exception in
	// static block 
	static {
		try {
			if (INSTANCE == null) {
				INSTANCE = new StaticInitialization();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// only one globle access point to get the instance of class
	// this is also known as utility method can access with the help of class name
	public static StaticInitialization getInstance() {

		return INSTANCE;
	}
}
