package Proyecto1;

public class Proyecto1 {
    public static void main(String[] args) {
        int option;

        System.out.println("### PROYECTO 1 : CALCULADORA ###");
        do {
            System.out.println("### Menu ###");
            System.out.println("0.- Salir");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.print("Introduzca opción: ");
            option = Integer.parseInt(System.console().readLine());
            switch (option) {
                case 0:
                    System.out.println("Fin del programa");
                    break;
                case 1:
                    System.out.println("### Sumar ###");
                    System.out.print("Introduzca sumando: ");
                    int sumando1 = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduzca sumando: ");
                    int sumando2 = Integer.parseInt(System.console().readLine());

                    System.out.println("El resultado de " + sumando1 + "+" + sumando2 + "=" + (sumando1 + sumando2));
                    break;
                case 2:
                    System.out.println("### Restar ###");
                    System.out.print("Introduzca minuendo: ");
                    int minuendo = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduzca sustraendo: ");
                    int sustraendo = Integer.parseInt(System.console().readLine());

                    System.out.println("El resultado de " + minuendo + "-" + sustraendo + "=" + (minuendo - sustraendo));
                    break;
                case 3:
                    System.out.println("### Multiplicar ###");
                    System.out.print("Introduzca multiplicando: ");
                    int multiplicando = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduzca multiplicador: ");
                    int multiplicador = Integer.parseInt(System.console().readLine());

                    System.out.println("El resultado de " + multiplicando + "x" + multiplicador + "=" + (multiplicando * multiplicador));
                    break;
                case 4:
                    System.out.println("### Dividir ###");
                    System.out.print("Introduzca dividendo: ");
                    int dividendo = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduzca divisor: ");
                    int divisor = Integer.parseInt(System.console().readLine());

                    System.out.println("El resultado de " + dividendo + ":" + divisor + "=" + (dividendo / divisor));
                    break;
                default:
                    System.out.println("La opción es incorrecta");
                    break;
            }
        } while (option != 0);
    }
}
