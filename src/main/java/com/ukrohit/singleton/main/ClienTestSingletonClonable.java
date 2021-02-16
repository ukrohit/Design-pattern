package com.ukrohit.singleton.main;

import com.ukrohit.singleton.LazyInitializationSingleton;

public class ClienTestSingletonClonable {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		 LazyInitializationSingleton singleton1 = LazyInitializationSingleton.getInstance();
		 
		 LazyInitializationSingleton singleton2 = (LazyInitializationSingleton) singleton1.clone();
		 
		 System.out.println(singleton1.hashCode());
		 System.out.println(singleton2.hashCode());


	}

}
