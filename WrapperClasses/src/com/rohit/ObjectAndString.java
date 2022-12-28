package com.rohit;

public class ObjectAndString {
	protected long ll;
	public int a;

	public static void main(String[] args) {
		
		long l=100;
		Long long1 = Long.valueOf(l);//object
		String s = Long.toString(long1);//object to string
		Long long2 = Long.valueOf(s);//String to object
		long parseLong = Long.parseLong(s);//String to primitive long

	}

}
