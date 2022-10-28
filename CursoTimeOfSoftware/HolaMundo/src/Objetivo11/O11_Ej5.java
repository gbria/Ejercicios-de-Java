package Objetivo11;

public class O11_Ej5 {
    public static void main(String[] args) {
        System.out.println("Iniciando programa");
        try {
            int valor1 = 3;
            int valor2 = 0;
            int resultado = valor1 / valor2;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("Finalizando programa");
        }
    }
}
