package com.synch.exampl2;

public class SynchMain {

	public static void main(String[] args) {
		// we are achieving the automicity that accessed data should be correct 
		Sequence s=new Sequence();
		
		Work w1=new Work(s);
		Work w2=new Work(s);
		Work w3=new Work(s);
		w1.setName("Thread-1");
		w2.setName("Thread-2");
		w3.setName("Thread-3");
		w1.start();
		w2.start();
		w3.start();

	}

}
