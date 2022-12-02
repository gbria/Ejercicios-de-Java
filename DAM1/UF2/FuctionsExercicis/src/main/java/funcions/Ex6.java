package funcions;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    /**
     * Escriu un programa que comprovi si dues paraules són anagrames o no. Recordeu que dues paraules són
     * anagrames si contenen les mateixes lletres ordenades de manera diferent. Per exemple, en anglès, “Paris” i
     * “pairs” són anagrames.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la primera palabra: ");
        String cadena1 = sc.nextLine();

        System.out.print("Introduzca la segunda palabra: ");
        String cadena2 = sc.nextLine();

        if (comprobarAnagrama(cadena1, cadena2)) {
            System.out.println("Es un anagrama");
        } else {
            System.out.println("No es un anagrama");
        }
    }

    private static boolean comprobarAnagrama(String cadena1, String cadena2) {
        int[] array1 = new int[cadena1.length()];
        int[] array2 = new int[cadena2.length()];
        boolean checkAnagrama = false;

        if (cadena1.length() != cadena2.length()) {
            //Si las cadenas no tienen la misma cantidad de caracteres no hace falta seguir
            return checkAnagrama;

        } else {
            //ASCII de la primera cadena
            for (int i = 0; i < cadena1.length(); i++) {
                array1[i] = cadena1.codePointAt(i);
            }

            //ASCII de la segunda cadena
            for (int i = 0; i < cadena2.length(); i++) {
                array2[i] = cadena2.codePointAt(i);
            }

            //Ordenamos los dos arrays para simplificar el proceso de comparación
            Arrays.sort(array1);
            Arrays.sort(array2);

            //Comparamos arrays
            if (Arrays.compare(array1, array2) == 0) {
                checkAnagrama = true;
            }
        }
        return checkAnagrama;
    }
}
