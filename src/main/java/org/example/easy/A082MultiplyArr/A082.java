package org.example.easy.A082MultiplyArr;

import java.util.Arrays;

public class A082 {
    public static int[] multiplyByTen(int[] arr) {
        // Your code here

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException();
        }

        return Arrays.stream(arr).map(operand -> operand * 10).toArray();
    }

    public static void main(String[] args) {
        // Test your function with sample inputs

    }
}
