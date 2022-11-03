package basic.exercices;

/**
 * Escriu un programa que faci les operacions següents:
 * - -5 + 8 * 6
 * - (55 + 9) mod 9)
 * - 20 + -3 * 5/8
 * - 5 + 15/3 * 2 - 8 mod 3
 * - ((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5))
 *
 * (a) Fixeu-vos en l'ordre d'execució de les operacions (preferència).
 */
public class Exercici6 {
    public static void main(String[] args) {

        System.out.println("Op1: " + (-5 + 8 * 6));
        System.out.println("Op2: " + ((55 + 9) % 9));
        System.out.println("Op3: " + (20 + -3 * 5 / 8));
        System.out.println("Op4: " + (5 + 15 / 3 * 2 - 8 % 3));
        System.out.println("Op5: " + ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

    }

}
