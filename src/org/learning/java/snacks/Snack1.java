package org.learning.java.snacks;

import java.util.Scanner;

public class Snack1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numIn = 0;

        System.out.print("Inserisci in un numero: ");
        numIn = scan.nextInt();

        if (numIn % 2 == 0) {
            System.out.println("il numero è pari");
        }else{
            System.out.println(numIn+1);
        }
    }
}
