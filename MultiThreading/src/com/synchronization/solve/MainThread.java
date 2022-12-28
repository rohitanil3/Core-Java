package com.synchronization.solve;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		
		Employees e=new Employees();	
		Workers w=new Workers();
		Employees e2=new Employees();	
		Workers w2=new Workers();
		Thread t1=new Thread(e);
		Thread t2=new Thread(w);
		Thread t3=new Thread(e2);
		Thread t4=new Thread(w2);
		t1.setName("Thread-Employee");
		t2.setName("Thread-worker");
		t3.setName("Thread-Employee-2");
		t4.setName("Thread-worker-2");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();

	}	

}
