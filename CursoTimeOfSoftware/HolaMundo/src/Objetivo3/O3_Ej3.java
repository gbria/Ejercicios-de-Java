package Objetivo3;

public class O3_Ej3 {
    public static void main(String[] args) {
        System.out.println("#### RESTA ENTERA ####");
        System.out.print("Minuendo (entero): ");
        int minuendo1 = Integer.parseInt(System.console().readLine());
        System.out.print("Sustraendo (entero): ");
        int sustraendo1 = Integer.parseInt(System.console().readLine());

        int resultado1 = minuendo1 - sustraendo1;
        System.out.println("Resultado de la resta (entera): " + resultado1);
        System.out.println();

        System.out.println("#### RESTA REAL ####");
        System.out.print("Minuendo (real): ");
        float minuendo2 = Float.parseFloat(System.console().readLine());
        System.out.print("Sustraendo (real): ");
        float sustraendo2 = Float.parseFloat(System.console().readLine());

        float resultado2 = minuendo2 - sustraendo2;
        System.out.println("Resultado de la resta (real): " + resultado2);

    }
}
