package basic.exercices;

import java.util.Scanner;

/**
 * Escriu un programa que demani tres nombres enters a l'usuari i mostri per pantalla la seva mitjana.
 */
public class Exercici8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Media de tres números");

        System.out.println("Introduzca primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Introduzca segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Introduzca tercero número: ");
        int num3 = sc.nextInt();

        System.out.println("La media resultante es: " + ((num1 + num2 + num3) / 3));

    }
}
