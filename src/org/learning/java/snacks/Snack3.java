package org.learning.java.snacks;

import java.util.Arrays;

public class Snack3 {
    public static void main(String[] args) {

        int dimArray = 10;
        int sum = 0;
        int[] array = new int[dimArray];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 25) + 1;

            if (i % 2 == 0){
                sum += array[i];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("la somma degli elementi in posizione dispari è: " + sum);

    }
}
