package Objetivo3;

public class O3_Ej2 {
    public static void main(String[] args) {
        System.out.println("#### MULTIPLICACIÓN ENTERA ####");
        System.out.print("Multiplicando (entero): ");
        int multiplicando1 = Integer.parseInt(System.console().readLine());
        System.out.print("Multiplicador (entero): ");
        int multiplicador1 = Integer.parseInt(System.console().readLine());

        int resultado = multiplicando1 * multiplicador1;
        System.out.println("Resultado de la multiplicación (entera): " + resultado);
        System.out.println();

        System.out.println("#### MULTIPLICACIÓN REAL ####");
        System.out.print("Multiplicando (real): ");
        float multiplicando2 = Float.parseFloat(System.console().readLine());
        System.out.print("Multiplicador (real): ");
        float multiplicador2 = Float.parseFloat(System.console().readLine());

        float resultado2 = multiplicando2 * multiplicador2;
        System.out.println("Resultado de la multiplicación (real): " + resultado2);
    }
}
