package com.rk;

public class ArrayProb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//replaceZero(new int[]{1,3,5,6,2,6,7,3,5});
		//replaceZero(new int[]{1,2,5,6,2});
		
		replaceZeroUsingSingleForloop(new int[]{1,3,5,6,2,6,7,3,5});
		replaceZeroUsingSingleForloop(new int[]{1,2,5,6,2});

	

	}

	public static void replaceZero(int arr[])
	{
		System.out.println("original array ");
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]);
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
              if(arr[j]==5 && arr[i]==3){
            	  arr[j]=0;            	  
              }
			}
		}
		
		System.out.println("Final array ");
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]);
		}
		System.out.println();

	}
	
	public static void replaceZeroUsingSingleForloop(int arr[])
	{
	
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]==3 && arr[i+1]==5){
				 arr[i+1]=0;
			 }
			 
		 }
		 System.out.println("Final array ");
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[j]);
			}
			System.out.println();
	}
}
