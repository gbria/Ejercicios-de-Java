package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBuscar, capacidad;

        do {
            System.out.print("Introduzca capacidad del vector: ");
            capacidad = sc.nextInt();
        } while (capacidad <= 0);


        //Creamos el vector y le asignamos capacidad
        int vector[] = new int[capacidad];

        rellenarVector(vector);

        System.out.println("\nIntroduzca número a buscar: ");
        numBuscar = sc.nextInt();

        int contador = buscarNumero(vector, numBuscar);

        System.out.println("El número " + numBuscar + " se ha encontrado " + contador + " veces");


    }

    private static int buscarNumero(int[] vector, int numBuscar) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numBuscar) {
                contador++;
            }
        }
        return contador;
    }

    private static void rellenarVector(int[] vector) {
        Random rnd = new Random();

        for (int i = 0; i < vector.length; i++) {
            //System.out.print((vector[i] = rnd.nextInt(1, 100 + 1)) + " ");
            vector[i] = rnd.nextInt(1, 100 + 1);
        }
    }
}
