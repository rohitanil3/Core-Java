package com.synchronization;

public class StaticSynchDemo {
	
	public static synchronized void  display(){
		for (int i = 0; i < 10; i++) {
			System.out.println("executing "+Thread.currentThread().getName());
		}
	}

}
