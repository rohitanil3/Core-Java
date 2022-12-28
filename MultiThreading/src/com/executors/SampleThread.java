package com.executors;

public class SampleThread implements Runnable{
	int msg;
	
	public SampleThread(int msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	
	@Override
	public void run() {
         
	
		System.out.println(msg+"Message received by "+Thread.currentThread().getName());
		respond();
		System.out.println(msg+"Message responded by "+Thread.currentThread().getName());


	}

	private void respond() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
