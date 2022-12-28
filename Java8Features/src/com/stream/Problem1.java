package com.stream;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map=new HashMap<>();
		map.put("Rohit", 1);
		map.put("Shravan", 2);
		map.put("Shyam", 3);
		map.put("Karan", 3);
		
		map.forEach((key,val)->System.out.println(key+" "+val));

	}

}
