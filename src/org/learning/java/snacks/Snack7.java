package org.learning.java.snacks;

import java.util.Scanner;

public class Snack7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("inserisci il numero di secondi che vuoi convertire: ");
        int secondiI = scan.nextInt();
        double ore = 0;
        double min = 0;
        double sec = 0;

        ore = secondiI / 3600;
        min = (secondiI % 3600) / 60;
        sec = secondiI % 60;


        String formatoOre = String.format("%02.0f", ore);
        String formatoMinuti = String.format("%02.0f", min);
        String formatoSecondi = String.format("%02.0f", sec);

        String risultato = formatoOre + ":" + formatoMinuti + ":" + formatoSecondi;

        System.out.println(risultato);


    }
}
