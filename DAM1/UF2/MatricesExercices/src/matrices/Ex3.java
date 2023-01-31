package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Creeu un programa que “buidi” una matriu (la posi tota a 0). Instruccions que cal seguir:
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz;
        int row, col, max;

        //Pedimos filas y columnas
        System.out.print("Introduzca el número de filas: ");
        row = sc.nextInt();

        System.out.print("Introduzca el número de columnas: ");
        col = sc.nextInt();

        //Generamos matriz
        matriz = new int[row][col];

        //Número máximo que debe contener la matrix con control para que sea mayor o igual a 0
        do {
            System.out.print("Introduzca el número máximos para rellenar la matriz: ");
            max = sc.nextInt();
        } while (max < 0);
        //System.out.println("max: " + max);

        //Método que rellena matriz
        rellenarMatriz(matriz, max);

        //Función que muestra la matriz
        System.out.println(matrizToString(matriz));

        int count = 0;
        while (matrizIsCero(matriz) == false) {
            decrementoMatriz(matriz);
            System.out.println(matrizToString(matriz));
            count++;
        }
        System.out.println("Número de veces: " + count);


    }

    private static boolean matrizIsCero(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void decrementoMatriz(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                //Si la celda vecina está dentro del límite de la matriz[fila][columna]
                //Y el valor de la celda es mayor a 0
                //Reduce un punto el valor de la celda
                if (x - 1 >= 0 && y - 1 >= 0 && matriz[x - 1][y - 1] > 0) {
                    matriz[x - 1][y - 1]--;
                }

                //Si la celda vecina está dentro del límite de la matriz[fila]
                //Y el valor de la celda es mayor a 0
                //Reduce un punto el valor de la celda
                if (x - 1 >= 0 && matriz[x - 1][y] > 0) {
                    matriz[x - 1][y]--;
                }
                //Etc.
                if (y + 1 <= matriz[x].length - 1 && matriz[x][y + 1] > 0) {
                    matriz[x][y + 1]--;
                }
                if (y - 1 >= 0 && matriz[x][y - 1] > 0) {
                    matriz[x][y - 1]--;
                }
                if (x - 1 >= 0 && y + 1 <= matriz[x].length - 1 && matriz[x - 1][y + 1] > 0) {
                    matriz[x - 1][y + 1]--;
                }
                if (x + 1 <= matriz.length - 1 && y - 1 >= 0 && matriz[x + 1][y - 1] > 0) {
                    matriz[x + 1][y - 1]--;
                }
                if (x + 1 <= matriz.length - 1 && matriz[x + 1][y] > 0) {
                    matriz[x + 1][y]--;
                }
                if (x + 1 <= matriz.length - 1 && y + 1 <= matriz[x].length - 1 && matriz[x + 1][y + 1] > 0) {
                    matriz[x + 1][y + 1]--;
                }

            }
        }
    }


    private static void rellenarMatriz(int[][] matriz, int max) {
        //Método que rellena la matriz con números random
        Random rnd = new Random();
        boolean existCero = false;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                //Generemos números aleatorios
                matriz[x][y] = rnd.nextInt(0, max);

                //Si no encontramos ninguna celda con 0, volvemos a rellenar
                if (matriz[x][y] == 0) {
                    existCero = true;
                }
            }
        }

        //Si no hay una celda 0, ubicamos en una celda aleatoriamente un 0
        if (!existCero) {
            matriz[rnd.nextInt(0, matriz.length - 1)][rnd.nextInt(0, matriz[0].length - 1)] = 0;
        }

    }

    private static String matrizToString(int[][] matriz) {
        //Función que muestra la matriz
        String str = "";
        for (int x = 0; x < matriz.length; x++) {
            str += " | ";
            for (int y = 0; y < matriz[x].length; y++) {
                str += matriz[x][y] + " | ";
            }
            str += "\n";
        }
        return str;
    }
}
