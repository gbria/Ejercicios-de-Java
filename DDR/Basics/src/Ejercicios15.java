import java.util.Scanner;

public class Ejercicios15 {
    /**
     * Lee un número por teclado y comprueba que este número es mayor o igual que cero,
     * si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduzca un mayor o igual a cero: ");
            num = sc.nextInt();

        } while (num < 0);

        System.out.println("El número es " + num);

    }
}
