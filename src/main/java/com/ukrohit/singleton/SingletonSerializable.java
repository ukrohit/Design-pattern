package com.ukrohit.singleton;

import java.io.Serializable;

/**
 * @author Umesh Rohit
 *
 */
public class SingletonSerializable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private static variable
	private static SingletonSerializable INSTANCE = null;

	private SingletonSerializable() {
	}

	public static synchronized SingletonSerializable getInstance() {
		try {
			if (INSTANCE == null) {
				INSTANCE = new SingletonSerializable();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return INSTANCE;
	}

	/**
	 * @return This method is used to restrict singleton breaking
	 */
	private Object readResolve() {
		return getInstance();
	}
}
