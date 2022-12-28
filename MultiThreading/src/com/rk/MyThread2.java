package com.rk;

public class MyThread2 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
		
		
		for (int i = 0; i < 200; i++) {
			System.out.println("j "+i);
			
		}
		System.out.println("thread 2 completed");
		this.notifyAll();

		}
	}

}
