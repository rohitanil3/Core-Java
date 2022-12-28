package com.producerconsumer;

public class Producer extends Thread{
	
	Company c;
	int i=1;
	public Producer(Company c){
		this.c=c;
	}
	
	public void run(){
		while(true){
		this.c.producer(i);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		i++;
		}
	}

}
