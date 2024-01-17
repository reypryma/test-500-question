package org.example.reflect.fun;

import java.util.Random;

public class A001ShuffleArray {
    public static void generateRandomArray() {
        String[] paragraphs = {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
        };

        //do set the length first
        int current = paragraphs.length - 1;
        Random random = new Random();

        while(current>0){
            int chooseRandomArray = random.nextInt(current);
            String getValueofRandomArrayAsTemp = paragraphs[chooseRandomArray];

            //do swap the value of array
            String temp = paragraphs[current];
            paragraphs[current] = getValueofRandomArrayAsTemp;
            paragraphs[chooseRandomArray] = temp;

            current--;
        }

        for (String p: paragraphs){
            System.out.println("generate paragrahps: " + p);
        }
    }

    public static void main(String[] args) {
        generateRandomArray();
    }
}
