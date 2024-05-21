package org.example.easy.A051MathOperation;

public class ExerciseA051 {
    public static double power(double base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("Base is 0 and exponent is negative, resulting in an undefined value.");
        }
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        System.out.println(power(0, -1));
    }
}
