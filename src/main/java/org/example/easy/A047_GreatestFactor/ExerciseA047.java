package org.example.easy.A047_GreatestFactor;

public class ExerciseA047 {
    public static int findGreatestFactor(int num){
        int greatestFactor = 1;

        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                greatestFactor = i;
            }
        }

        return greatestFactor;
    }
}
