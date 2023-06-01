package org.learning.java.snacks;

public class Snack2 {

    public static void main(String[] args) {

        String[] nomi = new String[]{"Paolo", "Daniele", "Luca", "Lorenzo", "Matilde", "Sara", "Maddalena", "Alessandro", "Federico", "Simone"};
        String[] cognomi = new String[]{"Esposito", "Russo", "Bianchi", "Romano", "Moretti", "Ricci", "Marino", "De Santis", "Conti", "Gatti"};

        boolean valid = false;
        int c = 0;

        while (c != 10) {
            int i = (int) (Math.random() * 9) + 1;
            int j = (int) (Math.random() * 9) + 1;
            System.out.println(nomi[i] + " " + cognomi[j]);
            c++;
        }

    }

}
