package org.example;

import static org.example.easy.A003SecondLargest.secondLargest;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int x = secondLargest(new int[]{5, 5, 5, 4, 4}); // Output: 4
        int y = secondLargest(new int[]{1, 2, 5, 4, 3}); // Output: 4

        System.out.println(x);
        System.out.println(y);
    }
}