import java.util.Scanner;

public class Ejercicios9 {
    /**
     * Lee un número por teclado que pida el precio de un producto (puede tener decimales)
     * y calcule el precio final con IVA. El IVA será una constante que será del 21%.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double IVA = 0.21;

        System.out.print("Introduzca el precio del producto: ");
        double precio = sc.nextDouble();

        double precioIva = precio * IVA;
        double precioTotal = precioIva + precio;

        System.out.println("El precio del producto con IVA es de " + precioTotal + "€");

    }
}
