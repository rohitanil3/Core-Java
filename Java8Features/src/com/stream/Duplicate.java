package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= Arrays.asList(10,11,21,11,54,11,65,53,53,7,4,8,9,9,7);
		Set<Integer> collect = new HashSet<>();
	    Set<Integer> collect2 = list.stream().filter(s->!collect.add(s)).collect(Collectors.toSet());
		//System.out.println("Unique elements "+collect);
		System.out.println("Duplicate elements "+collect2);

		

	}

}
