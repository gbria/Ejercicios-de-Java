import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercici5 {
    /**
     * Escriu un programa que mostri per pantalla el preu final d’un producte, un cop aplicat l’IVA. Per fer-ho,
     * segueix els passos següents:
     * 1. Demana a l’usuari el nom i el preu (valor de tipus real) del producte
     * 2. Pregunta a l’usuari si és un producte de luxe o bàsic
     * 3. Si és un producte de luxe, caldrà aplicar el 21% d’IVA
     * 4. Si és un producte bàsic, caldrà aplicar el 4% d’IVA
     */

    private static final DecimalFormat df = new DecimalFormat("0.00");


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double LUXE = 0.21;
        final double BASIC = 0.04;

        double iva, total;

        System.out.println("Precio final de un producto");

        System.out.print("\nIntroduzca nombre del producto: ");
        String producto = sc.nextLine();

        System.out.print("Introduzca el precio: ");
        double precio = sc.nextDouble();

        System.out.println("\nEs un producto básico o de lujo?");
        System.out.println("\t 1- Básico");
        System.out.println("\t 2- Lujo");
        System.out.print("\t Introduzca el tipo: ");
        int tipo = sc.nextInt();

        switch (tipo) {
            case 1:
                iva = precio * BASIC;
                System.out.println("\nProducto: " + producto);
                System.out.println("Precio PVP: " + df.format(iva + precio) + "€");
                break;

            case 2:
                iva = precio * LUXE;
                System.out.println("\nProducto: " + producto);
                System.out.println("Precio PVP: " + df.format(iva + precio) + "€");
                break;

            default:
                System.out.println("El número introducido es erróneo");
                break;
        }
    }
}
