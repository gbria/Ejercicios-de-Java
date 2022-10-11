package iterativeExercices;

import java.util.Scanner;

/**
 * Escriu un programa que demani a l'usuari un nombre enter positiu (mostrar error i finalitzar en cas
 * que el número no compleixi aquesta condició). Un cop obtingut el número, el programa mostrarà per
 * pantalla el mateix valor amb els dígits canviats d'ordre. És a dir, si l'usuari ha introduït el valor 258, el
 * programa mostrarà 852.
 */

public class Exercici8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, division, contador = 0; //Variables para primer algoritmo 1
        int num, mod, tmp, total = 0; //Variables para segundo algoritmo 2

        System.out.println("Introduzca un número entero");
        System.out.print("Número: ");
        int numtmp = sc.nextInt();
        num = numtmp;


        /**
         * Algoritmo 1: ¿De cuántos dígitos consta el número introducido?
         */
        while (numtmp > 0) {
            temp = numtmp / 10;
            division = temp;
            numtmp = division;
            contador++;
        }
        //Respuesta
        //System.out.println("El número tiene " + contador + " dígitos");


        /**
         * Algoritmo 2: Invertir el número mediante residuo, division y potencia.
         */
        while (num > 0) {
            contador--;
            tmp = num % 10;
            mod = num / 10;
            num = mod;
            total += ((int) Math.pow(10, contador) * tmp);

            //System.out.println("Vuelta numero " + contador + ": tmp= " + tmp + ", mod= " + mod + ", num= " + num + ", total= " + total);

        }
        System.out.println("Número invertido: " + total);
    }
}
