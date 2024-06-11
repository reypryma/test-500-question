package org.example.easy.A062Prime;

public class ExerciseA062 {
    public static boolean isPrime(int n) {
        n = Math.abs(n);

        if(n<4 && n>1){
            return true;
        } else if (n<=1 || n==4) {
            return false;
        } else if(n % 2 == 0){
            return false;
        }

        for (int i = 5; i < n; i+=2) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeSQRT(int num){
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

    public static void main(String[] args) {
        // Test your function with sample inputs
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));
        System.out.println(isPrime(17));
        System.out.println(isPrime(25));
    }
}
