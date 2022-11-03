import java.util.Scanner;

public class Exercici2 {
    /**
     * Reescriu el programa anterior per tal que el missatge que es mostri per pantalla sigui el següent:
     * - “El número no és ni un 5 ni un 6”: en cas que el número inserit sigui diferent de 5 i de 6
     * - “El número és un 5 o un 6”: en cas que el número inserit sigui, realment, un 5 o un 6.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Números enteros");

        System.out.print("\nIntroduzca un número entero: ");
        int num = sc.nextInt();

        if (num ==5 || num == 6) System.out.println("El número introducido es 5 o un 6");
        else System.out.println("El número no es ni un 5 ni un 6");

    }
}
