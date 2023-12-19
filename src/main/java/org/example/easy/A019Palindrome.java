package org.example.easy;

public class A019Palindrome {
    public static boolean sample(String str){

        /*
        * The time complexity of this solution is O(n), where n is the length of the string, because each character is checked once. The space complexity is O(1),
        * because the check is done in-place with a constant amount of space.
        *
        * */

        int start = 0, end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindrome(String str){

        // compare the characters from both ends of the string towards the middle
        // your code here
        int start = 0; int end = str.length() - 1;
        boolean isPolindrome = false;

        char[] strArr = str.toCharArray();
        while(start < end){
            if(strArr[start] == strArr[end]){
                start++;
                end--;
                isPolindrome = true;
            }else {
                isPolindrome = false;
                break;
            }
        }

        // return true if the string is a palindrome, false otherwise
        // your code here
        return isPolindrome;
    }
}
