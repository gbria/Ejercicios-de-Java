package Objetivo3;

public class O3_Ej6 {
    public static void main(String[] args) {
        System.out.println("#### USO DE LOS PARÉNTESIS ####");

        System.out.print("Primer número (entero): ");
        int numero1 = Integer.parseInt(System.console().readLine());
        System.out.print("Segundo número (entero): ");
        int numero2 = Integer.parseInt(System.console().readLine());
        System.out.println("Tercer número (entero): ");
        int numero3 = Integer.parseInt(System.console().readLine());
        System.out.println("Cuarto número (entero): ");
        int numero4 = Integer.parseInt(System.console().readLine());

        int resultado1 = (numero1 * numero2) + numero3 / numero4;
        int resultado2 = numero1 * (numero2 + numero3 / numero4);
        int resultado3 = numero1 * (numero2 + numero3) / numero4;

        System.out.println("Resultado " + "(" + numero1 + "*" + numero2 + ")+" + numero3 + "/" + numero4 + "=" + resultado1);
        System.out.println("Resultado " + numero1 + "*(" + numero2 + "+" + numero3 + "/" + numero4 + ")=" + resultado2);
        System.out.println("Resultado " + numero1 + "*(" + numero2 + "+" + numero3 + ")/" + numero4 + "=" + resultado3);
    }
}
