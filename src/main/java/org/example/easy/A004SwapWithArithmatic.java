package org.example.easy;

public class A004SwapWithArithmatic {
    public static int[] swapNumbers(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        return new int[]{a, b};
    }
}
