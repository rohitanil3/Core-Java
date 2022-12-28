package com.producerconsumer;

public class MainThread {

	public static void main(String[] args) {
		
		Company c=new Company();
		Producer produce=new Producer(c);
		Consumer consume=new Consumer(c);
		
		produce.start();
		consume.start();

	}

}
