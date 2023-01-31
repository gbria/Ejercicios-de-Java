package wordsearch;

import java.util.Scanner;

public class WordSearchMain {

    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Variable para las opciones del menu
        int opcion;
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
        String matriz[][] = new String[row][col];

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
        rellenarMatriz(matriz, textoTotal);

        // Función que mostrará la matriz con las letras
        System.out.println(mostrarMatriz(matriz));

        // El menú
        do {
            System.out.println("~~~~ Menú ~~~~");
            System.out.println("0. Salir");
            System.out.println("1. Buscar una palabra");
            System.out.print("Introduzca una opción: ");

            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    //Salimos del programa
                    System.out.println("Saliendo del programa");
                    exit = true;
                    break;

                case 1:
                    //Buscando la palabra
                    System.out.println("Introduzca la palabra a buscar");
                    palabra = sc.next().toUpperCase().trim();

                    //En busca de la palabra perdida
                    buscarPalabra(matriz, palabra);

                    break;
            }

        } while (exit == false);

    }

    private static void pintarMatriz(int iniRow, int iniCol, int endRow, int endCol, int code, String[] palabra, String[][] matriz) {
        int posLetra = 0;
        int swapRor = endRow;
        int swapCol = endCol;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == iniRow && j == iniCol && posLetra < palabra.length && code == 1) {
                    System.out.print(ANSI_GREEN_BACKGROUND + matriz[i][j] + ANSI_RESET + " ");
                    iniCol++;
                    posLetra++;
                } else if (i == iniRow && j == iniCol && posLetra < palabra.length && code == 4) {
                    System.out.print(ANSI_GREEN_BACKGROUND + matriz[i][j] + ANSI_RESET + " ");

                    //Esto no funciona
                    //Para hacerlo de este modo debería invertir la palabra
                    iniCol -= palabra.length - 1;

                    //Otra forma sería no recorrer la matriz con fors, ya que se mueve en la misma dirección...

                    iniCol++;
                    posLetra++;
                } else {
                    System.out.print(matriz[i][j] + " ");
                }

            }
            System.out.println();
        }

        System.out.println("code " + code);
    }

    private static boolean limitesMatriz(String[][] matriz, int row, int col) {
        /**
         * Miramos si estamos dentro de la matriz
         * - Límite máximo de la fila
         * - Límite máximo de la columna
         * - Límite mínimo de la fila
         * - Límite mínimo de la columna
         * */

        if (matriz.length - 1 >= row && matriz[0].length - 1 >= col && row >= 0 && col >= 0) {
            return true;
        }
        return false;
    }

    private static boolean recorrerVecinos(String[][] matriz, int rowIni, int colIni, int moveRow, int moveCol, String[] palabra) {
        //Esta función busca las celdas vecinas en una dirección cada vez
        //Las variables curRow, curCol, se inicializarán en la celda dónde encuentra la primera letra
        int curRow = rowIni;
        int curCol = colIni;

        //Creamos una variable que será la que recorrerá las posicion de la palabra
        int posLetra = 1;

        int code = 0;

        //Bucle para desplazarse e ir comprobando si las letras coinciden
        while (posLetra < palabra.length) {

            //Movimiento de la celda en la matriz
            curRow += moveRow;
            curCol += moveCol;

            //Si estamos fuera de la matriz: salimos de la función
            //Si la letra de la matriz no coincide con el valor de la letra de la palabra: salimos de la función
            if (limitesMatriz(matriz, curRow, curCol) == false || matriz[curRow][curCol].equals(palabra[posLetra]) == false) {
                return false;
            }

            //siguiente letra de la palabra
            posLetra++;
        }
        int rowEnd = curRow;
        int colEnd = curCol;

        //Chivato

        //patron= (patron[0] = rowIni + 1) + ", " + (patron[1] = colIni + 1) + ")" + "(" + (patron[2] = curRow + 1) + ", " + (patron[3] = curCol + 1) + ")");
        //int patron[][] = {{rowIni},{colIni},{curRow},{curCol}};

        //Esto controla las direcciones
        if (rowIni == rowEnd && colIni < colEnd) {
            code = 1;
            System.out.println("Horizontal-Derecha (" + rowIni + ", " + colIni + ")");

        } else if (rowIni > rowEnd && colIni == colEnd) {
            code = 2;
            System.out.println("Vertical-Arriba (" + rowIni + ", " + colIni + ")");

        } else if (rowIni < rowEnd && colIni == colEnd) {
            code = 3;
            System.out.println("Vertical-Abajo (" + rowIni + ", " + colIni + ")");

        } else if (rowIni == rowEnd && colIni > colEnd) {
            code = 4;
            System.out.println("Horizontal-Izquierda (" + rowIni + ", " + colIni + ")");

        } else if (rowIni > rowEnd && colIni > colEnd) {
            code = 5;
            System.out.println("Diagonal principal-Arriba (" + rowIni + ", " + colIni + ")");

        } else if (rowIni > rowEnd && colIni > colEnd) {
            code = 6;
            System.out.println("Diagonal principal-Abajo (" + rowIni + ", " + colIni + ")");
        } else if (rowIni < rowEnd && colIni > colEnd) {
            code = 7;
            System.out.println("Diagonal secundaria-Arriba (" + rowIni + ", " + colIni + ")");

        } else if (rowIni > rowEnd && colIni < colEnd) {
            code = 8;
            System.out.println("Diagonal secundaria-Abajo (" + rowIni + ", " + colIni + ")");
        }

        //Debo sacar el patron, inicio y final
        // de 3 a 8 horas del reloj pensando que son direcciones
        //tienes que contar que el inicio viene antes que el final
        //en el resto debes de contar de que el final viene antes que el inicio
        //Debes hacer swap

        pintarMatriz(rowIni, colIni, rowEnd, colEnd, code, palabra, matriz);

        return true;
    }

    private static void buscarPalabra(String[][] matriz, String palabra) {
        //Separamos la palabra por letras y las introducimos en un vector
        String letras[] = palabra.split("");

        boolean palabraEncontrada = false;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {

                //Si el valor de la celda coincide con la letra de la palabra
                if (matriz[x][y].equals(letras[0])) {

                    //Recorremos (0,0) Vertical-Arriba
                    palabraEncontrada = recorrerVecinos(matriz, x, y, -1, 0, letras);

                    //Si no la encuentra
                    //Recorremos (3,0) Diagonal secundaria-Arriba
                    if (!palabraEncontrada) {
                        palabraEncontrada = recorrerVecinos(matriz, x, y, -1, 1, letras);
                    }

                    //Si no la encuentra
                    //Recorremos (1,0) Horizontal-Derecha
                    if (!palabraEncontrada) {
                        palabraEncontrada = recorrerVecinos(matriz, x, y, 0, 1, letras);

                    }

                    //Si no la encuentra
                    //Recorremos (2,1) Diagonal principal-Abajo
                    if (!palabraEncontrada) {
                        palabraEncontrada = recorrerVecinos(matriz, x, y, 1, 1, letras);
                    }

                    //Si no la encuentra
                    //Recorremos (0,1) Vertical-Abajo
                    if (!palabraEncontrada) {
                        palabraEncontrada = recorrerVecinos(matriz, x, y, 1, 0, letras);
                    }

                    //Si no la encuentra
                    //Recorremos (3,1) Diagonal secundaria-Abajo
                    if (!palabraEncontrada) {
                        palabraEncontrada = recorrerVecinos(matriz, x, y, 1, -1, letras);
                    }

                    //Si no la encuentra
                    //Recorremos (1,1) Horizontal-Izquierda
                    if (!palabraEncontrada) {
                        palabraEncontrada = recorrerVecinos(matriz, x, y, 0, -1, letras);
                    }

                    //Si no la encuentra
                    //Recorremos (2,0) Diagonal principal-Arriba
                    if (!palabraEncontrada) {
                        palabraEncontrada = recorrerVecinos(matriz, x, y, -1, -1, letras);
                    }
                }
            }
        }

    }

    private static String mostrarMatriz(String[][] matriz) {
        //Variable para mostrar la matriz
        String str = "";
        System.out.println("****** Tablero ******");

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {

                str += matriz[x][y] + " ";
            }
            str += "\n";
        }

        return str;
    }

    private static void rellenarMatriz(String[][] matriz, String textTotal) {
        //Introducimos todas las letras en un array
        String letras[] = textTotal.split(" ");

        //Introducimos el array dentro de la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = letras[x * matriz.length + y];
            }
        }
    }
}
