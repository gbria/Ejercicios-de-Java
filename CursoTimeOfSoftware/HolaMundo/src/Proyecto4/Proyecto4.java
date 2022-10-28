package Proyecto4;

public class Proyecto4 {
    static void Calculadora(int option) {
        boolean exit = false;

        switch (option) {
            case 0:
                System.out.println("Fin del programa");
                exit = true;
                break;
            case 1:
                Sumar();
                break;
            case 2:
                Restar();
                break;
            case 3:
                Multiplicar();
                break;
            case 4:
                Dividir();
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }

    static int LeerNumero(String texto) {
        boolean leido = false;
        int valor = 0;

        while (!leido) {
            try {
                System.out.print(texto);
                valor = Integer.parseInt(System.console().readLine());
                leido = true;
            } catch (Exception e) {
                System.out.println("Error: tienes que introducir un número");
            }
        }
        return valor;
    }

    static void Sumar() {
        int num1 = LeerNumero("Inserte primer sumando: ");
        int num2 = LeerNumero("Inserte segundo sumando: ");
        System.out.println("El resultado de la suma es: " + (num1 + num2));
    }

    static void Restar() {
        int num1 = LeerNumero("Inserte minuendo: ");
        int num2 = LeerNumero("Inserte sustraendo: ");
        System.out.println("El resultado de la resta es: " + (num1 - num2));
    }

    static void Multiplicar() {
        int num1 = LeerNumero("Inserte multiplicando: ");
        int num2 = LeerNumero("Inserte multiplicador: ");
        System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
    }

    static void Dividir() {
        int num1 = LeerNumero("Inserte divisor: ");
        int num2 = LeerNumero("Inserte dividendo: ");
        try {

            System.out.println("El resultado de la división es: " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("### Menu ###");
            System.out.println("0.- Salir");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");

            System.out.print("Opción: ");
            option = Integer.parseInt(System.console().readLine());

            Calculadora(option);
        } while (option != 0);
    }
}
