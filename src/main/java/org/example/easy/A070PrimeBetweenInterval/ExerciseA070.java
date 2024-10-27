package org.example.easy.A070PrimeBetweenInterval;

import java.util.ArrayList;
import java.util.List;

public class ExerciseA070 {
    public static boolean isPrime(int num) {
        // Your code to check primality
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findPrimesBetweenIntervals(int start, int end) {
        // Your code to find primes between intervals
        List<Integer> primeNumber = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeNumber.add(i);
            }
        }
        return primeNumber;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        System.out.println(findPrimesBetweenIntervals(0, 1));
    }
}
