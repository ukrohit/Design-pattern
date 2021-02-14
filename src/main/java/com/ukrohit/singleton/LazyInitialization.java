package com.ukrohit.singleton;

/**
 * @author Umesh Rohit
 *
 *         Lazy inilization of single class will work in the single thread
 *         environment not in multi threaded environment
 * 
 *         THis may cause issue in multi thread environment
 */
public class LazyInitialization {

	// private static variable
	private static LazyInitialization INSTANCE = null;

	// private constructor that will restrict to create object outside the class
	private LazyInitialization() {
	}

	// only one globle access point to get the instance of class
	// this is also known as utility method can access with the help of class name
	public static synchronized LazyInitialization getInstance() {
		// onject initializa when first time use the static method this is the best
		// approach to create use the singleton class
		try {
			if (INSTANCE == null) {
				Thread.sleep(200);
				INSTANCE = new LazyInitialization();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return INSTANCE;
	}
}
