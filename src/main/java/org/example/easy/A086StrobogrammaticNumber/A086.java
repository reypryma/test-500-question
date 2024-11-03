package org.example.easy.A086StrobogrammaticNumber;

public class A086 {
    public static boolean isStrobogrammatic(String num) {
        // Your code here
        char[] chars = num.replaceAll(" ", "").toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (checkLeftAndRight(chars[left], chars[right] )) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean checkLeftAndRight(char left, char right) {
        return left == '6' && right == '9' || left == '9' && right == '6' || left == right;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
    }
}
