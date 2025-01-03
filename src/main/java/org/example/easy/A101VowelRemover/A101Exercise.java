package org.example.easy.A101VowelRemover;

public class A101Exercise {
    public static String removeVowels(String s) {
        // Your code here
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()){
            if(!"AEIOUaeiou".contains(String.valueOf(c))){
                 sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeVowelsToArray(String s) {
        // Your code here
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()) {
            if("AEIOUaeiou".indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
