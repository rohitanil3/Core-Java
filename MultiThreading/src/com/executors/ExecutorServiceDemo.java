package com.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		Runnable r1=new SampleThread(1);
		newFixedThreadPool.execute(r1);
		
		Runnable r2=new SampleThread(2);
		newFixedThreadPool.execute(r2);
		
		Runnable r3=new SampleThread(3);
		newFixedThreadPool.execute(r3);
		
		Runnable r4=new SampleThread(4);
		newFixedThreadPool.execute(r4);
		
		Runnable r5=new SampleThread(5);
		newFixedThreadPool.execute(r5);
		
		Runnable r6=new SampleThread(6);
		newFixedThreadPool.execute(r6);
		
		Runnable r7=new SampleThread(7);
		newFixedThreadPool.execute(r7);

	
		newFixedThreadPool.shutdown();


	}

}
