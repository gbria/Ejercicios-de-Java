package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Creeu un programa que transformi una matriu en un array
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;

        System.out.print("Introduzca número de filas: ");
        rows = sc.nextInt();

        System.out.print("Introduzca número de columnas: ");
        cols = sc.nextInt();

        //Creamos la matriz e indicamos su capacidad
        int matriz[][] = new int[rows][cols];

        //Método para rellenar la matriz de números aleatorios
        matrizInicializada(matriz);

        //Mostramos matriz por pantalla
        System.out.println(matrizToString(matriz));

        //transformamos la matriz en un array
        int vector[] = matrizEnArray(matriz, rows, cols);

        //Mostramos por pantalla el vector
        System.out.println(arrayToString(vector));

        //Mostramos por pantalla el vector en forma de matriz
        System.out.println(arrayToStringComoMatriz(vector, cols));


    }

    private static String arrayToStringComoMatriz(int[] vector, int cols) {
        String str = "";
        int posCol = 0;

        System.out.println("Visualización del vector en forma de matriz");
        for (int i = 0; i < vector.length; i++) {
            str += "| " + vector[i];
            //Aumentamos la variable posCol para ubicarnos
            posCol++;

            //Si posCol está al final de la fila, hacemos un salto de línea
            //Y reiniciamos posCol para la siguiente línea
            if (cols == posCol) {
                str += " |\n";
                posCol = 0;
            }
        }
        return str;
    }

    private static String arrayToString(int[] vector) {
        String str = "";
        str += "Visualización del vector \n";
        for (int i = 0; i < vector.length; i++) {
            str += vector[i] + " ";
        }
        str += "\n";
        return str;
    }

    private static int[] matrizEnArray(int[][] matriz, int rows, int cols) {
        int capacidadArray = (rows * cols), posArray;
        int array[] = new int[capacidadArray];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {

                //Posicion del array = (fila * numero de columnas + columna)
                posArray = (x * matriz[x].length + y);
                array[posArray] = matriz[x][y];
            }
        }
        return array;
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

    private static void matrizInicializada(int[][] matriz) {
        //Creamos variable random
        Random rnd = new Random();

        //Rellenamos matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = rnd.nextInt(1, 100 + 1);
            }
        }

    }
}
