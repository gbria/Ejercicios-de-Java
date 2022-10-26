package Objetivo8;

public class O8_Ej2 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número");
        int num = Integer.parseInt(System.console().readLine());

        EsMayorQueCero(num);
    }

    static void EsMayorQueCero(int numero) {
        if (numero > 0) {
            System.out.println("El número es mayor que cero");
        } else {
            System.out.println("El número es inferior a cero");
        }
    }
}
