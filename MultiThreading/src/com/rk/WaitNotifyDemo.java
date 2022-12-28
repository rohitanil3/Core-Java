package com.rk;

public class WaitNotifyDemo {
	
	public void display() throws InterruptedException{
		
		synchronized (this) {
			//System.out.println("before wait");
			
		
		for (int i = 0; i < 200; i++) {
			System.out.println("i "+i);
			
		 }
		this.notify();
		}
	}

}
