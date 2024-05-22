package org.example.easy.A060ReverseNumber;

public class ExerciseA060 {
    public static int reverseNumber(int num) {
        if(num < 0){
            throw new IllegalArgumentException("no negative");
        }

        int reverse = 0;

        while(num > 0){
            reverse = reverse * 10 + (num % 10);
            num /= 10;
        }
        return reverse;

    }

    public static void main(String[] args) {
        int sampleNumber = 12345;
        System.out.println(reverseNumber(sampleNumber));
    }
}
