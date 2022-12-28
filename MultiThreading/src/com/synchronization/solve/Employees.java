package com.synchronization.solve;

public class Employees extends Thread{
	Company c=new Company();
	
	 public  void run(){
		 for(int i=0;i<5;i++){
			 c.bagsprovide();
		 }
		 try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 

}
