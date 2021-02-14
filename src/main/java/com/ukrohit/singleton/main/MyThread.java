package com.ukrohit.singleton.main;

import com.ukrohit.singleton.LazyInitialization;

public class MyThread implements Runnable {

	public void run() {
		LazyInitialization instance = LazyInitialization.getInstance();
		
		System.out.println(Thread.currentThread().getName()+"============"+instance.hashCode());
		
	}

}
