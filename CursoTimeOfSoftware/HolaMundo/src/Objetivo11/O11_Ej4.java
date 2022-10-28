package Objetivo11;

public class O11_Ej4 {
    public static void main(String[] args) {
        System.out.println("Iniciando programa");
        try {
            int valor1 = 3;
            int valor2 = 1;
            int resultado = valor1 / valor2;
            System.out.println(resultado);
        } catch (Exception e){
            System.out.println("ERROR: División entre 0");
        } finally {
            System.out.println("Finalizando programa");
        }
    }
}
