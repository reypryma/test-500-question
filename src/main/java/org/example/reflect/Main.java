package org.example.reflect;

public class Main {
    public static long nthFibonacci(int n){
        // initialize a memoization array
        // your code here
        long[] memo = new long[n+2]; // this will default all value to 0
        memo[1] = 1;

        for (long m: memo
             ) {
            System.out.println("Yuk" + m);
        }

        fibonacci(n, memo);

        // call the helper function and return the result
        for (int i = 1; i <= n; i++) {
            System.out.println("Step " + i + ": " + memo[i]);
        }

        // your code here
        return memo[n];
    }

    private static long fibonacci(int n, long[] memo){
        // if n is 0 or 1, return n
        // your code here

        if(n<=1){
            return n;
        }

        // if memo[n] is not yet set, calculate it
        // your code here
        if(memo[n] == 0){
            memo[n] = fibonacci(n-1, memo) + fibonacci(n-2, memo);;
        }

        // return memo[n]
        return memo[n];
        // your code here
    }

    public static int countDigitFrequency(long number, int digit){
        // Initialize count to 0
        // your code here
        int count = 0;

        // Use a while loop to iterate through each digit in the number
        // your code here
        while(number > 0){
            int getLast = (int) (number % 10);
            if(getLast == digit){
                count++;
            }
            number /= 10;
        }

        // Return the count
        // your code here
        return count;
    }


    public static void main(String[] args) {
        nthFibonacci(12);
    }
}
