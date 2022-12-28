package com.rk;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		 MyThread t1=new MyThread();
		 t1.start();
		 MyThread t2=new MyThread();
		 t2.start();
		
	}

}
