package org.example.easy.A088Palindrome;

public class A088Palindrome2 {

    public static boolean canFormPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string is null");
        }

        int[] charCount = new int[26];  // Only lowercase English letters
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {
        String sample = "tactcoa";
        System.out.println(canFormPalindrome(sample));  // Expected: true (because "taco cat" is a palindrome permutation)
    }

}
