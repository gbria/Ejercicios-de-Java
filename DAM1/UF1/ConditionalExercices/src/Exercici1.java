import java.util.Scanner;

public class Exercici1 {
    /**
     * Escriu un programa que demani a l’usuari que introdueixi un nombre enter. Un cop introduït, caldrà
     * dir a l’usuari si el nombre que ha escrit és un 5, un 6 o qualsevol altre número.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Números enteros");

        System.out.print("\nIntroduzca un número entero: ");
        int num = sc.nextInt();

        if (num == 5) System.out.println("El número introducido es 5");
        else if (num == 6) System.out.println("El número introducido es 6");
        else System.out.println("El número introducido es: " + num);

    }
}
