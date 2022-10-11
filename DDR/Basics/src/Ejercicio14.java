import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio14 {
    /**
     * Realiza una aplicación que nos calcule una ecuación de segundo grado.
     * Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante
     * (operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math.
     * Te recomiendo que utilices mensajes de traza.
     */
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ecuación de segundo grado");

        System.out.print("\nIntroduzca el valor de 'a': ");
        double a = sc.nextDouble();

        System.out.print("Introduzca el valor de 'b': ");
        double b = sc.nextDouble();

        System.out.print("Introduzca el valor de 'c': ");
        double c = sc.nextDouble();

        double discriminante = Math.pow(b, 2) - (4 * a * c);
        double raiz = Math.sqrt(discriminante);
        double x1 = (-b + raiz) / (2 * a);
        double x2 = (-b - raiz) / (2 * a);


        if (discriminante < 0) {
            System.out.println("\nLa operación no tiene solución");
        } else {
            System.out.println("\nEl valor de x1 es: " + df.format(x1));
            System.out.println("El valor de x2 es: " + df.format(x2));
        }
    }
}
