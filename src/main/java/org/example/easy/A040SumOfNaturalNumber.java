package org.example.easy;

public class A040SumOfNaturalNumber {
    public static int iterativeSum(int n) {
        int sum = 0;
        while(n>0){
            sum += n;
            n--;
        }
        return sum;
    }

    public static int recursiveSum(int n) {
        // your code here
        if(n>0){
            return n + recursiveSum(n - 1);
        } else {
            return n;
        }
    }
}
