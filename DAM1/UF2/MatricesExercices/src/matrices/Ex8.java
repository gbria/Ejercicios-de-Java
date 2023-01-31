package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Creeu un programa que generi una matriu de dimensions 3x3 amb valors enters aleatoris i cerqueu aquella
 * fila, columna o diagonal els valors de la qual sumin un determinat nombre.
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int num;

        //Generar número aleatorios
        rellenarMatriz(matriz);

        //Mostrar por pantalla
        System.out.println(matrizToString(matriz));

        //Pedimos un número al usuario
        do {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("El número debe ser mayor a 0");
            }

        } while (num <= 0);

        //Controlamos la suma para ver si coincide el número y devolvemos un array en una función
        String patron[];
        patron = devolverResultadoSuma(matriz, num);

        System.out.println(patron);


        //Mostramos resultado por pantalla
        //mostrarResultado()


    }

    private static String[] devolverResultadoSuma(int[][] matriz, int num) {
        int fila0 = 0, fila1 = 0, fila2 = 0;
        int col0 = 0, col1 = 0, col2 = 0;
        int corner0 = 0, corner1 = 0;
        String patron[] = new String[2];
        String str = "";

        //Sumamos la primera fila
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {

                //Controlamos fila 0
                if (x == 0 && y <= matriz[x].length - 1) fila0 += matriz[x][y];

                //Controlamos fila 1
                if (x == 1 && y <= matriz[x].length - 1) fila1 += matriz[x][y];

                //Controlamos fila 2
                if (x == 2 && y <= matriz[x].length - 1) fila2 += matriz[x][y];

                //Controlamos columna 0
                if (y == 0 && x <= matriz.length - 1) col0 += matriz[x][y];

                //Controlamos columna 1
                if (y == 1 && x <= matriz.length - 1) col1 += matriz[x][y];

                //Controlamos columna 2
                if (y == 2 && x <= matriz.length - 1) col2 += matriz[x][y];

                //Controlamos diagonal principal
                if (x == y)
                    corner0 += matriz[x][y];

                //Controlamos diagonal secundaria
                if (x + y == 2) corner1 += matriz[x][y];

            }
        }

        //Chivato
        /*System.out.println("fila 0: " + fila0);
        System.out.println("fila 1: " + fila1);
        System.out.println("fila 2: " + fila2);
        System.out.println("columna 0: " + col0);
        System.out.println("columna 1: " + col1);
        System.out.println("columna 2: " + col2);
        System.out.println("diagonal 0: " + corner0);
        System.out.println("diagonal 1: " + corner1);*/


        if (num == fila0) {
            patron[0] = "0";
            patron[1] = "0";
            return patron;
        } else if (num == fila1) {
            patron[0] = "0";
            patron[1] = "1";
            return patron;
        } else if (num == fila2) {
            patron[0] = "0";
            patron[1] = "2";
            return patron;
        } else if (num == col0) {
            patron[0] = "1";
            patron[1] = "0";
            return patron;
        } else if (num == col1) {
            patron[0] = "1";
            patron[1] = "1";
            return patron;
        } else if (num == col2) {
            patron[0] = "1";
            patron[1] = "2";
            return patron;
        } else if (num == corner0) {
            patron[0] = "2";
            patron[1] = "0";
            return patron;
        } else if (num == corner1) {
            patron[0] = "2";
            patron[1] = "1";
            return patron;
        }
        patron[0] = "-1";
        patron[1] = "x";
        return patron;

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

    private static void rellenarMatriz(int[][] matriz) {
        Random rnd = new Random();

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = rnd.nextInt(1, 15 + 1);
            }
        }

    }
}
