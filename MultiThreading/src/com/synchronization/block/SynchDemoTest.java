package com.synchronization.block;

public class SynchDemoTest {

	public static void main(String[] args) {

		/*SynchDemo dm=new SynchDemo();
		Threads t=new Threads(dm,"first");
		Threads t2=new Threads(dm,"second");
*/
		Threads t=new Threads();
		Threads t2=new Threads();
		t.start();
		t2.start();
	}

}
