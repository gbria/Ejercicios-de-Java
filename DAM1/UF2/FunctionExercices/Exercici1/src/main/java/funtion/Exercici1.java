package funtion;

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el radio de la esfera: ");
        double radio = sc.nextDouble();

        double superficie = calcularSuperficie(radio);
        double volumen = calcularVolumen(radio);

        System.out.println("La superficie de la esfera es " + superficie);
        System.out.println("El volumen de la esfera es " + volumen);
    }

    static double calcularSuperficie(double radio) {
        return (4 * Math.PI) * (Math.pow(radio, 2));
    }

    static double calcularVolumen(double radio) {
        return ((4 * Math.PI) / 3) * (Math.pow(radio, 3));
    }
}
