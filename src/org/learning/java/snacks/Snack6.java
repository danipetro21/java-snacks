package org.learning.java.snacks;

import java.util.Arrays;

public class Snack6 {

    public static void main(String[] args) {
        String numero = "2105";
        int[] num = new int[4];
        int numFinal = 0;
        for (int i = 0; i < numero.length(); i++) {
            num[i] = (numero.charAt(i) * 1) - 48;
            numFinal = numFinal * 10 + num[i];

        }

        System.out.println(numFinal);
    }

}
