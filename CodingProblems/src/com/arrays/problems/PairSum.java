package com.arrays.problems;

import java.util.HashSet;

public class PairSum {
    static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        int cnt=0;
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
 
            // checking for condition
            if (s.contains(temp)) {
               // System.out.println("Yes");
                cnt++;
                //return;
            }
            s.add(arr[i]);
        }
       // System.out.println("No");
        System.out.println(cnt);
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8, 8,8};
        int n = 16;
        printpairs(A, n);
    }
}
 