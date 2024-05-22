package org.example.easy.A061Palindrome;

public class ExerciseA061 {
    public static boolean isPalindrome(int number) {
        if(number < 1){
            return false;
        }

        int reversed = 0;
        int numberChecked = number;
        while (number != 0) {
            reversed = reversed * 10 + (number % 10);
            number /= 10;
        }
        return (numberChecked == reversed);
    }

    public static void main(String[] args) {
        // Test your function with sample inputss
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-121));
    }
}
