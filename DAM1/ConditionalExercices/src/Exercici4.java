import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercici4 {
    /**
     * Escriu un programa que demani a l’usuari dos valors reals. El primer correspondrà a l’alçada d’un
     * rectangle i el segon, a la seva amplada. Un cop obtinguts aquests valors, el programa ha de calcular i
     * mostrar per pantalla l’àrea i el perímetre del rectangle.
     * <p>
     * A més a més, cal que detecti si els valors són iguals i, en cas que sigui així, mostrar per pantalla el
     * missatge següent: “la figura geomètrica és un quadrat”.
     */

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Área y perímetro de un rectángulo o cuadrado");

        System.out.print("\nIntroduzca altura: ");
        double altura = sc.nextDouble();

        System.out.print("Introduzca base: ");
        double base = sc.nextDouble();

        double area = base * altura;
        double perimetro = base * 2 + altura * 2;

        if (base == altura) {
            System.out.println("La figura es un cuadrado");
            System.out.println("Su área es de: " + df.format(area));
            System.out.println("Su perímetro es de: " + df.format(perimetro));
        } else {
            System.out.println("La figura es un rectángulo");
            System.out.println("Su área es de: " + df.format(area));
            System.out.println("Su perímetro es de: " + df.format(perimetro));
        }

    }
}
