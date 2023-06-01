package org.learning.java.snacks;

public class Snack9 {

    public static void main(String[] args) {

        int sum = 0;
        double med = 0;

        int maxNum = 10;

        for (int i = 1; i <= maxNum; i++) {
            sum += i;
        }

        med = (double) sum / maxNum;

        System.out.println("la somma dei primi 10 numeri è: " + sum);
        System.out.println("La media dei numeri è: " + med);
    }
}
