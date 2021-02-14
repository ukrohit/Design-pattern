package com.ukrohit.singleton;

/**
 * @author Umesh Rohit
 *
 *THis is the best approach to create the singleton 
 *
 *but in this scenario lazy initialization is not possible 
 */
public enum SingletonEnum {

	GETINSTANCE;
	
	public String welcome() {
		return "welcome"; 
		
	}

}
