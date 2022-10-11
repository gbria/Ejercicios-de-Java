import java.util.Scanner;

public class Ejercicio19 {
    /**
     * Pide por teclado un número entero positivo (debemos controlarlo) y muestra el número
     * de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.
     * Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contador = 1, division, temp;

        do {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();
        } while (num < 0);

        while (num > 10) {
            temp = num / 10;
            division = temp;
            num = division;
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos");

    }
}

