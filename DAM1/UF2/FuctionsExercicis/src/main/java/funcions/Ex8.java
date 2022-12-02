package funcions;

import java.util.Scanner;

public class Ex8 {
    /**
     * Escriu un programa que generi cadenes de caràcters seguin un conjunt de normes:
     * <p>
     * 1. Demanar a l’usuari una cadena inicial que només contingui els caràcters L i R
     * 2. Demanar a l’usuari quantes iteracions vol fer
     * 3. Per cada iteració, s’analitzarà la cadena actual i, cada L se substituirà per la cadena LRL i cada R se
     * substituirà per la cadena RRL.
     * 4. Un cop calculat el resultat final, mostrar-lo per pantalla
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkText = false;
        String cadena;

        System.out.println("Introduzca la cadena de texto: ");
        cadena = sc.nextLine().toUpperCase();

        comprobarCadena(cadena);

    }

    private static void comprobarCadena(String cadena) {
        char[] charSt = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {

            charSt[i] = cadena.charAt(i);
            char character = charSt[i];
        }



    }
}
