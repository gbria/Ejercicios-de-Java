package basic.exercices;

import java.util.Scanner;

/**
 * Escriu un programa que demani a l'usuari dos nombres enters, els divideixi i en mostri el resultat per
 * pantalla. També caldrà que mostri per pantalla residu de la divisió (mòdul).
 *
 */
public class Exercici4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Operaciones con divisiones");
        System.out.print("Introduzca el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println();
        System.out.println("Resultado de la división: " + num1 + " / " + num2 + " = " + num1 / num2);
        System.out.println("Resultado del residuo: " + num1 + " % " + num2 + " = " + num1 % num2);

        /* (a) Què passa amb el resultat d'aquesta divisió?
        *
        *       - Si multiplico el cociente por el divisor dará como
        *         resultado el dividendo siempre y cuando el residuo sea 0
        * */

    }
}
