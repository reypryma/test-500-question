package org.example.easy.A048_mutliple8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ExerciseA048 {
    public static int[] filterMultiplesOfEight(int[] arr){
        return java.util.Arrays.stream(arr)
                .filter(num -> num % 8 != 0)
                .toArray();
    }
}
