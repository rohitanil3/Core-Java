package com.producerconsumer;

public class Company {
	int n;
	boolean flag=false;
	public synchronized void producer(int n){
		if(flag==false){
			this.n=n;
			System.out.println("Produced "+n);
			flag=true;
			notify();
		}
		
		if(flag==true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public synchronized void consumer(){
		if(flag==true){
		System.out.println("Consumed "+this.n);
		flag=false;
		notify();
		}
		if(flag==false){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
