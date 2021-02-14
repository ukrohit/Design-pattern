package com.ukrohit.singleton.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.ukrohit.singleton.ReflectionSingleton;

public class ReflectionSingletonClient {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ReflectionSingleton singleton1 = ReflectionSingleton.getInstance();
		/*
		 * ReflectionSingleton singleton2 = ReflectionSingleton.getInstance();
		 * 
		 * System.out.println(singleton1.hashCode());
		 * 
		 * System.out.println(singleton2.hashCode());
		 */

		ReflectionSingleton singleton2 = null;

		// this is the reclection impleementaion , we can create the instance of class
		// having private constructor by changing the accessibility
		// by this get DeclaredConstructor sethods we can get all the constuctor of the class 
		Constructor<?>[] declaredConstructors = ReflectionSingleton.class.getDeclaredConstructors();

		// In this way we can break all the singleton behavior of class
		for (Constructor<?> constructor : declaredConstructors) {
			constructor.setAccessible(true);
			Object newInstance = constructor.newInstance();

			singleton2 = (ReflectionSingleton) newInstance;
			break;
		}

		System.out.println(singleton1.hashCode());

		System.out.println(singleton2.hashCode());

	}

}
