package Objetivo3;

public class O3_Ej1 {
    public static void main(String[] args) {
        System.out.println("#### SUMA ENTERA ####");
        System.out.print("Primer sumando (entero): ");
        int sumando1 = Integer.parseInt(System.console().readLine());
        System.out.print("Segundo sumando (entero): ");
        int sumando2 = Integer.parseInt(System.console().readLine());

        int resultado1 = sumando1 + sumando2;
        System.out.println("Resultado de la suma (entera): " + resultado1);
        System.out.println();

        System.out.println("#### SUMA REAL ####");
        System.out.print("Primer sumando (real): ");
        float sumando3 = Float.parseFloat(System.console().readLine());
        System.out.print("Segundo sumando (real): ");
        float sumando4 = Float.parseFloat(System.console().readLine());

        float resultado2 = sumando3 + sumando4;
        System.out.println("Resultado de la suma (real): " + resultado2);

    }
}
