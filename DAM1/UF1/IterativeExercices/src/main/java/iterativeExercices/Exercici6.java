package iterativeExercices;

import java.util.Scanner;

/**
 * Escriu un programa que demani a l'usuari dos nombres enters (poden ser positius o negatius!). Fet això,
 * calculeu-ne la multiplicació com un conjunt de sumes i mostreu el resultat per pantalla.
 */
public class Exercici6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Multiplicar sumando");

        System.out.println("\nIntroduzca numero 1");
        System.out.print("Número: ");
        int num1 = sc.nextInt();

        System.out.println("Introduzca numero 2");
        System.out.print("Número: ");
        int num2 = sc.nextInt();

        for (int i = 1; i <= num2; i++) {
            suma += num1;
        }
        System.out.println("\nTotal de la suma: " + suma);

    }
}
