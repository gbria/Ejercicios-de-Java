package iterativeExercices;

import java.util.Scanner;

/**
 * Escriu un programa que llegeixi 10 números i només sumi aquells que són parells.
 */
public class Exercici4 {
    public static void main(String[] args) {
        final int MAX = 10;
        int num, total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 números");

        for (int i = 1; i <= MAX; i++) {
            System.out.print("Introduzca número " + i + ": ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                total += num;
            }
        }

        System.out.println("La suma total es de: " + total);
    }

}
