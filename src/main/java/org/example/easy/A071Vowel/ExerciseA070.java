package org.example.easy.A071Vowel;

public class ExerciseA070 {
    public static int countVowels(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String is null");
        }

        int count = 0;
        String vowels = "AEIOUaeiou";

        for (char c : s.toCharArray()) {
            //indexof check if in array have the value exist at certain index
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static int countVowels2(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String is null");
        }

        int count = 0;

        String[] vowels = {"a", "i", "u", "e", "o"};

        for (String charS : s.split("")) {
            for (String v: vowels) {
                if(charS.toLowerCase().equals(v)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String sampleString = "Hello, World!";
        System.out.println(countVowels(sampleString));
        System.out.println(countVowels2(sampleString));
    }
}
