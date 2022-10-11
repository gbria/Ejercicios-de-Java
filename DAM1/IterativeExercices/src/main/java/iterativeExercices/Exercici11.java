package iterativeExercices;

import java.util.Scanner;

/**
 * Escriu un programa que demani a l'usuari dos nombres enters positius num1 i num2. Si la condició no es
 * compleix, s'avisarà a l'usuari i es tornaran a demanar dos nombres més fins que siguin correctes.
 * <p>
 * Un cop fet això, el programa en calcularà el Màxim Comú Divisor implementant un algorisme ineficient
 * però efectiu:
 * <p>
 * 1. Trobar el mínim entre num1 i num2
 * 2. A partir d'aquest valor mínim, buscar, de manera decreixent, el primer número que divideixi a tots
 * dos valors de manera exacta.
 */

public class Exercici11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, mayor;
        System.out.println("Máximo común divisor");


        //Comprobar números positivos
        do {
            System.out.print("Introduzca primer número: ");
            num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("El número tiene que ser positivo");
            }
        } while (num1 < 0);

        do {
            System.out.print("Introduzca primer número: ");
            num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("El número tiene que ser positivo");
            }
        } while (num2 < 0);


        //Saber qué número es mayor
        if (num1 <= num2) {
            mayor = num2;
        } else {
            mayor = num1;
        }


        //Buscar el último divisor de forma decreciente
        for (int i = mayor; i > 0; i--) {
            //System.out.println(i);
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("El Máximo común divisor es: " + i);
                break;
            }
        }
    }
}
