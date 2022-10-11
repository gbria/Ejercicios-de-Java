import java.util.Scanner;

public class Ejercicio16 {
    /**
     * Escribe una aplicación con un String que contenga una contraseña cualquiera.
     * Después se te pedirá que introduzcas la contraseña, con 3 intentos.
     * Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo «Enhorabuena».
     * Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 3;
        String pwd, verificacion;
        int intentos = 1;

        System.out.print("Introduzca una contraseña: ");
        pwd = sc.next();

        do {
            System.out.print("Introduzca nuevamente su contraseña: ");
            verificacion = sc.next();

            if (verificacion.equals(pwd)) {
                System.out.println("Enhorabuena");
                intentos = MAX + 1;
            } else {
                System.out.println("Le quedan " + (MAX - intentos) + " intentos");
                intentos++;
            }
        } while (intentos <= MAX);

    }
}
