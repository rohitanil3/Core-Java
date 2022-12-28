package com.synchronization;

public class Threads extends Thread {
	
    /*SynchDemo dm;
    String name ;
    
	public Threads(SynchDemo dm,String name){
		this.dm=dm;
		this.name=name;
		
	}*/
	
	public void run(){
		SynchDemo dm=new SynchDemo();
		dm.display();
	}

}
