package org.example.easy.A049_countnumberdigits;

public class ExerciseA049 {
    public static int countNumberOfDigits(int num){
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while(num != 0) {
            num /= 10;
            ++count;
        }
        return count;
    }
}
