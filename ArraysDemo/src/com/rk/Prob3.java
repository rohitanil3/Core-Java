package com.rk;

import java.util.ArrayList;

public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myScores = {5, 5, 4, 3, 2, 4};

		//setScores(myScores);

		//displayScores();   

		myScores[1] = 1;
		for (int i = 0; i < myScores.length; i++) {
			System.out.println(myScores[i]);
		}
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(8);
		al.add(7);
		al.add(1, 77);
		System.out.println(al);
		

	}

}
