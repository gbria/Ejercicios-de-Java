package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Creeu un programa que emmagatzemi la freqüència amb què surten cadascun dels nombres d’un dau.
 * Instruccions que cal seguir:
 */

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int rndDados;

        //Establecemos la medida de la matriz
        int[][] tabla = new int[6][2];

        //Método que inicializa la matriz
        Ex2.inicializarTabla(tabla);

        //Preguntamos el número de tiradas
        System.out.print("Cuantas veces tiramos los dados? ");
        int numLanzamientos = sc.nextInt();

        //Generamos los lanzamientos con el dado
        for (int i = 0; i < numLanzamientos; i++) {
            //Random: "bound excluye el número"
            rndDados = rnd.nextInt(1, 7);

            //Mostramos tiradas
            System.out.println("Tirada nº" + (i + 1) + ": " + rndDados);

            //Contamos tiradas
            //Ex2.contarTiradas(tabla, rndDados);
            tabla[rndDados - 1][1]++;

        }

        System.out.println(tablaToString(tabla));
    }

    static void inicializarTabla(int[][] tabla) {
        for (int x = 0; x < tabla.length; x++) {

            //La primera columna irá rellenando el número del dado
            //System.out.print(tabla[x][0] = x + 1); --> Chivato
            tabla[x][0] = x + 1;

            //La segunda columna se inicializará a 0
            //System.out.print(tabla[x][1] = 0); --> Chivato
            tabla[x][1] = 0;

            //System.out.println();
        }
    }

    static void contarTiradas(int[][] tabla, int rndDados) {
        //Aumenta un número en su respectiva celda de la 1 columna cada vez que se cumple la condición
        //Número 1
        if (rndDados == 1) tabla[0][1]++;
            //Número 2
        else if (rndDados == 2) tabla[1][1]++;
            //Número 3, etc.
        else if (rndDados == 3) tabla[2][1]++;
        else if (rndDados == 4) tabla[3][1]++;
        else if (rndDados == 5) tabla[4][1]++;
        else tabla[5][1]++;
    }

    static String tablaToString(int[][] tabla) {
        String str = "";
        for (int x = 0; x < tabla.length; x++) {
            str += "|";
            for (int y = 0; y < tabla[x].length; y++) {
                //Porque esta condicion???
                if (tabla[x][y] < 10) {
                    str += " " + tabla[x][y] + "|";
                } else str += " " + tabla[x][y] + " |";
            }
            str += "\n";
        }
        return str;
    }

}

