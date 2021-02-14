package com.ukrohit.singleton;

/**
 * @author Umesh Rohit
 *
 */
public class BillPughSingleton {

	/**
	 * private constructor to create the object inside the class only[p=-o
	 */
	private BillPughSingleton() {
	}

	/**
	 * @author Umesh Rohit
	 *
	 *         private static inner class can be access inside the class only to
	 *         instantiate the object
	 * 
	 *         when the class loaded this static class will not loaded into the
	 *         memory
	 * 
	 *         this will load into the memory when we call the get instance method
	 * 
	 *         So this is also working like the lazy initialization of instance
	 * 
	 *         this is also not required any synchronization, this is also thread
	 *         safe in nature
	 * 
	 */
	private static class SingleTonHolder {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();

	}

	/**
	 * @return
	 * 
	 *         This is the utility method
	 */
	public static BillPughSingleton getInstance() {
		return SingleTonHolder.INSTANCE;
	}

}
