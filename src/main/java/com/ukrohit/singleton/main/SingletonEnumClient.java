package com.ukrohit.singleton.main;

import com.ukrohit.singleton.SingletonEnum;

public class SingletonEnumClient {

	public static void main(String[] args) {

		SingletonEnum instance1 = SingletonEnum.GETINSTANCE;
		SingletonEnum instance2 = SingletonEnum.GETINSTANCE;

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

		instance1.welcome();
		
		instance2.welcome();

	}

}
