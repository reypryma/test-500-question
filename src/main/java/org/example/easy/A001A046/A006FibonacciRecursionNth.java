package org.example.easy.A001A046;

public class A006FibonacciRecursionNth {
    public static long nthFibonacci(int n){
        // initialize a memoization array
        long[] memo = new long[n+1];
        /*
        * if n = 12 then [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        * */

        // your code here

        // call the helper function and return the result
        // your code here
        return fibonacci(n, memo);
    }

    private static long fibonacci(int n, long[] memo){

        // if n is 0 or 1, return n
        if(n<=1){
            return n;
        }
        // your code here

        // if memo[n] is not yet set, calculate it
        // your code here
        if(memo[n] == 0){
            memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
            // there are two recursive loop, each will do first take that lead from 12 to iteration n = 1 / n=0 that will return n
            // this will update the first and second index to 0,1
            // the second iteration will be from index 0/1 to 12
            // the recursion end if n = 12 have value not 0
        }


        return memo[n];
    }
}
