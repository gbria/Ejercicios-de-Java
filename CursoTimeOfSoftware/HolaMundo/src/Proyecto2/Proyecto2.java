package Proyecto2;

public class Proyecto2 {
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

    static int SolicitarNumero() {
        System.out.print("Introduzca un numero: ");
        return Integer.parseInt(System.console().readLine());
    }

    static void Sumar() {
        int num1 = SolicitarNumero();
        int num2 = SolicitarNumero();
        System.out.println("El resultado de la suma es: " + (num1 + num2));
    }

    static void Restar() {
        int num1 = SolicitarNumero();
        int num2 = SolicitarNumero();
        System.out.println("El resultado de la resta es: " + (num1 - num2));
    }

    static void Multiplicar() {
        int num1 = SolicitarNumero();
        int num2 = SolicitarNumero();
        System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
    }

    static void Dividir() {
        int num1 = SolicitarNumero();
        int num2 = SolicitarNumero();
        System.out.println("El resultado de la división es: " + (num1 / num2));
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
