package org.example.easy.A078AVGDeriv;

public class A078Exercise {
    public static double findStandardDeviation(int[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("Dataset is either null or empty");
        }

        double mean = 0;
        for (int num : data) {
            mean += num;
        }
        mean /= data.length;

        double variance = 0;
        for (int num : data) {
            variance += Math.pow(num - mean, 2);
        }
        variance /= data.length;

        return Math.sqrt(variance);
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        int[] sampleData = {10, 20, 30, 40, 50};
        System.out.println(findStandardDeviation(sampleData));
    }
}
