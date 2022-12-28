package com.problems;

public class PrintEvnOddTwoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object=new Object();
		EvenOdd t1=new EvenOdd(object);
		EvenOdd t2=new EvenOdd(object);
		Thread thread1=new Thread(t1, "even");
		Thread thread2=new Thread(t2, "odd");
		
		thread1.start();
		thread2.start();

	}

}
