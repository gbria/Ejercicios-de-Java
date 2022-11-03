package basic.exercices;

import java.util.Scanner;

/**
 * Reescriu el programa anterior per tal que els números demanats a l'usuari siguin valors reals.
 * (a) Què passa amb el valor del residu?
 */
public class Exercici5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Operaciones con divisiones");
        System.out.print("Introduzca el primer número: ");
        float num1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        float num2 = sc.nextInt();

        System.out.println();
        System.out.println("Resultado de la división: " + num1 + " / " + num2 + " = " + num1 / num2);
        System.out.println("Resultado del residuo: " + num1 + " % " + num2 + " = " + num1 % num2);

        /* (a) Qué passa amb el valor del residu?
         *
         *       - Si multiplico el cociente por el divisor y le sumo
         *         el residuo dará como resultado el dividendo
         *
         *        "Supongo que me preguntas sobre eso..."
         * */
    }

}
