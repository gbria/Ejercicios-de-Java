package Objetivo6;

public class O6_Ej1 {
    public static void main(String[] args) {
        System.out.println("Escriba un número de 1 al 10: ");
        int valor = Integer.parseInt(System.console().readLine());

        if (valor>10){
            System.out.println("¡El número escrito es mayor a 10! ¡Bribón!");
        }
        System.out.println("Has introducido el número: " + valor);
    }
}
