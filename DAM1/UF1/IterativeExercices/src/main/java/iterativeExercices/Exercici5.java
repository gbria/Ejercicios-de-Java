package iterativeExercices;

import java.util.Random;
import java.util.Scanner;

/**
 * Escriu un programa que calculi un valor enter aleatori (analitzar la classe Random) i que vagi demanant
 * nombres enters a l'usuari fins que l'encerti o consumeixi 20 intents.
 * En cas que encerti el número, caldrà avisar-lo de què ha guanyat el joc. En cas contrari, se li mostrarà
 * el missatge
 * <p>
 * Intents esgotats, el nombre que calia encertar era el ...
 */
public class Exercici5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        final int BOUND = 10;
        int adivina = rnd.nextInt(BOUND);
        int usuario, contador = 1;

        System.out.println("Número generado: " + adivina);
        System.out.println("Descubre el número generado aleatoriamente");

        do {
            System.out.println("Intento " + contador + ": ");
            System.out.print("Introduce el numero: ");
            usuario = sc.nextInt();

            contador++;
        } while (usuario != adivina && contador != 21);

        if (contador == 21) {
            System.out.println("Has agotado los intentos. El número era el " + adivina);
        } else {
            System.out.println("Felicitaciones!");
            System.out.println("El número es el " + adivina + "!!");
        }
    }
}
