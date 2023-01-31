package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Creeu un programa que sumi dues matrius seguint les instruccions següents:
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows, cols;

        System.out.print("Introduzca el número de filas: ");
        rows = sc.nextInt();

        System.out.print("Introduzca el número de columnas: ");
        cols = sc.nextInt();

        //Función para crear matrices
        int matriz1[][] = inicializarMatriz(rows, cols);
        int matriz2[][] = inicializarMatriz(rows, cols);


        //Funcion para mostrar matrices
        System.out.println("Matriz 1");
        System.out.println(matrizToString(matriz1));

        System.out.println("Matriz 2");
        System.out.println(matrizToString(matriz2));

        //Método que suma las dos matrices
        int matrizTotal[][] = sumarMatrices(matriz1, matriz2, rows, cols);

        //Funcion para mostrar matrices
        System.out.println("Matriz total");
        System.out.println(matrizToString(matrizTotal));

    }

    private static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2, int rows, int cols) {
        int matrizTotal[][] = new int[rows][cols];

        for (int x = 0; x < matrizTotal.length; x++) {
            for (int y = 0; y < matrizTotal[x].length; y++) {
                matrizTotal[x][y] = matriz1[x][y] + matriz2[x][y];
            }
        }
        return matrizTotal;
    }

    private static int[][] inicializarMatriz(int rows, int cols) {
        Random rnd = new Random();
        int matriz[][] = new int[rows][cols];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = rnd.nextInt(0, 20 + 1);
            }
        }
        return matriz;
    }

    private static String matrizToString(int[][] matriz) {
        String str = "";
        for (int x = 0; x < matriz.length; x++) {
            str += "| ";
            for (int y = 0; y < matriz[x].length; y++) {
                str += matriz[x][y] + " | ";
            }
            str += "\n";
        }
        return str;
    }


}
