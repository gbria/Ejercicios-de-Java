package funcions;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int option, num;

        //Contenido del menú
        while (exit == false) {
            System.out.println("~~~~ MENÚ ~~~~");
            System.out.println("0. Sortir");
            System.out.println("1. Calcular el factorial d’un nombre enter positiu");
            System.out.println("2. Calcular la sèrie numèrica");
            System.out.print("Opció: ");
            option = sc.nextInt();

            //Llamada del método switch
            switch (option) {
                case 0:
                    //En el caso 0 se cerrará el programa
                    System.out.println("Sortin del programa");
                    exit = true;
                    break;

                case 1:
                    //Petición del número
                    System.out.print("Introdueixi el número: ");
                    num = sc.nextInt();

                    //Comprobación del negativo mediante método
                    if (comprobarNegativo(num)) {
                        System.out.println("El número es negatiu");
                    } else {
                        //En caso de número positivo, calculamos su factorial mediante función
                        System.out.println("El número factorial es el " + calcularFactorial(num));
                    }
                    break;

                case 2:
                    //Calcular la serie numérica [ 1-X ^2/2!+ X ^4/4! -...]
                    System.out.print("Introdueixi el número: ");
                    num = sc.nextInt();
            }

        }

    }

    private static boolean comprobarNegativo(int num) {
        if (num < 0) return true;
        return false;
    }

    private static int calcularFactorial(int num) {
        for (int i = num - 1; i > 0; i--) {
            num *= i;
        }
        return num;
    }

}



