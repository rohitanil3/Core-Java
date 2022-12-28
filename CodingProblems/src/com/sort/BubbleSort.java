package com.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={17,45,6,13,89,42,76,33,4};
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < arr.length-i-1; j++) {
				
				if(arr[j]>arr[j+1]){
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
			
		}
		
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
