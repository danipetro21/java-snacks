package org.learning.java.snacks;

import java.util.Arrays;
import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("quante cifre vuoi inserire?: ");
        int n = scan.nextInt();

        boolean valid = false;
        int num = 0;
        int molt = 1;
        int sum = 0;
        //int[] rest = new int[n];

        do {
            System.out.println("inserisci un numero di " + n + " cifre");
            num = scan.nextInt();

            if (num > 0) {
                valid = true;
            }

        } while (!valid);

        for (int i = 0; i < n; i++) {
            sum += (num / molt) % 10 ;
            molt *= 10;
        }

        System.out.println("La somma di ogni cifra è: " + sum);

    }

}