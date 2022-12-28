package com.producerconsumer;

public class Consumer extends Thread{
	
	Company c;
	public Consumer(Company c){
		this.c=c;
	}
	
	public void run(){
		while(true){
			this.c.consumer();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

}
