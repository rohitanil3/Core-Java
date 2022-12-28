package com.rk;

public class Child extends Parent {

	int c,d;

	public Child(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}
	
	
	public void display(){
		System.out.println(a + b + c + d);
	}
	
 
}
