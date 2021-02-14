package com.ukrohit.singleton;

/**
 * @author Umesh Rohit
 *
 */
public class ReflectionSingleton {

	// private static variable
	private static ReflectionSingleton INSTANCE = null;

	// private constructor that will restrict to create object outside the class
	private ReflectionSingleton() {
	}

	public static ReflectionSingleton getInstance() {
		try {
			if (INSTANCE == null) {
				INSTANCE = new ReflectionSingleton();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return INSTANCE;
	}

}
