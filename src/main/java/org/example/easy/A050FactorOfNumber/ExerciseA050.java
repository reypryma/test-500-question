package org.example.easy.A050FactorOfNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseA050 {
    public static List<Integer> findFactors(int num) {
        if (num < 0) {
            return new ArrayList<>();
        }

        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(Math.abs(num)); i++) {
            if (num % i == 0) {
                factors.add(i);
                // check if i is not multiplied number of the num
                if (i != num / i) {
                    factors.add(Math.abs(num) / i);
                }
            }
        }

        Collections.sort(factors);
        return factors;
    }

    public static void main(String[] args) {
        // expected [1, 2, 4, 7, 14, 28]
        System.out.println(findFactors(28));
        // expected [1, 2, 3, 6]
        System.out.println(findFactors(6));
        // expected [1, 5]
        System.out.println(findFactors(5));
        // expected [1, 2, 4, 8, 16]
        System.out.println(findFactors(16));
    }
}
