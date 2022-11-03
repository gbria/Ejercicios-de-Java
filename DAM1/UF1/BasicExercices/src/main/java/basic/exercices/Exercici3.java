package basic.exercices;

import java.util.Scanner;

/**
 * Escriu un programa que demani a l'usuari el radi d'un cercle (valor de tipus real). Un cop obtingut,
 * mostrarà per pantalla l'àrea i el perímetre d'aquest cercle.
 */
public class Exercici3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Área y perímetro de una circunferencia");

        System.out.print("\nIntroduzca el radio: ");
        double radio = sc.nextDouble();

        System.out.println();

        //Utilizamos el método Math.Round() para redondear los decimales
        System.out.println("El área de la circunferencia es de: " + (double) Math.round((Math.PI * Math.pow(radio, 2)) * 100d) / 100d);
        System.out.println("El perímetro de la circunferencia es de: " + (double) Math.round((2 * Math.PI * radio) * 100d) / 100d);

    }
}
