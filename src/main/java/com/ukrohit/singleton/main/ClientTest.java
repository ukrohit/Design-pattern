package com.ukrohit.singleton.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

	public static void main(String[] args) {

		ExecutorService excutorservice = null;
		MyThread thread = new MyThread();
		try {

			excutorservice = Executors.newFixedThreadPool(3);
			excutorservice.execute(thread);
			excutorservice.execute(thread);
			excutorservice.execute(thread);
			excutorservice.execute(thread);
			excutorservice.execute(thread);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(excutorservice!=null)
			{
				excutorservice.shutdown();
			}
		}

	}

}
