package com.search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]={10,3,45,21,99,78,66,43,22};
		Arrays.sort(arr);
		int key=99;
		System.out.println(binarySearch(arr,0,arr.length-1,key));

	}

	private static int binarySearch(int[] arr, int low, int high, int key) {
		
		int mid;
		mid= (low+high)/2;
		if(high>=low){
		if(key==arr[mid]){
			return mid;
		}
	    if(key<arr[mid]){
			high=mid-1;
			return binarySearch(arr, low, high, key);
			
		}
	    
	    if(key>arr[mid]){
			high=arr.length-1;
			low=mid+1;
			return binarySearch(arr, low, high, key);
			
		}
		}
	      return -1;
		
	}

}
