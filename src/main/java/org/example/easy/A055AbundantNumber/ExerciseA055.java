package org.example.easy.A055AbundantNumber;

public class ExerciseA055 {
    public static boolean isAbundant(int num) {
        if(num < 1){
            throw new IllegalArgumentException("No negative number and zero allowed");
        }

        int sum = 1; // 1 is always a divisor for any number.

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                sum += i;
                if (i != num / i){
                    sum += num / i;
                }
            }
        }

        return (num < sum);
    }

    public static void main(String[] args) {
        System.out.println(isAbundant(12));
        System.out.println(isAbundant(15));
    }
}
