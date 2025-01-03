package org.example.easy.A098MaxButNotOnK;

public class A098Exercise {
    public static int twoSumLessThanK(int[] arr, int K) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int maxSum = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum < K && sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        System.out.println(twoSumLessThanK(new int[] {34, 23, 1, 24, 75, 33, 54, 8}, 60));
        System.out.println(twoSumLessThanK(new int[] {10, 20, 30}, 15));
        System.out.println(twoSumLessThanK(new int[] {10, 12, 15, 7, 5}, 23));
    }
}
