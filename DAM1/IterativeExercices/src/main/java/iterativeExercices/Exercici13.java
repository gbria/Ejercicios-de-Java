package iterativeExercices;

import java.util.Formattable;
import java.util.Scanner;

/**
 * Escriu un programa que demani a l'usuari un valor de l'1 al 6 (en cas que introdueixi un valor
 * incorrecte, se l'avisarà i el programa acabarà).
 */

public class Exercici13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Introduzca una opción");
        System.out.println("1. Opción");
        System.out.println("2. Opción");
        System.out.println("3. Opción");
        System.out.println("4. Opción");
        System.out.println("5. Opción");
        System.out.println("6. Opción");
        System.out.print("Opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                for (int f = 0; f < 5; f++) {
                    //System.out.print("Fila: " + f + " ");
                    for (int c = 0; c < 9; c++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int f = 0; f < 5; f++) {
                    for (int c = -1; c < f; c++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                int colFinal = 8;
                int colIni = 8;
                for (int f = 0; f < 5; f++) {
                    //System.out.print("Fila: " + f + " ");
                    for (int c = 0; c < 9; c++) {
                        if (c < colIni) {
                            System.out.print("  ");
                        } else if (c <= colFinal) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    colFinal--;
                    colIni -= 2;
                    System.out.println();
                }
                break;

            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Error. La opción no existe");
                break;


        }


    }
}
