package com.synch.exampl2;

public class Work extends Thread {
	
	Sequence s;
	public Work(Sequence s) {
		// TODO Auto-generated constructor stub
		this.s=s;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" value "+s.nextVal());
			
			
		}
	}

}
