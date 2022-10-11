package basic.exercices;

import java.util.Scanner;

/**
 * Escriu un programa que demani a l'usuari dos valors reals. El primer correspondrà a l'alçada d'un
 * rectangle i el segon, a la seva amplada. Un cop obtinguts aquests valors, el programa ha de calcular i
 * mostrar per pantalla l'àrea i el perímetre del rectangle.
 */
public class Exercici2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Area y perímetro de un rectángulo");

        System.out.println();
        System.out.print("Introduzca la base: ");
        float base = sc.nextFloat();

        System.out.print("Introduzca la altura: ");
        float altura = sc.nextFloat();

        System.out.println();
        System.out.println("El área del rectángulo es de: " + (base * altura));
        System.out.println("El perímetro del rectángulo es de: " + ((base * 2) + (altura * 2)));

    }

}
