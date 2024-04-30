package org.example.easy.A001A046;

public class A014SeparateEvenOdd {
    public static int[] separateEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }

            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }

            if (left < right) {
                swap(left, right, arr);
                /*
                left++;
                right--;
                */
            }
        }

        return arr;
    }

    private static void swap(int left, int right, int[] arr) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
