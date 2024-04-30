package org.example.easy.A001A046;

public class A005MathSumDigit {
    public static int countDigits(int number){
        // calculate the count of digits in number
        // your code here
        if(number < 0){
            number = -number;
        }else if(number == 0){
            return 1;
        }


        // return the count of digits
        // your code here
        return (int)Math.floor(Math.log10(number) + 1);
    }
}
