package org.example.easy.A084MissingRanges;

import java.util.ArrayList;
import java.util.List;

public class A084RangeArrays {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        // Your code here
        List<String> result = new ArrayList<>();
        long next = lower;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < next) continue;
            if (nums[i] == next) {
                next++;
                continue;
            }
            result.add(getRange(next, nums[i] - 1));
            next = (long) nums[i] + 1;
        }

        if (next <= upper) {
            result.add(getRange(next, upper));
        }

        return result;
    }

    private static String getRange(long n1, long n2) {
        return n1 == n2 ? String.valueOf(n1) : n1 + "->" + n2;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        int[] sampleArray = {0, 1, 3, 50, 75};
        System.out.println(findMissingRanges(sampleArray, 0, 99));
    }
}
