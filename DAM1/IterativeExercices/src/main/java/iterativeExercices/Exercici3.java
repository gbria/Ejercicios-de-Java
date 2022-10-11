package iterativeExercices;

import java.util.Scanner;

/**
 * Escriu un programa que vagi calculant una suma. L'usuari anirà introduint valors, 1 a 1. Si el valor
 * és positiu, es sumarà al resultat anterior. Si el valor es negatiu, el programa acabarà tot mostrant per
 * pantalla el resultat final de la suma de tots els valors positius introduïts.
 */
public class Exercici3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, total=0;

        do {
            System.out.print("Introduzca un numero: ");
            num = sc.nextInt();
            total += num;
        } while (num > 0);

        System.out.println("total: " + (total + Math.abs(num)));

    }
}
