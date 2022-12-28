package com.rohit;

public class PrimitiveAndObjects {

	public static void main(String[] args) {
		
		int x=100;
		Integer y = Integer.valueOf(x);//boxing
		int z = y.intValue();//unboxing
		
		
		char c='c';
		Character d = Character.valueOf(c);
		char charValue = d.charValue();

	}

}
