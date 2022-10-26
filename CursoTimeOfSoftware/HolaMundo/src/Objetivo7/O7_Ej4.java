package Objetivo7;

public class O7_Ej4 {
    public static void main(String[] args) {
        int valor;


        do {

            System.out.print("Introduzca un número mayor a 100: ");
            valor = Integer.parseInt(System.console().readLine());

        }while (valor<=100);

        System.out.println("El número es mayor a 100");
        System.out.println("Fin del programa");
    }
}
