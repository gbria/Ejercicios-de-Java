import java.util.Scanner;

public class Ejercicio6 {
    /**
     * Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es divisible entre 2");
        } else {
            System.out.println("El número no es divisible entre 2");
        }
    }
}
