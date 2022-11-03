package iterativeExercices;

/**
 * Escriu un programa que mostri tots els múltiples de 5 que hi ha entre l'1 i el 100 (valors inclosos).
 */
public class Exercici1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

}
