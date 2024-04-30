package org.example;

import org.example.easy.A001A046.A040SumOfNaturalNumber;

public class Main2 {
    public static long factorial(int n){
        // base case: if n is 0, return 1
        // your code here
        if(n==0) return 1;

        return n * factorial(n-1);
        // recursive case: n * factorial(n - 1)
        // your code here
    }
    public static void main(String[] args) {
        System.out.println(A040SumOfNaturalNumber.recursiveSum(10));
    }
}
