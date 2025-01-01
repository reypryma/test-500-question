package org.example.easy.A097AnagramNum;

import java.util.HashMap;

public class A093Exercise {
    public static int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            map.put(B[i], i);
        }

        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = map.get(A[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        int[] result = anagramMappings(A, B);
        for (int i : result) {
            System.out.print(i + " ");
        }
        // 1 4 3 2 0
    }
}
