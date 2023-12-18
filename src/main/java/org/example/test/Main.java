package org.example.test;

import org.example.easy.A014SeparateEvenOdd;

import java.util.Arrays;

public class Main {
    public static int[] separateEvenOdd(int[] arr){
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer until an odd number is found
            while (arr[left] % 2 == 0 && left < right)
                left++;

            // Move right pointer until an even number is found
            while (arr[right] % 2 == 1 && left < right)
                right--;

            if (left < right) {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
/*                left++;
                right--;*/
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] result1 = separateEvenOdd(new int[]{1, 4, 3, 2});
        System.out.println(Arrays.toString(result1)); // Output: [2, 4, 3, 1]

        int[] result2 = separateEvenOdd(new int[]{1, 3, 4, 8, 10, 12, 5, 7, 4, 9, 11, 1, 2});
        System.out.println(Arrays.toString(result2)); // Output: [1, 3, 5, 7]

        int[] result3 = separateEvenOdd(new int[]{2, 7, 4, 1, 8, 5, 6, 3});
        System.out.println(Arrays.toString(result3)); // Output: [2, 4, 6, 8]

        int[] result4 = separateEvenOdd(new int[]{});
        System.out.println(Arrays.toString(result4)); // Output: []

//        Test mine
        int[] result5 = A014SeparateEvenOdd.separateEvenOdd(new int[]{1, 4, 3, 2});
        System.out.println(Arrays.toString(result5)); // Output: [2, 4, 3, 1]

        int[] result6 = A014SeparateEvenOdd.separateEvenOdd(new int[]{1, 3, 4, 8, 10, 12, 5, 7, 4, 9, 11, 1, 2});
        System.out.println(Arrays.toString(result6)); // Output: [1, 3, 5, 7]

        int[] result7 = A014SeparateEvenOdd.separateEvenOdd(new int[]{2, 7, 4, 1, 8, 5, 6, 3});
        System.out.println(Arrays.toString(result7)); // Output: [2, 4, 6, 8]

        int[] result8 = A014SeparateEvenOdd.separateEvenOdd(new int[]{});
        System.out.println(Arrays.toString(result8)); // Output: []
    }
}
