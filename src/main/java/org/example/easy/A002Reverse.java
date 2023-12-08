package org.example.easy;

public class A002Reverse {
    public static String reverseString(String str){
        // Use the StringBuilder's reverse method to reverse str
        // your code here

//        String[] strArr = str.split("");
        char[] strArr = str.toCharArray();
        StringBuilder reverse= new StringBuilder();

        for(int i=strArr.length-1; i>=0; i--){
            reverse.append(strArr[i]);
        }
        return reverse.toString();
    }

    public static String reverseStringSolution(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
