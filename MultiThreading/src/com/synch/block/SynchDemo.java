package com.synch.block;

public class SynchDemo extends Thread {
	
	public void run(){
		display();
	
	}
	
	public  void display(){
		
		synchronized(this){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
		}
		}
		
	}

}
