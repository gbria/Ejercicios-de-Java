import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio13 {
    /**
     * Realiza una aplicación que nos pida un número de ventas a introducir,
     * después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
     * Al final mostrará la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
     */
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int venta = 1;
        double precio = 0, total = 0;


        System.out.println("Número de ventas");
        System.out.print("\nIntroduzca el número de ventas: ");
        int cantidad = sc.nextInt();

        while (venta <= cantidad) {
            System.out.print("Introduzca el precio de la venta número " + venta + ": ");
            precio = sc.nextDouble();
            total += precio;
            venta++;
        }
        System.out.println("\nEl precio del las " + (venta - 1) + " ventas es de " + df.format(total) + "€");

    }
}
