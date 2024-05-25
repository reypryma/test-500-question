package org.example.easy.A063SelfDividing;

public class ExerciseA063 {
    public static boolean isSelfDividing(int number) {
        if (number == 0) {
            return false;
        }

        int checkNumber = number;
        while(number !=0){
            int digit = number % 10;
            number /=10;

            if(digit == 0 || checkNumber % digit != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        System.out.println(isSelfDividing(128));
        System.out.println(isSelfDividing(22));
        System.out.println(isSelfDividing(102));
        System.out.println(isSelfDividing(0));
    }
}
