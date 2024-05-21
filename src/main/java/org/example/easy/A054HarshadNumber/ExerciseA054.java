package org.example.easy.A054HarshadNumber;

public class ExerciseA054 {
    public static boolean isHarshadNumber(int n) {
        if (n <= 0) {
            return false; // Only positive integers can be Harshad numbers
        }

        int sum = 0;
        int theCheckedNumber = n;

        while(n != 0){
            sum += n % 10;
            n /= 10;
        }

        return (theCheckedNumber % sum == 0);
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
    }
}
