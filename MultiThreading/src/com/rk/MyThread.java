package com.rk;

public class MyThread extends Thread {

	@Override
	public void run() {
	
		synchronized (this) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			for (int i = 0; i < 200; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		}

	}

}
