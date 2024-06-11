package org.example.easy.ExerciseA065;

public class ExerciseA065 {
    public static int lcm(int a, int b) {
        // Your code here
        if(a == 0 || b == 0) return 0;
        return (a * b) / gcd(b,a);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(lcm(12, 15));
        System.out.println(lcm(6, 7));
        System.out.println(lcm(10, 10));
    }
}
