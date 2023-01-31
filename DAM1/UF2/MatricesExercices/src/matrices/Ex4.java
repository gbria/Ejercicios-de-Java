package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Creeu un programa que generi una matriu de dimensions 10x4 amb valors enters aleatoris i hi cerqui un
 * número. Instruccions que cal seguir:
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Generamos matriz y le indicamos su capacidad
        int matriz[][] = new int[9][3];

        //Inicializamos la matriz
        inicializarMatriz(matriz);

        //Mostramos la matriz por pantalla
        System.out.println(matrizToString(matriz));

        //Pedimos al usuario que número desea buscar
        System.out.print("Introduzca número a buscar: ");
        int num = sc.nextInt();

        //Función para buscar el número
        buscarNumero(matriz, num);


    }

    private static void buscarNumero(int[][] matriz, int num) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] == num) {
                    System.out.println("El número " + num + " se ha encontrado");
                    System.out.println("Su posición es: [" + x + "][" + y + "]");

                }
            }
        }

    }

    public static void inicializarMatriz(int[][] matriz) {
        //Creamos variable random
        Random rnd = new Random();

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = rnd.nextInt(-100, 100 + 1);
            }
        }
    }

    private static String matrizToString(int[][] matriz) {
        String str = "";

        for (int x = 0; x < matriz.length; x++) {
            str += "|";
            for (int y = 0; y < matriz[x].length; y++) {
                str += " " + matriz[x][y] + "  |  ";
            }
            str += "\n";
        }

        return str;
    }

}
