package matrices;

import java.util.Scanner;

/**
 * Creeu un programa que crei una matriu d’String. Cada cel·la ha de contenir la posici´o (fila i columna) que
 * ocupa.
 */

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        //Pedimos los datos
        System.out.println("Introduzca el número de filas: ");
        row = sc.nextInt();

        System.out.println("Introduzca el número de columnas: ");
        col = sc.nextInt();

        //Llamamos al método
        generarMatriz(row, col);

    }

    private static void generarMatriz(int row, int col) {
        //Instanciamos matriz e introducimos capacidad
        String matrix[][] = new String[row][col];

        //Recorremos matriz, primero filas, luego columnas
        for (int x = 0; x < row; x++) {
            System.out.print("| ");
            for (int y = 0; y < col; y++) {

                //Pasamos los valores a String
                matrix[x][y] = String.valueOf("(" + x + ", " + y + ")");

                //Rellenamos celdas
                System.out.print(matrix[x][y]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
