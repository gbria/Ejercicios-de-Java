package basic.exercices;

import java.util.Scanner;

/**
 * Escriu un programa que demani dos nombres enters a l'usuari i en mostri per pantalla la seva suma,
 * resta, multiplicació, divisió i residu.
 */
public class Exercici7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diferentes operaciones matemáticas");

        System.out.print("Introduzca el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println();
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplicación: " + num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println("División: " + num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("Residuo: " + num1 + " mod " + num2 + " = " + (num1 % num2));
    }
}
