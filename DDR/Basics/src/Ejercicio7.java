import java.util.Scanner;

public class Ejercicio7 {
    /**
     * Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
     * Por ejemplo: si introduzco un 97, me muestre una a.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        char caracter = (char) num;

        System.out.println("El número " + num + " corresponde al carácter '" + caracter + "'");
    }

}
