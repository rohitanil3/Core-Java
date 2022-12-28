package com.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> asList = Arrays.asList(10,10,5,6,87,9,3,41,41,5,77);
		Set<Integer>  set=new HashSet<>();
		Set<Integer> collect = asList.stream().filter(s->!set.add(s)).collect(Collectors.toSet());
		System.out.println(collect);

	}

}
