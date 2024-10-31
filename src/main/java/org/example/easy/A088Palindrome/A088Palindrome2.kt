package org.example.easy.A088Palindrome


/*

Expected Time Complexity:
    O(n)O(n), where nn is the length of the string.
Expected Auxiliary Space:
    O(1)O(1) (since the character set is fixed).

* */

object Exercise {
    fun canFormPalindrome(s: String?): Boolean {

        if (s == null) {
            throw IllegalArgumentException("Input string is null");
        }

//        // Your code here
//        var noSpace: String = s.replace(" ", "")
//
//        var left = 0;
//        var right = noSpace.length - 1;
//
//        while (left <= right) {
//            if(noSpace[left] != noSpace[right]) return false
//            left++
//            right--
//        }
//        return true

        val charCount = IntArray(26) // Only lowercase English letters
        // [2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0]

        for (c in s.replace(" ", "").toCharArray()) {
            charCount[c.code - 'a'.code]++
        }

        var oddCount = 0
        for (count in charCount) {
            if (count % 2 != 0) {
                oddCount++ //
            }
        }

        // charCount [2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0]

        return oddCount <= 1

    }

    @JvmStatic
    fun main(args: Array<String>) {
        // Test your function with sample inputs
//        println(canFormPalindrome("taco cot")) // -> true (because "taco cat" is a palindrome permutation)
//        println(canFormPalindrome("hello")) // -> false
//        println(canFormPalindrome("racecar")) // -> true
//        println(canFormPalindrome("aabbcc")) // -> // true
//        println(canFormPalindrome("abcdefg")) // -> false

        val sample = "taco cot"
        println(canFormPalindrome(sample))
    }
}
