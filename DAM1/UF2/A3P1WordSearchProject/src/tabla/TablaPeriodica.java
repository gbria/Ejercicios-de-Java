package tabla;

import java.util.Scanner;

/**
 * Rellenar tabla periodica dentro de sus insert
 */
public class TablaPeriodica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variable para las opciones del menu

        boolean exit = false;
        String palabra;

        // Pedimos medidas de la matriz
        System.out.print("Introduzca las filas: ");
        int row = sc.nextInt();

        System.out.print("Introduzca las columnas: ");
        int col = sc.nextInt();

        // Limpiamos
        sc.nextLine();

        // Creamos la matriz
        String tablaPeriodica[][] = new String[row][col];

        // Variables para guardar toda la sopa en un array
        // Prepararemos el texto introducido para que esté en mayúsculas y separado por un espacio

        // Control de la línea donde nos encontraremos
        int line = 0;

        // Variable que guardará todas las letras
        String textoTotal = "";

        // Pedimos contenido
        System.out.println("Introduzca las letras de cada celda (separadas por espacio o saltos de linea): ");

        // Bucle para introducir todas las líneas en una variable
        while (line < row) {

            //Escaneamos línea
            String sopa = sc.nextLine().toUpperCase();

            //Guardamos línea
            textoTotal += sopa + " ";

            //Aumentamos línea
            line++;
        }

        // Método para rellenar la matriz con las letras
        rellenarMatriz(tablaPeriodica, textoTotal);

        // Función que mostrará la matriz con las letras
        System.out.println(mostrarMatriz(tablaPeriodica));
    }

    private static void rellenarMatriz(String[][] matriz, String textTotal) {
        //Introducimos todas las letras en un array
        String letras[] = textTotal.split("[\t ]");

        //Introducimos el array dentro de la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = letras[x * matriz[x].length + y];
            }
        }
    }

    private static String mostrarMatriz(String[][] matriz) {
        //Variable para mostrar la matriz
        String str = "";


        for (int x = 0; x < matriz.length; x++) {
            str += ("INSERT INTO Elemento \n");
            str += ("VALUES(");
            str += "'" + (x + 1) + "'" + ",";
            for (int y = 0; y < matriz[x].length; y++) {
                if (y < 1) {
                    str += "'" + (matriz[x][y] + "'" + ",");
                } else {
                    str += "'" + (matriz[x][y]) + "'";
                }
            }
            str += ")\n";
        }

        return str;
    }
}
