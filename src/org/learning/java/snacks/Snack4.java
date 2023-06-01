package org.learning.java.snacks;

import java.util.Scanner;


public class Snack4 {


    //es : RADAR
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int c = 0;
        System.out.print("inserisci una parola!: ");
        String parola = scan.nextLine();

        int j = parola.length() - 1;
        for (int i = 0; i < parola.length(); i++) {
            if (parola.charAt(i) == parola.charAt(j)) {
                c++;
                j--;
            }
        }
        if (c == parola.length()) {
            System.out.println("parola palindroma");
        } else {
            System.out.println("parola non palindroma");
        }


    }

}
