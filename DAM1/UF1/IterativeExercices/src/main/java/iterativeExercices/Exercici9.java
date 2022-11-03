package iterativeExercices;

import java.util.Scanner;

public class Exercici9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SALIR = "S";

        String opcion;
        int num;
        int contNeg = 0, contPos = 0, contCero = 0;

        do {
            System.out.print("Introduzca un numero: ");
            num = sc.nextInt();

            if (num < 0) {
                contNeg++;
            } else if (num > 0) {
                contPos++;
            } else {
                contCero++;
            }

            System.out.println("Toque cualquier tecla para continuar o 'S' Para salir.");
            System.out.print("Opción: ");
            opcion = sc.next().toUpperCase();

        } while (!(opcion.equals(SALIR)));

        System.out.println("Resultados");
        System.out.println("Números positivos: " + contPos);
        System.out.println("Números negativos: " + contNeg);
        System.out.println("Números cero: " + contCero);

    }
}
