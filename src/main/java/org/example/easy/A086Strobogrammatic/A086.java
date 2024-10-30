package org.example.easy.A086Strobogrammatic;

public class A086 {

    public static boolean isStrobogrammatic(String num) {
        int left = 0, right = num.length() - 1;

        while (left <= right) {
            if (!isPair(num.charAt(left), num.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static boolean isPair(char a, char b) {
        return (a == '0' && b == '0') ||
                (a == '1' && b == '1') ||
                (a == '8' && b == '8') ||
                (a == '6' && b == '9') ||
                (a == '9' && b == '6');
    }

    public static void main(String[] args) {
        System.out.println(isStrobogrammatic("69"));         // -> true
        System.out.println(isStrobogrammatic("818"));
        System.out.println(isStrobogrammatic("962"));
    }
}
