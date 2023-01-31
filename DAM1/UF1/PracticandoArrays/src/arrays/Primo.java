package arrays;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número a comprobar: ");
        int numero = sc.nextInt();

        if (comprobarPrimo(numero)) {
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " no es primo");
        }

    }

    private static boolean comprobarPrimo(int numero) {
        //Si el numero es menor o igual a 1 no es primo
        if (numero <= 1) {
            return false;
        }

        int contador = 0;

        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador < 1;
    }
}
