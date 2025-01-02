package org.example.easy.A098ConfusingNumber;

public class A098Exercise {
    public static boolean isConfusingNumber(int num) {
        // Your code here
        int[] map = new int[]{0, 1, -1, -1, -1, -1, 9, -1, 8, 6};

        int original = num, result = 0;

        while (num != 0) {
            if (map[num % 10] == -1) return false;
            result = result * 10 + map[num % 10];
            num /= 10;
        }

        System.out.println("value " + result + " is confusing number " + original);

        return original != result;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        System.out.println(isConfusingNumber(6));
        System.out.println(isConfusingNumber(89));
        System.out.println(isConfusingNumber(8));
//        System.out.println(isConfusingNumber(11));
//        System.out.println(isConfusingNumber(25));

        /*
        *
            true
            true
            false
            false
        *
        * */
    }
}
