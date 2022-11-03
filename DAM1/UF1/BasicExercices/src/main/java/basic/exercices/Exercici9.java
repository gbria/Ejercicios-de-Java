package basic.exercices;

import java.util.Scanner;

/**
 * Escriu un programa que demani dos nombres reals a l'usuari i els mostri per pantalla en l'ordre invers
 * a com han estat introduïts (cal intercanviar-los de variable fent el que es coneix com un swap).
 */
public class Exercici9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTemp;

        System.out.println("Swapping");

        System.out.print("Introduce primer número");
        int num1 = sc.nextInt();

        System.out.print("Introduce segundo número");
        int num2 = sc.nextInt();

        //Swapping
        numTemp = num1;
        num1 = num2;
        num2 = numTemp;

        System.out.print("Swapping: " + num1 + " " + num2);

    }

}
