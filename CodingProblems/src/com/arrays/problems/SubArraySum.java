package com.arrays.problems;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={10,3,45,21,99,78,66,43,22};
		int key=65;
		boolean flag=false;
		
		for (int i = 0; i < arr.length; i++) {
			int sumarr=arr[i];
			
			if(sumarr==key){
				System.out.println(i);
				flag=true;
			}else{
				for (int j = i+1; j < arr.length; j++) {
					
					sumarr=sumarr+arr[j];
					if(sumarr==key){
						System.out.println(i+" "+j);
						flag=true;
					}
					
				}
			}
			
		}
		
		if(!flag){
			System.out.println("no subarray exists ");
		}
		

	}

}

