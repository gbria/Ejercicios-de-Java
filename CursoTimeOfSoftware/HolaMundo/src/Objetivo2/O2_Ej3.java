package Objetivo2;

public class O2_Ej3 {
    public static void main(String[] args) {
        System.out.println("Cómo te llamas?");
        System.out.print("Respuesta: ");
        String nombre = System.console().readLine();

        System.out.println("¿Cuántos años tienes?");
        System.out.print("Respuesta: ");
        String edad = System.console().readLine();

        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");
    }
}
