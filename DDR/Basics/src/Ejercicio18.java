import java.util.Scanner;

public class Ejercicio18 {
    /**
     * Pide por teclado dos números y genera 10 números aleatorios entre esos números.
     * Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Números aleatorios");

        System.out.print("\nIntroduce el mínimo: ");
        int min = sc.nextInt();

        System.out.print("Introduce el máximo: ");
        int max = sc.nextInt();

        System.out.print("Números aleatorio ( ");
        for (int i = 0; i <= 10; i++) {
            int rnd = (int) (Math.random() * max + min);
            System.out.print(rnd + " ");
        }
        System.out.print(")");
    }
}
