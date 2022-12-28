package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer integers[]={10,11,24,25,66,64,59};
		
		List<Integer> al=Arrays.asList(integers);
		
		System.out.println(al);
		
		Comparator<Integer> comp=(i1,i2)->i2.compareTo(i1);
		
		List<Integer> list = al.stream().filter(i->i%2==0).sorted(comp).collect(Collectors.toList());
		System.out.println(list);
		

		List<String> sl=new ArrayList<>();
		System.out.println("size"+sl.size());
		sl.add("rk");
		sl.add("Rohit");
		sl.add("Vidut");
		sl.add("rr");
		
		Comparator<String> cmp=(s1,s2)->{
			int res= 0;
			res=(s1.length()<s2.length())  ?-1:1;
			return res;
			
		};
		List<String> list2 = sl.stream().sorted(cmp).collect(Collectors.toList());
		System.out.println(list2);
	}

}
