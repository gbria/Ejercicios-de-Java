package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CAPACIDAD = 20;
        int vector[] = new int[CAPACIDAD];

        //Rellenamos vector original
        rellenarVector(vector);

        //Mostramos vector original
        System.out.println("Vector original");
        System.out.println(mostrarVector(vector));

        //Rellenamos un vector de primos
        String vectorPrimos[] = RellenarvectorDePrimos(vector);

        //Mostramos vector de primos
        System.out.println("Vector de números primos");
        System.out.println(mostrarVectorPrimos(vectorPrimos));

    }

    private static String mostrarVectorPrimos(String[] vectorPrimos) {
        String str = "[";
        for (int i = 0; i < vectorPrimos.length; i++) {
            if (i <= vectorPrimos.length - 2) {
                str += vectorPrimos[i] + ", ";
            } else {
                str += vectorPrimos[i];
            }
        }
        str += "]";
        return str;
    }


    private static String[] RellenarvectorDePrimos(int[] vector) {
        String str = "";


        for (int i = 0; i < vector.length; i++) {
            if (numeroPrimo(vector[i])) {
                str += vector[i] + " ";
            }
        }

        String vectorPrimos[] = str.split(" ");
        return vectorPrimos;

    }

    private static boolean numeroPrimo(int numero) {
        //Si el número es menor o igual a 1 no lo contaremos como primo
        if (numero <= 1) {
            return false;
        }

        int contador = 0;

        //Empezamos modular el número a partir de su raíz cuadrada y vamos bajando
        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % 1 == 0) {
                contador++;
            }
        }

        //Si el contador de divisibles es menor que 1 entonces es primo
        return contador < 1;
    }

    private static String mostrarVector(int[] vector) {
        String str = "[";

        for (int i = 0; i < vector.length; i++) {
            if (i <= vector.length - 2) {
                str += vector[i] + ", ";
            } else {
                str += vector[i];
            }
        }
        str += "]";
        return str;
    }

    private static void rellenarVector(int[] vector) {
        Random rnd = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(0, 99 + 1);
        }
    }
}
