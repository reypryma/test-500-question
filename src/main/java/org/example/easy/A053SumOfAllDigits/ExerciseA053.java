package org.example.easy.A053SumOfAllDigits;

public class ExerciseA053 {
    public static int sumOfAllDigits(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num != 0){
            sum += num % 10; // Extracting the last digit
            num /= 10; // Removing the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        System.out.println(sumOfAllDigits(123));
    }
}
