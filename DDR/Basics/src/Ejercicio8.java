import java.util.Scanner;

public class Ejercicio8 {
    /**
     * Modifica el ejercicio anterior, para que en lugar de pedir un número,
     * pida un carácter (char) y muestre su código en la tabla ASCII.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un carácter: ");
        char caracter = sc.next(".").charAt(0);
        int numero = caracter;

        System.out.println("El carácter '" + caracter + "' corresponde al número '" + numero + "'");
    }
}
