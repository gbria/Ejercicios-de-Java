package Objetivo11;

public class O11_Ej3 {
    public static void main(String[] args) {
        try {
            int valor1 = 3;
            int valor2 = 0;
            int resultado = valor1 / valor2;
        } catch (Exception e) {
            System.out.println("Error: División por cero");
        } finally {
            System.out.println("Fin del programa");
        }
    }
}
