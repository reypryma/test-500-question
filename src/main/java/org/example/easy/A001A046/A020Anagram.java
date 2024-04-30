package org.example.easy.A001A046;

import java.util.Arrays;

public class A020Anagram {
    public static boolean areAnagrams(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false; // Anagrams must have the same length
        }

        int textLength = str1.length() - 1;

        // Remove all white spaces, convert strings to lower case, and then to char array
        char[] s1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] s2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        for (int i = 0; i < textLength ; i++) {
            /*if(i==0){
                continue;
            }*/


            swap(s1);
            swap(s2);

        }



        for (int i = 0; i < textLength ; i++) {
            if(s1[i] != s2[i]){
                return false;
            }
        }
        return true;
    }

    public static void swap(char[] chars) {
        for(int j=0; j < chars.length - 1; j++){
            if(chars[j]>chars[j+1] && j < chars.length - 1){
                char temp = chars[j];
                chars[j] = chars[j+1];
                chars[j+1] = temp;
            }
        }
    }
}
