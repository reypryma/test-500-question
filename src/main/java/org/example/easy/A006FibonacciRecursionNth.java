package org.example.easy;

public class A006FibonacciRecursionNth {
    public static long nthFibonacci(int n){
        // initialize a memoization array
        long memo[] = new long[n+1];
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
        }


        return memo[n];
    }
}
