package org.learning.java.snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String parola;

        int sumC = 0; //somma caratteri
        int sumN = 0; //somma numeri
        int sumS = 0; //somma caratteri speciali

        do {

            System.out.print("inserisci una parola: ");
            parola = scan.nextLine();


            for (int i = 0; i < parola.length(); i++) {
                if (parola.charAt(i) >= 'a' &&  parola.charAt(i) <= 'z'){
                    sumC++;
                } else if (parola.charAt(i) >= '0' &&  parola.charAt(i) <= '9'){
                    sumN++;
                } else {
                    sumS++;
                }
            }

            System.out.println("Numero di caratteri: " + sumC);
            System.out.println("Numero di Numeri: " + sumN);
            System.out.println("Numero di caratteri speciali: " + sumS);

        } while (!parola.equals("0"));

    }

}
