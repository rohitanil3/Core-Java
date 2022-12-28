package com.synchronization;

public class YieldDemo {
	
	
		
		public synchronized void  display(){
			for (int i = 0; i < 10; i++) {
				System.out.println("executing "+Thread.currentThread().getName());
				Thread.yield();
			}
		}

	


}
