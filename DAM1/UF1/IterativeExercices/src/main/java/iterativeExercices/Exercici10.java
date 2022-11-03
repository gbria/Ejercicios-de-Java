package iterativeExercices;

import java.util.Scanner;

/**
 * Escriu un programa que mostri per pantalla els t primers termes de la successió de Fibonacci. El valor
 * de t l'introdueix l'usuari i ha de ser un valor positiu superior a 0, per tant, cal gestionar el possible error.
 * Recordeu que aquesta successió té el següent aspecte:
 * 0 1 1 2 3 5 8 13 24...
 * (Cada terme és igual a la suma dels 2 anteriors, començant sempre per "0 1")
 */
public class Exercici10 {
    /**
     * 3 Condiciones
     * <p>
     * Condicion 0 = No puede realizarse con números menores a 0
     * Condicion 1 ( numero 1 = 0 );
     * Condicion 2 ( numero 2 = 1 );
     * Condicion 3 ( numero 3 = numero 1 + numero 2 )
     * etc.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num1 = 0, num2 = 1, num3, contador = 3;

        System.out.println("Sucesión de Fibonacci");
        System.out.println("Introduce cantidad de número a mostrar");
        System.out.print("Numero: ");
        num = sc.nextInt();

        //Condiciones
        if (num < 0) {
            System.out.println("La sucesión de Fibonacci no puede realizarse con número menores a 0");
        } else if (num == 0) {
            System.out.println("Sucesión de Fibonacci: " + num);
        } else if (num == 1) {
            System.out.println("Sucesión de Fibonacci: " + num);
        } else if (num > 1) {
            System.out.print("Sucesión de Fibonacci: " + num1 + " " + num2 + " ");

            while (num >= contador) {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
                contador++;
                /*
                System.out.println("Operación num3 = " + num1 + " + " + num2 + "= " + num3);
                System.out.println("Nuevo numero 1: " + num1);
                System.out.println("Nuevo numero 2: " + num2);
                 */

                System.out.print(num3 + " ");
            }


        }


    }
}
