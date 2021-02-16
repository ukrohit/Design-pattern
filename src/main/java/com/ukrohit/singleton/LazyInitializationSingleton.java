package com.ukrohit.singleton;

/**
 * @author Umesh Rohit
 *
 *         Lazy inilization of single class will work in the single thread
 *         environment not in multi threaded environment
 * 
 *         THis may cause issue in multi thread environment
 * 
 *         implement clonable interface to create the clone of object
 */
public class LazyInitializationSingleton implements Cloneable {

	// private static variable
	private static LazyInitializationSingleton INSTANCE = null;

	// private constructor that will restrict to create object outside the class
	private LazyInitializationSingleton() {
	}

	// only one globle access point to get the instance of class
	// this is also known as utility method can access with the help of class name
	public static LazyInitializationSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazyInitializationSingleton();
		}

		return INSTANCE;
	}

	/**
	 * if you throw the cloneNotsupport exception that will restrict to create the
	 * clone of singleton class
	 *
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("You can not create clone of singleton ");
	}
}
