package org.example.easy.A050NumberTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseA050 {
    public static List<Integer> findFactors(int num) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(Math.abs(num)); i++) {
            if (num % i == 0) {
                factors.add(i);
                if (i != num / i) {
                    factors.add(Math.abs(num) / i);
                }
            }
        }
        Collections.sort(factors);
        return factors;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
    }
}
