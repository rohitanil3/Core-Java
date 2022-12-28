package com.predicate;

import java.util.function.Predicate;

public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = (i)->(i%2==0);
		
		int nums[]={1,11,21,22,24,19};
		
		for (int j : nums) {
			if(p.test(j))
				System.out.println(j);
			
		}

	}

}
