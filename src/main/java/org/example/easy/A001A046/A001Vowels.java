package org.example.easy.A001A046;

public class A001Vowels {
    public static int countVowels(String str) {
        // Initialize the counter to 0
        // your code here
        int count = 0;
        String[] vowel = {"a", "e", "i", "o", "u"};

        // Iterate through each character of the string
        // your code here
        for (String a : str.split("")) {
            for (String v : vowel
            ) {
                if (a.equals(v)) {
                    count++;
                }
            }
        }

        // If the character is a vowel, increment the counter
        // your code here

        // Return the counter
        // your code here
        return count;
    }

    public static int countVowelsSolution(String str){
        int count = 0;
        String vowels = "aeiouAEIOU";

        for(int i = 0; i < str.length(); i++){
            if(vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}