package org.example.easy.A001A046;

public class A007ToggleCase {
    public static String toggleCase(String s){
        // Create a new StringBuilder
        // your code here
        StringBuilder stringBuilder = new StringBuilder();

        // Iterate through each character in the string
        // your code here
        for (char c: s.toCharArray()){
//            if(Character.isLowerCase(c)){
//                Character.isLowerCase(c);
//            }else {
//                Character.toLowerCase(c);
//            }
//            stringBuilder.append(c);

            if (Character.isLowerCase(c)) {
                stringBuilder.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            } else {
                // If the character is not a letter, append it as it is
                stringBuilder.append(c);
            }
        }
        // Return the string representation of toggledString
        // your code here
        return stringBuilder.toString();
    }
}
