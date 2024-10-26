package org.example.easy.A079EvenNumbersFromArray;

import java.util.Arrays;

public class A079 {
    public static int[] extractEvenNumbers(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }

        // Your code here
        int evenArrSize = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArrSize++;
            }
        }

        int[] evenArr = new int[evenArrSize];
        int index = 0;
/*        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[index++] = num;
            }
        }*/

        //[2, 4, 8, 6]
        //[0, -2, 2]
        //[]
        //[0, 0]


        for (int num : arr) {
            if (num % 2 == 0) {
              evenArr[index] = num;
              index++;
            }
        }
        /*
            [2, 4, 8, 6]
            [0, -2, 2]
            []
            [0, 0]
        * */


        return evenArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(extractEvenNumbers(new int[]{3, 2, 4, 1, 5, 8, 6, 7}))); // -> [2, 4, 8, 6]
        System.out.println(Arrays.toString(extractEvenNumbers(new int[]{0, -2, 2, 3}))); // -> [0, -2, 2]
        System.out.println(Arrays.toString(extractEvenNumbers(new int[]{3, 5, 7, 9, 11}))); // -> []
        System.out.println(Arrays.toString(extractEvenNumbers(new int[]{0, 0}))); // -> [0, 0]
    }
}
