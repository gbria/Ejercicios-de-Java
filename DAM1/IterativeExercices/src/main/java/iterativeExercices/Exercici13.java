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
        int opcion, colFinal, colIni;

        System.out.println("Menú figuras");
        System.out.println("1. Opción: Cuadrado");
        System.out.println("2. Opción: Triangulo");
        System.out.println("3. Opción: Triangulo Distorsionado");
        System.out.println("4. Opción: Pirámide");
        System.out.println("5. Opción: Pirámide numérica");
        System.out.println("6. Opción: Pirámide numérica mejorado");
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
                colFinal = 8;
                colIni = 8;
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
                colFinal = 4;
                colIni = 4;
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
                    colFinal++;
                    colIni--;
                    System.out.println();
                }
                break;

            case 5:
                colFinal = 4;
                colIni = 4;
                for (int f = 0; f < 5; f++) {
                    //System.out.print("Fila: " + f + " ");
                    for (int c = 0; c < 9; c++) {
                        if (c < colIni) {
                            System.out.print("  ");
                        } else if (c <= colFinal) {
                            System.out.print((f + 1) + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    colFinal++;
                    colIni--;
                    System.out.println();
                }
                break;

            case 6:
                colFinal = 4;
                colIni = 4;
                for (int f = 0; f < 5; f++) {
                    //System.out.print("Fila: " + f + " ");
                    for (int c = 0, tmpIni = 5, tmpFinal = -3; c < 9; c++, tmpIni--, tmpFinal++) {
                        if (c < colIni) {
                            System.out.print("  ");
                        } else if (c <= 4) {
                            System.out.print(tmpIni + " ");
                        } else if (c <= colFinal) {
                            System.out.print(tmpFinal + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    colFinal++;
                    colIni--;
                    System.out.println();
                }
                break;

            default:
                System.out.println("Error. La opción no existe");
                break;

        }
    }
}
