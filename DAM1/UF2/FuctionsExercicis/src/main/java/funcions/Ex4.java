package funcions;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int option, fact, x;

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
                    fact = sc.nextInt();

                    //Comprobación del negativo mediante método
                    if (comprobarNegativo(fact)) {
                        System.out.println("El número es negatiu");
                    } else {
                        //En caso de número positivo, calculamos su factorial mediante función
                        System.out.println("El número factorial es el " + calcularFactorial(fact));
                    }
                    break;

                case 2:
                    //Calcular la serie numérica [ 1-X ^2/2!+ X ^4/4! -...]
                    System.out.print("Introdueixi el número X: ");
                    x = sc.nextInt();

                    System.out.print("Introdueixi quantitat N: ");
                    int n = sc.nextInt();

                    calcularSerieFactorial(x, n);
            }

        }

    }

    private static String calcularSerieFactorial(int x, int n) {
        int resultado = 1;
        try {
            for (int i = 1, j = 2; i <= n - 1; i++, j += 2) {
                if (i % 2 == 0) {
                    resultado += +((int) Math.pow(x, j) / calcularFactorial(j));
                } else {
                    resultado += -((int) Math.pow(x, j) / calcularFactorial(j));
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("ERROR: El número no pudo dividirse entre 0. \n" + e);
        } finally {
            return "El resultado es " + resultado;
        }
    }

    private static String serieNumerica(int num) {
        //[1-X ^2/2!+ X ^4/4! -...]
        return null;
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



