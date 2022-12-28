package com.problems;

public class EvenOdd implements Runnable {
	
	static int i=1;
	Object object;
	
	public EvenOdd(Object object){
		this.object=object;
		
	}
	
	public void run(){
		
		while(i<=10){
			//System.out.println(Thread.currentThread().getName()+i);
			synchronized (object) {	
					
			if(i%2==0 && Thread.currentThread().getName().equalsIgnoreCase("even")){
				
				System.out.println("even "+i);
				i++;
				try {
					object.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
			
			synchronized (object) {
			if(i%2!=0 && Thread.currentThread().getName().equalsIgnoreCase("odd")){
				
				System.out.println("odd "+i);
				i++;
				object.notify();
			}
			}
			
		}
	}

}
