package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("ROHIT");
		al.add("VIDYUT");
		al.add("SAJAN");
		
		List<Integer> collect = al.stream().map((i)->i.length()).collect(Collectors.toList());
		System.out.println(collect);
		
		

	}

}
