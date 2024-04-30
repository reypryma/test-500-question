package org.example.easy.A001A046;

public class A017ExponentRecursive {
    public static double power(double x, int n) {
        // Check for base cases
        if (n == 0) {
            return 1;
        }

        if (n > 0) {
            return x * power(x, n - 1);
        }

        // Handle negative exponent
        return 1.0 / x * power(x, n + 1);  // Fix
    }
}
