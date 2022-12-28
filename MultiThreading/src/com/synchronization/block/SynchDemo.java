package com.synchronization.block;

public class SynchDemo {
	
	public  void  display(){
		System.out.println("other thread can executing "+Thread.currentThread().getName());
		synchronized (SynchDemo.class) {		
		for (int i = 0; i < 10; i++) {
			System.out.println("executing "+Thread.currentThread().getName());
		 }
		}
	}

}
