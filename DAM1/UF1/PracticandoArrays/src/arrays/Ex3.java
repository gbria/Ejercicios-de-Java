package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CAPACIDAD = 10;

        int vector[] = new int[CAPACIDAD];

        rellenarMatriz(vector);

        System.out.println("Vector original");
        System.out.println(mostrarVector(vector));

        //Ordenamos array
        ordenarVector(vector);

        System.out.println("Vector ordenado");
        System.out.println(mostrarVector(vector));

        //Mostramos el más pequeño y el más grande
        System.out.println("Número más pequeño: " + vector[0]);
        System.out.println("Número más grande: " + vector[vector.length - 1]);

    }

    private static void ordenarVector(int[] vector) {
        Arrays.sort(vector);
    }

    private static String mostrarVector(int[] vector) {
        String str = "";

        for (int i = 0; i < vector.length; i++) {
            str += vector[i] + " ";
        }
        return str;
    }

    private static void rellenarMatriz(int[] vector) {
        Random rnd = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(-100, 100 + 1);
        }
    }
}
