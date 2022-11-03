import java.util.Scanner;

public class Exercici7 {
    /**
     * Escriu un programa que llegeixi tres números i els mostri per pantalla ordenats de menor a major
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTemp;

        System.out.println("Ordenar 3 números de mayor a menor");

        System.out.print("\nIntroduzca el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Introduzca el tercer número: ");
        int num3 = sc.nextInt();

        if (num3 > num1) {
            numTemp = num1;
            num1 = num3;
            num3 = numTemp;
        }

        if (num3 > num2) {
            numTemp = num2;
            num2 = num3;
            num3 = numTemp;
        }

        if (num2 > num1) {
            numTemp = num1;
            num1 = num2;
            num2 = numTemp;
        }

        System.out.println("\nOrdenados de mayor a menor: " + num1 + " " + num2 + " " + num3);
    }
}
