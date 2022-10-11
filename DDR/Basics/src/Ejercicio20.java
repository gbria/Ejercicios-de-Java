import java.util.Scanner;

public class Ejercicio20 {
    /**
     * Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede
     * dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5,
     * sin embargo, 17 si es primo. Un buen truco para calcular la raíz cuadrada del número e ir
     * comprobando que si es divisible desde ese número hasta 1.
     * <p>
     * NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("¿Es un número primo?");

        System.out.print("\nIntroduzca un número: ");
        int num = sc.nextInt();
        int raiz = (int) Math.sqrt(num);
        int contador = 0;




        System.out.println(raiz % contador == 0);


    }

}
