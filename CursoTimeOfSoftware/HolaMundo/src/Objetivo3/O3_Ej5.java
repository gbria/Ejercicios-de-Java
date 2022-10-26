package Objetivo3;

public class O3_Ej5 {
    public static void main(String[] args) {
        System.out.println("#### MÓDULO ####");
        System.out.print("Dividendo (entero): ");
        int dividendo = Integer.parseInt(System.console().readLine());
        System.out.print("Divisor (entero): ");
        int divisor = Integer.parseInt(System.console().readLine());

        int resultado = dividendo % divisor;
        System.out.println("Resultado deL módulo: " + resultado);
    }
}
