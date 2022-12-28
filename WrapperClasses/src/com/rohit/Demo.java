package com.rohit;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		Integer value = 1;

		Map<Character, Integer> map = new HashMap<>();

		map.put('A', 1);
		map.put('b', 12);
		map.put('C', 13);
		map.put('D', 14);

	

			for (Entry<Character, Integer> entrySet : map.entrySet()) {
				if (entrySet.getValue() == value) {
					System.out.println("For Value "+value+" key is "+entrySet.getKey());

				}

			}

		

	}

}
