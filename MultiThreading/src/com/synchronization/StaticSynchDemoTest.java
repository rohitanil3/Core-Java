package com.synchronization;

public class StaticSynchDemoTest {

	public static void main(String[] args) {

		/*SynchDemo dm=new SynchDemo();
		Threads t=new Threads(dm,"first");
		Threads t2=new Threads(dm,"second");
*/
		MultiThreadsStaticSynch t=new MultiThreadsStaticSynch();
		MultiThreadsStaticSynch t2=new MultiThreadsStaticSynch();
		t.start();
		t2.start();
	}

}
