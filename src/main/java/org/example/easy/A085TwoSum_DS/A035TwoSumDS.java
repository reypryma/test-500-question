package org.example.easy.A085TwoSum_DS;

import java.util.HashMap;
import java.util.Map;

public class A035TwoSumDS {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.add(1);
        twoSum.add(3);
        twoSum.add(5);
        twoSum.find(4);  // true
        twoSum.find(7);  // false

        System.out.println(twoSum.find(4));
        System.out.println(twoSum.find(7));

    }

}

class TwoSum {
    private final Map<Integer, Integer> numbers;
    public TwoSum() {
        // Initialization code here
        this.numbers = new HashMap<>();
    }

    public void add(int number) {
        // Your code here
        numbers.put(number, numbers.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        for (Integer num : numbers.keySet()) {
            int complement = value - num;
            if (complement == num) {
                if (numbers.get(num) > 1) {
                    return true;
                }
            } else if (numbers.containsKey(complement)) {
                return true;
            }
        }
        return false;
    }
}