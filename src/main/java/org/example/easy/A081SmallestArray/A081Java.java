package org.example.easy.A081SmallestArray;

import java.util.Arrays;

public class A081Java {
    public static int smallestElement(int[] arr) {
        // Your code here
        if (
                arr == null || arr.length == 0
        ) {
            throw new IllegalArgumentException();
        }

        if (arr.length == 1) {
            return arr[0];
        }

        int minVal = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (minVal > arr[i + 1]) {
                minVal = arr[i + 1];
            } else {
                arr[i + 1] = arr[i];
            }
        }

        /*

        int smallest = arr[0];
        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;

        * */

        return minVal;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        int[] sampleArray = {10, 20, 30, 5, 15};
        int[] sampleArray2 = {10};
        System.out.println(smallestElement(sampleArray2));
    }
}
