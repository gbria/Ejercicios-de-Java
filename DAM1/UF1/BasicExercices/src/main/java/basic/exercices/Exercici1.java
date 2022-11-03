package basic.exercices;

import java.util.Scanner;

public class Exercici1 {
    /**
     * Escriu un programa que llegeixi dos nombres enters, els multipliqui
     * i mostri el resultat per pantalla.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Resultado de una multiplicación");

        System.out.print("\nIntroduzca el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("\nOperación");
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
    }
}
