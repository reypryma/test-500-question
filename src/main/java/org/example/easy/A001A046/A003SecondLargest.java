package org.example.easy.A001A046;

public class A003SecondLargest {
    public static int secondLargest(int[] arr) {
        // Initialize firstLargest and secondLargest
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        // Traverse through the array
        try {
            for (int j : arr) {
                if (j > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = j;
                } else if (j < firstLargest & j > secondLargest) {
                    secondLargest = j;
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Input array should have at least two elements");
        }

        // Update firstLargest and secondLargest
        return secondLargest;
        // Return secondLargest
    }
}
