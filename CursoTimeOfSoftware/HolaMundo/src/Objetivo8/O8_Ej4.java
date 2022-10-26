package Objetivo8;

import java.util.Random;

public class O8_Ej4 {
    static int SolicitarNumero() {
        System.out.print("Introduzca un número: ");
        return Integer.parseInt(System.console().readLine());
    }

    static void Sumar() {
        int num1 = SolicitarNumero();
        int num2 = SolicitarNumero();
        System.out.println("Resultado: " + (num1 + num2));
    }

    public static void main(String[] args) {
        Sumar();
    }

}
