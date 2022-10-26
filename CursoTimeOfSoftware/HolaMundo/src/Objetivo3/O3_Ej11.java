package Objetivo3;

public class O3_Ej11 {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;

        System.out.print("Introduce un número entero: ");
        numero1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce un número entero: ");
        numero2 = Integer.parseInt(System.console().readLine());

        System.out.println(numero1 + ">" + numero2 + "=" + (numero1>numero2));
        System.out.println(numero1 + ">=" + numero2 + "=" + (numero1 >= numero2));
        System.out.println(numero1 + "<" + numero2 + "=" + (numero1 < numero2));
        System.out.println(numero1 + "<=" + numero2 + "=" + (numero1 <= numero2));
        System.out.println(numero1 + "==" + numero2 + "=" + (numero1 == numero2));
        System.out.println(numero1 + "!=" + numero2 + "=" + (numero1 != numero2));
    }
}
