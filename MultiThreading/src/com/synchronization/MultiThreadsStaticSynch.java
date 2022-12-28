package com.synchronization;

public class MultiThreadsStaticSynch extends Thread {
	
    /*SynchDemo dm;
    String name ;
    
	public Threads(SynchDemo dm,String name){
		this.dm=dm;
		this.name=name;
		
	}*/
	
	public void run(){
		StaticSynchDemo.display();
	}

}
