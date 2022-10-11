package iterativeExercices;

import java.util.Scanner;

public class Exercici7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, tmp, fac = 1;

        do {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();

            if (num < 0) System.out.println("El número debe ser mayor o igual a 0");

            fac = num;
            while (num > 1) {
                num--;
                //System.out.println(fac + " * " + num );
                fac *= num;
            }

            System.out.println("Resultado factorial: " + fac);

        } while (num < 0);

    }
}
