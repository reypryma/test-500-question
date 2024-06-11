package org.example.easy.A064GCP;

public class ExerciseA064 {
    public static int gcd(int a, int b) {
        // Your code here
        if (b == 0) {
            return a;
        }

        return gcd(b, a%b);
    }
    static int gcdLinear(int a, int b)
    {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        System.out.println(gcd(98, 56));
        // Iter 1 gcd(56, 42)
        // Iter 2 gcd(42, 14)
        // Iter 3 gcd(14, 0)

        System.out.println(gcd(15, 5));
        System.out.println(gcdLinear(15, 5));
        System.out.println(gcd(17, 19));
        System.out.println(gcdLinear(17, 19));
    }
}
