package iterativeExercices;

import java.util.Scanner;

/**
 * Escriu un programa que demani a l'usuari quants nombres (n) vol mostrar per pantalla. Un cop introduït
 * aquest valor, el programa mostrarà els n primers nombres parells.
 */
public class Exercici2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca cantidad de numero a mostrar: ");
        int num = sc.nextInt();

        for (int i = 0; i < num * 2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
