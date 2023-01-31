package wordsearch;

import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0, auxNum = 0;
        String palabra = "", palabras = "";

        //Introducimos cantidad de palabras
        do {
            System.out.print("Cuantas palabras quiere introducir: ");
            cantidad = sc.nextInt();
        } while (cantidad <= 0);

        String palabros[] = new String[cantidad];

        //Limpiamos
        sc.nextLine();

        //Introducimos datos
        do {
            System.out.print("Introduzca la palabra: ");
            //Escanea la palabra
            palabra = sc.nextLine();

            //Guardamos la palabra en un vector
            palabros[auxNum] = palabra;

            //Guardamos las palabras
            //palabras += palabra + " ";

            //Aumentamos el número
            auxNum++;

        } while (auxNum < cantidad);

        //Mostramos el array
        for (int i = 0; i < palabros.length; i++) {
            System.out.println(palabros[i]);
        }

        //System.out.println(palabras);
    }

}
