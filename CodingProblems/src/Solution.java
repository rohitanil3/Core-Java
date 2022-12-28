// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int sum = 0;
    while (N != 0)
    {
        sum = sum + N % 10;
        N =N / 10;
    }
    return sum;
    }

     void smallestNumber(int N,int k)
{
    int i =k+1;
    while (1 != 0)
    {
        // Checking if number has
        // sum of digits = N
        if (solution(i) == N)
        {
            System.out.print(i);
            break;
        }
        i++;
    }
    
    
}
     public int getSum(int N) {
         // write your code in Java SE 8
         int sum = 0;
     while (N != 0)
     {
         sum = sum + N % 10;
         N =N / 10;
     }
     return sum;
     }
     
 
// Driver code
public static void main(String[] args)
{
    int N = 28,k=28;
    Solution s=new Solution();
    s.smallestNumber(s.getSum(N),k);
}
}
