package com.synch.exampl2;

public class Sequence  {

	int value=0;
	
	public int nextVal(){
		
		synchronized (this) {
			//System.out.println(this.toString());
			value=value+1;
			return value;
		}
		
	}
	
	
}
