package com.synch;

public class SynchDemo extends Thread {
	
	public void run(){
		display();
	
	}
	
	public synchronized void display(){
		
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
