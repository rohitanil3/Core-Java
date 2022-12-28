package com.string.problems;


public class Solution {
    public String solution(int N, int K) {
 
        String res = "";
         
        for (int i = 0; i < K; i++)
            res = res + (char)('a' + i);
    
        int count = 0;
         
        for (int i = 0; i < N - K; i++)
        {
            res = res + (char)('a' + count);
            count++;
             
            if(count == K)
                count = 0;
        }
         
        return res;
    }

    static public void main (String[] args)
    {
     
        int n = 8, k = 2;
        Solution s =new Solution(); 
        System.out.println(s.solution(n, k));
    }
}
