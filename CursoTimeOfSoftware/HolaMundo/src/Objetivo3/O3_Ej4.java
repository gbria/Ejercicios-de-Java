package Objetivo3;

public class O3_Ej4 {
    public static void main(String[] args) {
        System.out.println("#### DIVISIÓN ENTERA ####");
        System.out.print("Dividendo (entero): ");
        int dividendo1 = Integer.parseInt(System.console().readLine());
        System.out.print("Divisor (entero): ");
        int divisor1 = Integer.parseInt(System.console().readLine());

        int resultado1 = dividendo1 / divisor1;
        System.out.println("Resultado de la división (entera): " + resultado1);
        System.out.println();

        System.out.println("#### DIVISIÓN REAL ####");
        System.out.print("Dividendo (real): ");
        float dividendo2 = Float.parseFloat(System.console().readLine());
        System.out.print("Divisor (real): ");
        float divisor2 = Float.parseFloat(System.console().readLine());

        float resultado2 = dividendo2 / divisor2;
        System.out.println("Resultado de la división (entera): " + resultado2);

    }
}
