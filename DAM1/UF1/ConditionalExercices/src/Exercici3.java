import java.util.Scanner;

public class Exercici3 {
    /**
     * Escriu un programa que executi els passos següents:
     * 1. Demani a l’usuari que entri un número
     * 2. Si el número té un valor entre el 0 i el 10 és mostrarà per pantalla la paraula “blau”
     * 3. Si el número té un valor entre l’11 i el 20 és mostrarà per pantalla la paraula “verd”
     * 4. Si el número té un valor entre el 21 i el 30 és mostrarà per pantalla la paraula “vermell”
     * 5. Si és qualsevol altre número es mostrarà per pantalla el missatge “opció incorrecta”
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();

        if(num >= 0 && num <= 10) System.out.println("azul");
        else if (num > 10 && num <= 20) System.out.println("verde");
        else if (num > 20 && num <= 30) System.out.println("rojo");
        else System.out.println("opción incorrecta");

    }
}
